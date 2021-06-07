package com.lemon.day12.homework;

import org.testng.annotations.*;

/**
 3、用文字结合代码说明 @BeforeSuite @AfterSuite @BeforeTest @BeforeClass @BeforeMethod @AfterMethod 执行顺序
 执行顺序：@BeforeSuite -> @BeforeTest -> @BeforeClass -> @BeforeMethod -> 具体的测试方法 -> @AfterMethod -> @AfterSuite
 **/
public class TestNgHomework {
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
        System.out.println("testNg------pass");
    }




}
