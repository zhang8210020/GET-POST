package com.zhangyuan.tsetng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("服务端组测试方法1");

    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("服务端组测试方法2");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("测试组测试方法3");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("测试组测试方法4");
    }
    @BeforeGroups("server")
    public void beforGroupsOnServer(){
        System.out.println("这是服务器组运行之前运行的方法");
    }
    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("这是服务器组运行之前运行的方法");
    }

    @BeforeGroups("client")
    public void beforGroupsOnClient(){
        System.out.println("这是Client运行之前运行的方法");
    }
    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("这是Client运行之前运行的方法");
    }

}
