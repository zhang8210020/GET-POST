package com.zhangyuan.tsetng.Suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Suiteconfig {
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("before suite运行了");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("after suite运行了");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest");
    }
    @AfterTest
    public void afteTest(){
        System.out.println("afterTest");
    }
}
