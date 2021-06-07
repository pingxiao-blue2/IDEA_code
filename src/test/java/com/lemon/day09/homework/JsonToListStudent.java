package com.lemon.day09.homework;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 2、String json = 	[{"name": "张三", "age": "18", "score":"100"},{"name": "李四", "age": "16", "score":"100"}] 解析成List<Student>对象。
**/
public class JsonToListStudent {
    public static void main(String[] args) {
        String json = "[{\"name\": \"张三\", \"age\": \"18\", \"score\":\"100\"},{\"name\": \"李四\", \"age\": \"16\", \"score\":\"100\"}]";
        List<Student> students = JSONObject.parseArray(json, Student.class);
        System.out.println(students);
        String json2 = "{ \"name\": \"中国\", \"provinces\": [{ \"name\": \"黑龙江\", \"capital\": \"哈尔滨\" }, " +
                "{ \"name\": \"广东\", \"capital\": \"广州\" }, { \"name\": \"湖南\", \"capital\": \"长沙\" }] }";
        Country country = JSONObject.parseObject(json2, Country.class);
        System.out.println(country);

    }

}
