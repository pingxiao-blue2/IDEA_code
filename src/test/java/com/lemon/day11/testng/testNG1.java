package com.lemon.day11.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
testNG:单元测试框架，提供了丰富的注解（标签）帮助方便的编写和管理被测试项目的测试类和测试方法，功能比junit强大，支持依赖测试、
 忽略测试、异常测试、超时测试、分组测试等多种测试场景

 运行原理：通过testng的插件运行，会通过命令启动TestNG.java的文件，这个文件中有main方法，就会去扫描带有注解的方法运行

 testNG官网：https://testng.org/doc/index.html
 @Test：注解（annotations），标记此方法为testng方法
 属性：
 执行顺序：按方法名称的长短执行，短的先执行，如果长度一样比较后面的字，小的先执行
 **/
public class testNG1 {
//    @Test(dependsOnMethods = {"test2"})//先运行test2，再运行test1，如果test2失败，test1不运行
//    @Test(alwaysRun = true, dependsOnMethods = {"test2"})//即使test2失败也会运行
    @Test
    public void test1(){
        System.out.println("test1------pass");
        Assert.assertFalse(false);//断言，断言失败时为true
    }
    @Test(description = "，描述")
    public void test2(){
        System.out.println("test2------pass");
//        Assert.assertFalse(false);//断言，断言失败时为true
//        Assert.fail();
    }
    @Test(enabled = false)//可执行，和没有@Test的效果一样。默认为true
    public void test3() {
        System.out.println("test3------pass");
    }
    @Test(expectedExceptions = NullPointerException.class)//期望报错为空指针，如果不报，则失败
    public void test4() {
        System.out.println("test4------pass");
        String s = null;
        s.toString();
    }
//    @Test(groups = {"V1"})//分组
    @Test(invocationCount = 2)//执行几次
    public void test7() {
        System.out.println("test7------pass");

    }
    @Test()//执行几次
    public void test6() {
        System.out.println("test6------pass");

    }
    @Test(priority = 1)//优先级，0开始到增加，数字越小，优先级越高，默认为0，最后执行
    public void test5() {
        System.out.println("test5------pass");

    }
    //三个线程执行test8,但是可能只有一个执行到了,要配合invocationCount使用，test8最后执行20次
    @Test(threadPoolSize = 3,invocationCount = 20)
    public void test8() {
        System.out.println("test8------pass");

    }


}
