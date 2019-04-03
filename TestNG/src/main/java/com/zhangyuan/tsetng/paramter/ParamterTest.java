package com.zhangyuan.tsetng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
@Parameters({"name","age"})
public class ParamterTest {
    public void paramTest1(String name , int age){
        System.out.println("name="+name+";age="+age);
    }
}
