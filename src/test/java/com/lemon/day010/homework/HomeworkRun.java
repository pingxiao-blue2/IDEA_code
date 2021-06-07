package com.lemon.day010.homework;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class HomeworkRun {
    public static void main(String[] args) throws Exception {
        //第一题
        //2、创建3个WriteBackData对象
        WriteBackData w1 = new WriteBackData(1, 2, "Pass");
        WriteBackData w2 = new WriteBackData(2, 2, "Fail");
        WriteBackData w3 = new WriteBackData(3, 2, "Pass");
        // 3、把w1、w2、w3放入ArrayList集合中。
        ArrayList<WriteBackData> list = new ArrayList<>();
        list.add(w1);
        list.add(w2);
        list.add(w3);
        //4、通过poi把ArrayList集合中的数据回写到exam.xls（请下载，不需要自己创建）文件中第一个Sheet。
        // 回写规则：按照WriteBackData对象的rowNum（行号）和cellNum（列号）回写对应的excel中，content（内容）是回写的具体内容。
        //用I/O流读excel文件
        FileInputStream file = new FileInputStream("src/test/resources/exam.xls");
        //通过POI解析得到excel对象
        Workbook sheets = WorkbookFactory.create(file);
        //关流
        file.close();
        //获取sheet页
        Sheet sheet = sheets.getSheetAt(0);
        for(WriteBackData w: list){
            //获取row
            Row row = sheet.getRow(w.getRowNum());
            //获取cell，如果是空指针忽略
            Cell cell = row.getCell(w.getCellNum(), Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
//            Cell cell = row.createCell(w.getCellNum());
            //修改内容
            cell.setCellValue(w.getContent());
        }
        //开输出流
        FileOutputStream fls = new FileOutputStream("src/test/resources/exam.xls");
        //回写内容
        sheets.write(fls);
        //关输出流
        fls.close();
        //第二题
        String s1 = "[{\"value\":0,\"expression\":\"$.code\"},{\"value\":\"OK\",\"expression\":\"$.msg\"}," +
                "{\"value\":\"OK\",\"expression\":\"OK\"}]";
        String s2 = " [{\"value\":\"OK\",\"expression\":\"OK\"},{\"value\":\"OK\",\"expression\":\"OK\"}," +
                "{\"value\":\"OK\",\"expression\":\"OK\"}]";
        //分别把s1、s2两个字符串转成两个List<JsonValidate>集合
        List<JsonValidate> lst1 = JSONObject.parseArray(s1,JsonValidate.class);
        List<JsonValidate> lst2 = JSONObject.parseArray(s2,JsonValidate.class);
        System.out.println(lst1);
        for (int i = 0; i < lst1.size(); i++) {
            //循环s1的List集合，如果value和expression相等则输出Pass，否则输出Fail。
            if(lst1.get(i).getExpression().equals(lst1.get(i).getValue())){
                System.out.println("Pass");
            }else {
                System.out.println("Fail");
            }
        }
    }
}
