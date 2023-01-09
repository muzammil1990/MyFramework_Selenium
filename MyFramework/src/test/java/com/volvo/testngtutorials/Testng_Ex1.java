package com.volvo.testngtutorials;

import org.testng.annotations.Test;

//this pg is used to check the execution order when priority order is not given. Ans: alphabetical order 
public class Testng_Ex1 {

    @Test
    public void login() {
        System.out.println("inside login");
    }

    @Test
    public void selectItem() {
        System.out.println("inside selectitem");
    }

    @Test
    public void checkout() {
        System.out.println("inside check out");
    }

}
