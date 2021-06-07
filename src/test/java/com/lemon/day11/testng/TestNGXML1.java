package com.lemon.day11.testng;

import org.testng.annotations.*;

/**
 * @Project: java29_maven_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2020 版权所有 湖南省零檬信息技术有限公司
 * @Author: Administrator
 * @Create: 2021-05-19 21:39
 * @Desc：
 **/
public class TestNGXML1 {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("TestNGXML1.beforeSuite");
        System.out.println("整个项目的数据加载");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("TestNGXML1.afterSuite");
        System.out.println("项目结束之后资源释放");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("TestNGXML1.beforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("TestNGXML1.afterTest");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("TestNGXML1.beforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("TestNGXML1.afterClass");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("TestNGXML1.beforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("TestNGXML1.afterMethod");
    }


    @Test
    public void test() {
        System.out.println("TestNGXML1.test");
    }


}
