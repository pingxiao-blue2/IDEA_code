package com.lemon.day09.homework;

import java.util.List;

/**
3、把下面json字符串解析成java对象（扩展题目，可以不做）
 { "name": "中国", "provinces": [{ "name": "黑龙江", "capital": "哈尔滨" }, { "name": "广东", "capital": "广州" }, { "name": "湖南", "capital": "长沙" }] }
 **/
public class Country {
    private String name;
    private List<Cities> provinces;

    public Country() {
    }

    public Country(String name, List<Cities> provinces) {
        this.name = name;
        this.provinces = provinces;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Cities> getProvinces() {
        return provinces;
    }

    public void setProvinces(List<Cities> provinces) {
        this.provinces = provinces;
    }
    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", provinces=" + provinces +
                '}';
    }
}
