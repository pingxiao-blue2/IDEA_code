package com.lemon.day12.dataproviders;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
testNg数据驱动传参：
 -利用testng.xml定义的parameter
 -利用DataProviders的@test注解的属性
 **/
public class TestNGParameter {
    @Test
    @Parameters({"type","version"})//里面的参数命名要和testng.xml定义的参数命名一样，且要基于xml的文件启动，不能用java文件启动
    public  void test(String type, String version){
        System.out.println("type = " + type + ", version = " + version);
    }
}
