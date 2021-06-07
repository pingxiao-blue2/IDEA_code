package com.lemon.day11.homework;

import org.testng.annotations.Test;

/**
 1、用文字结合代码说明 @BeforeSuite @AfterSuite @BeforeTest @BeforeClass @BeforeMethod @AfterMethod 执行顺序
 **/
public class TestNg2 {
    @Test
    public void testNg2test1(){
        System.out.println("testNg2test1------pass");
    }
    @Test
    public void testNg2test2(){
        System.out.println("testNg2test2------pass");
    }
    @Test
    public void testNg2test3(){
        System.out.println("testNg2test3------pass");
    }

}
