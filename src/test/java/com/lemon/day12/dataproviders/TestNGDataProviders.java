package com.lemon.day12.dataproviders;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
testNg数据驱动传参：
 -利用testng.xml定义的parameter
    里面的参数命名要和testng.xml定义的参数命名一样，且要基于xml的文件启动，不能用java文件启动
 -利用@test注解的属性dataProviders传参
    1、利用二维数组传参，注意二维数组的类型定义为Object类型，则可包括任意类型的数据，因为参数可能是int或者String
    2、传参的方法要加上@DataProvider的注解
 注意以上的两种传参只能选择一种使用
 **/
public class TestNGDataProviders {
    //属性dataProvider的参数名要和传参的方法名一致关联起来，有多少组数据则会运行多少次方法
    //此处的二维数组是指，参数的个数，方法执行的次数
    @Test(dataProvider = "data")
    public void test(String username, String password,String gender){
        System.out.println("username: " + username + "，password: " + password + "，gender: "+ gender);
    }
    @Test(dataProvider = "data2")
    public void test2(User user){
        System.out.println(user);
    }
    //此处的二维数组参数
    @DataProvider
    public Object[][] data(){
        Object[][] arr = {
                {"zs", "12345", "male"},
                {"ls", "56789", "female"},
                {"ww", "66666", "male"},
                {"zl", "88888", "female"}
        };
        return arr;
    }

    //以上的方法如果参数多个时，参数要写多个，此时可以将要传的参数封装成对象，变成一维数组进行传参
    //使用一位数组的好处是，当需要增加字段时，只用修改实体的类，方法不需要修改
    @DataProvider
    public Object[] data2(){
        User u1 = new User("zs", "12345", "male");
        User u2 = new User("ll", "66666", "female");
        User u3 = new User("ws", "88888", "male");
        Object[] arr = {u1, u2, u3};
        return arr;
    }


}
