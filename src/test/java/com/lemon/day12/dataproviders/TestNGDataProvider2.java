package com.lemon.day12.dataproviders;

import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGDataProvider2 {

    @Test//ITestContext将不同方法联系起来，可以通过ITestContext设置参数（键值对），在下一个方法中通过get的方法获取
    public void test2(ITestContext testContext){
        System.out.println(testContext);
        testContext.getCurrentXmlTest().addParameter("a", "8888");

    }

    @Test
    public void test3(ITestContext testContext){
        System.out.println(testContext.getCurrentXmlTest().getParameter("a"));
    }
}
