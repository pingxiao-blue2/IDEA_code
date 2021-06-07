package com.lemon.day11.homework;

import org.testng.annotations.*;

/**
 1、用文字结合代码说明 @BeforeSuite @AfterSuite @BeforeTest @BeforeClass @BeforeMethod @AfterMethod 执行顺序
 **/
public class TestNg1 {
    @BeforeSuite//套件之前运行，第一个运行
    public void testBeforeSuite(){
        System.out.println("BeforeSuite------pass");
    }
    @AfterSuite//套件之后运行，所有运行完后运行，最后一个运行
    public void testAfterSuite(){
        System.out.println("AfterSuite------pass");
        System.out.println("----------AfterSuite------------");
    }
    @BeforeTest//开始测试之前运行，第二个运行
    public void testBeforeTest(){
        System.out.println("BeforeTest------pass");
    }
    @BeforeClass//测试类开始前运行，第三个运行
    public void testBeforeClass(){
        System.out.println("BeforeClass------pass");
    }
    @BeforeMethod//测试方法前运行，第四个运行
    public void testBeforeMethod(){
        System.out.println("BeforeMethod------pass");
    }
    @AfterMethod//方法运行完后运行，第六个运行
    public void testAfterMethod(){
        System.out.println("AfterMethod------pass");
        System.out.println("----------AfterMethod------------");

    }
    @Test//before的注解运行完后再运行，第五个运行
    public void test(){
        System.out.println("testNg1------pass");
    }

    @BeforeSuite
    public void testBeforeSuite2(){
        System.out.println("BeforeSuite2------pass");
    }
    @AfterSuite
    public void testAfterSuite2(){
        System.out.println("AfterSuite2------pass");
        System.out.println("----------AfterSuite2------------");


    }
    @BeforeTest
    public void testBeforeTest2(){
        System.out.println("BeforeTest2------pass");
    }
    @BeforeClass
    public void testBeforeClass2(){
        System.out.println("BeforeClass2------pass");
    }
    @BeforeMethod
    public void testBeforeMethod2(){
        System.out.println("BeforeMethod2------pass");
    }
    @AfterMethod
    public void testAfterMethod2(){
        System.out.println("AfterMethod2------pass");
        System.out.println("----------AfterMethod2------------");

    }
    @Test
    public void test2(){
        System.out.println("test2------pass");
    }


}
