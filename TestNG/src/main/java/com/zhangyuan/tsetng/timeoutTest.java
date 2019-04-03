package com.zhangyuan.tsetng;

import org.testng.annotations.Test;

public class timeoutTest {
    @Test(timeOut = 3000)
    public void testSuccess()throws InterruptedException{
        Thread.sleep(2000);
    }
}
