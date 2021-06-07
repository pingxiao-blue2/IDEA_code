package com.lemon.day010.homework;

/**
 第二题
 1、有json字符串：
 String s1 = [{"value":0,"expression":"$.code"},{"value":"OK","expression":"$.msg"},{"value":"OK","expression":"OK"}]
 String s2 = [{"value":"OK","expression":"OK"},{"value":"OK","expression":"OK"},{"value":"OK","expression":"OK"}]
 2、分别把s1、s2两个字符串转成两个List<JsonValidate>集合,自己分析JsonValidate（自己创建）有哪些字段
 3、循环s1的List集合，如果value和expression相等则输出Pass，否则输出Fail。
 **/
public class JsonValidate {
    private String value;
    private String expression;

    public JsonValidate() {
    }

    public JsonValidate(String value, String expression) {
        this.value = value;
        this.expression = expression;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "JsonValidate{" +
                "value='" + value + '\'' +
                ", expression='" + expression + '\'' +
                '}';
    }
}
