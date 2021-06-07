package com.lemon.day010.homework;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**

 **/
public class ExcelWrite {
    public static void main(String[] args) throws Exception {
        /*
         *   1、用IO流去读excel文件（打开excel）
         *   2、POI解析excel文件得到 excel对象。
         *   3、获取sheet
         *   4、获取所有row
         *   5、获取所有cell
         *   6、修改内容
         * */
        //创建  修改

        //1、用IO流去读excel文件（打开excel）
        FileInputStream fis = new FileInputStream("src/test/resources/exam.xls");
        //2、POI解析excel文件得到 excel对象。
        //WorkbookFactory    xxxxFactory 工厂 instance
        //多态
        Workbook sheets = WorkbookFactory.create(fis);
        //关流
        fis.close();
        //3、获取sheet
        Sheet sheet = sheets.getSheetAt(0);
        //4、获取row
        Row row = sheet.getRow(1);
        //5、获取cell
        Cell cell = row.getCell(1);
        System.out.println(cell);
        System.out.println(row);
        //6、修改内容
//        cell.setCellValue("zhangsan");
//        //开输出开，就会清空文件。
//        FileOutputStream fos = new FileOutputStream("src/test/resources/exam.xls");
//        //回写
//        sheets.write(fos);
//        //关流
//        fos.close();
    }
}
