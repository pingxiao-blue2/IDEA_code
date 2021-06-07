package com.lemon.day11.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @Project: java29_maven_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2020 版权所有 湖南省零檬信息技术有限公司
 * @Author: Administrator
 * @Create: 2021-05-19 20:48
 * @Desc：
 **/
public class TestNGTestAnnotation {

//    @Test(alwaysRun = true,dependsOnMethods = {"test2"},description="123123",enabled = false)
//    @Test(groups={"V2"})
//    public void test() {
//        System.out.println("...........test");
//    }
//
//
////    @Test(expectedExceptions={NullPointerException.class})
////    @Test(groups={"V1"})
//    @Test(invocationCount=2)
//    public void test2() {
//        System.out.println("........test2");
////        Assert.fail();
//        String s = null;
//        System.out.println(s.toString());
//    }


    @Test(priority = 1,threadPoolSize=3,invocationCount=20)
    public void test3() {
        System.out.println("TestNGTestAnnotation.test3");
        System.out.println(Thread.currentThread().getName());
    }

    @Test(priority = 2)
    public void test2() {
        System.out.println("TestNGTestAnnotation.test2");
    }

    @Test(priority = 2)
    public void test1() {
        System.out.println("TestNGTestAnnotation.test1");
    }



}
