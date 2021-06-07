package com.lemon.day12.dataproviders;

import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 **/
public class TestNGParameter2 {
    @Test
    @Parameters({"type","version"})//里面的参数命名要和testng.xml定义的参数命名一样，且要基于xml的文件启动，不能用java文件启动
    public  void test(String type, String version){
        System.out.println("type = " + type + ", version = " + version);
    }
}
