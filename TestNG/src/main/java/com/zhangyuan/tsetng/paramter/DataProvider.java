package com.zhangyuan.tsetng.paramter;

import org.testng.annotations.Test;

public class DataProvider {
    @Test(dataProvider = "data")
    public void testDataProvider(String name , int age) {
        System.out.println("name=" + name + "; age=" + age);
    }
    @org.testng.annotations.DataProvider(name = "data")
    public Object[][]providerData(){
        Object[][] o =new Object[][]{
                 {"zhangsan",10},
                {"lisi", 20},
                {"wangwu",30}
        };
        return o;
    }
    @Test(dataProvider = "methodData")
    public void test1(String name , int age){
        System.out.println("test1111方法 name=" + name + "; age=" + age);

    }
    @Test(dataProvider = "methodData")
    public void test2(String name , int age){
        System.out.println("test2222方法 name=" + name + "; age=" + age);

    }

}
