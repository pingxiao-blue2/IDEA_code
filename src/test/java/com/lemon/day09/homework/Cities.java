package com.lemon.day09.homework;

/**
3、把下面json字符串解析成java对象（扩展题目，可以不做）
 { "name": "中国", "provinces": [{ "name": "黑龙江", "capital": "哈尔滨" }, { "name": "广东", "capital": "广州" }, { "name": "湖南", "capital": "长沙" }] }
 **/
public class Cities {
    private String name;
    private String capital;

    public Cities(String name, String capital) {
        this.name = name;
        this.capital = capital;
    }

    public Cities() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
    @Override
    public String toString() {
        return "Cities{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                '}';
    }
}
