package com.volvo.testngtutorials;

import org.testng.annotations.Test;

public class Testng_Ex7_Exceptions {

  /*@Test(invocationCount=1,invocationTimeOut=2000) 
    public void infiniteLoopTest(){
        int i=1;
        while(i==1){
            System.out.println(i);
        }
    }*/
  
  
  @Test(expectedExceptions=NumberFormatException.class)
  public void test1(){
      String s="110L";
      Integer.parseInt(s);
      
  }
}
