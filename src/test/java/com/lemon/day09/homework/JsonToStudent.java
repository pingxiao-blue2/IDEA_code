package com.lemon.day09.homework;
import com.alibaba.fastjson.JSONObject;

/**
 1、String json = {"name": "张三", "age": "18", "score":"100"}; 解析成Student对象。
 **/
public class JsonToStudent {
    public static void main(String[] args) {
        String json = "{\"name\": \"张三\", \"age\": \"18\", \"score\":\"100\"}";
        Student s1 = JSONObject.parseObject(json, Student.class);
        System.out.println(s1);
    }
}
