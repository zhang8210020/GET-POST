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


}
