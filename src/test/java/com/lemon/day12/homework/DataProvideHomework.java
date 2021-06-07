package com.lemon.day12.homework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 1、使用 @dataProvider 对 register(String username,String password,String type,String sex)方法 进行5次测试
 2、使用 @dataProvider 对 register(Student s)方法  进行3次测试 ,Student 有 username、password、type、sex 4个私有属性。
 3、用文字结合代码说明 @BeforeSuite @AfterSuite @BeforeTest @BeforeClass @BeforeMethod @AfterMethod 执行顺序
 **/
public class DataProvideHomework {
    //1、使用 @dataProvider 对 register(String username,String password,String type,String sex)方法 进行5次测试
    @Test(dataProvider = "data")
    @AfterClass
    public void register(String username,String password,String type,String sex){
        System.out.println("username = " + username + ", password = "+ password
        + ", type = " + type + ", sex = " + sex);
    }
    //定义二维数据，存放五组登录数据
    @DataProvider
    public Object[][] data(){
        Object[][] arr = {{"Lily","12345","chrome","female"},
                        {"Peter","23456","IE","male"},
                        {"Jack","56789","firefox","male"},
                        {"Rose","66666","chrome","female"},
                        {"Julie","88888","chrome","female"},};
        return arr;
    }
    //2、使用 @dataProvider 对 register(Student s)方法  进行3次测试 ,Student 有 username、password、type、sex 4个私有属性。
    @Test(dataProvider = "data2")
    public void register2(Student s){
        System.out.println(s);
    }
    //定义一为数组，存放Student的对象，存放登录数据
    @DataProvider
    public Object[] data2(){
        Student s1 = new Student("Lily","12345","chrome","female");
        Student s2 = new Student("Peter","23456","IE","male");
        Student s3 = new Student("Jack","56789","firefox","male");
        Object[] arr = {s1, s2, s3};
        return arr;

    }

}
