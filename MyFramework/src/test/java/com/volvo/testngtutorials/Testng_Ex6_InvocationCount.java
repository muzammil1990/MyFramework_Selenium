package com.volvo.testngtutorials;

import org.testng.annotations.Test;

public class Testng_Ex6_InvocationCount {

    @Test
    public void loginTest() {
        System.out.println("Login test");
    }

    @Test(invocationCount = 10)
    public void sum() {
        int a = 10;
        int b = 30;
        int sum = a + b;
        System.out.println("sum is--" + sum);
    }
}
