package com.lemon.day11.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @Project: java29_maven_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2020 版权所有 湖南省零檬信息技术有限公司
 * @Author: Administrator
 * @Create: 2021-05-19 20:36
 * @Desc：
 **/
public class TestNGDemo {

    @Test   // 注解 标记此方法为testng测试方法。
//    @Override
    public void login() {
        System.out.println("..........testLogin");


//        Assert.assertTrue(false);
    }

    @Test
    public void testRegister() {
        System.out.println(".........testRegister");
//        Assert.assertFalse(false);
//        Assert.assertEquals("a","b");
    }


}
