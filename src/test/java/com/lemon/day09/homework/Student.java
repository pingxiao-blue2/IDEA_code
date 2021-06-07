package com.lemon.day09.homework;

/**
 1、String json = {"name": "张三", "age": "18", "score":"100"}; 解析成Student对象。

 2、String json = 	[{"name": "张三", "age": "18", "score":"100"},{"name": "李四", "age": "16", "score":"100"}] 解析成List<Student>对象。
**/
public class Student {
    private String name;
    private int age;
    private int score;
    public Student(){

    }
    public Student(String name, int age, int score){
        this.name = name;
        this.age = age;
        this.score = score;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        if (age <= 0){
            System.out.println("输入的年龄不合法");
        }else {
            this.age = age;
        }
    }
    public int getAge(){
        return age;
    }
    public void setScore(int score){
        if (score<=0){
            System.out.println("输入的分数不合法");
        }else {
            this.score = score;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
