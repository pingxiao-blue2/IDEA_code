package com.lemon.day010.homework;

/**
 第一题 1、定义WriteBackData类有三个私有属性rowNum（行号）; cellNum（列号）;content（内容）;(10分)
 2、创建3个WriteBackData对象 (10分)
 w1：行号 1，列号 2，内容 Pass
 w2：行号 2，列号 2，内容 Fail
 w3：行号 3，列号 2，内容 Pass
 3、把w1、w2、w3放入ArrayList集合中。(10分)
 4、通过poi把ArrayList集合中的数据回写到exam.xls（请下载，不需要自己创建）文件中第一个Sheet。(30分)
 回写规则：按照WriteBackData对象的rowNum （行号）  和cellNum （列号）  回写对应的excel中， content（内容）  是回写的具体内容。

 **/
public class WriteBackData {
    private int rowNum;
    private  int cellNum;
    private String content;

    public WriteBackData() {
    }

    public WriteBackData(int rowNum, int cellNum, String content) {
        this.rowNum = rowNum;
        this.cellNum = cellNum;
        this.content = content;
    }

    public int getRowNum() {
        return rowNum;
    }

    public void setRowNum(int rowNum) {
        this.rowNum = rowNum;
    }

    public int getCellNum() {
        return cellNum;
    }

    public void setCellNum(int cellNum) {
        this.cellNum = cellNum;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "WriteBackData{" +
                "rowNum=" + rowNum +
                ", cellNum=" + cellNum +
                ", content='" + content + '\'' +
                '}';
    }
}
