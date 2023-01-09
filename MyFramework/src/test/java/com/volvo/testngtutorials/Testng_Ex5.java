package com.volvo.testngtutorials;

import org.testng.annotations.Test;

// dependency     = (dependsOnMethods - Keyword)
public class Testng_Ex5 {

    @Test
    public void loginTest(){
        System.out.println("Login test");
//        int i= 3/0;  //if login feature fails then other feature which depends on login need not be executed
    }
    

    @Test(dependsOnMethods="loginTest")
    public void homePageTest(){
        System.out.println("Home page test");
    }
    

    @Test(dependsOnMethods="loginTest")
    public void SearchPageTest(){
        System.out.println("Search page test");
    }
    
    
    @Test(dependsOnMethods="loginTest")
    public void registerPageTest(){
        System.out.println("Register page test");
    }
}
