/**
 * 
 */
package com.volvo.testngtutorials;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * This pg is to check the execution order of the annotation
 * 
 * @BeforeSuite
 * @BeforeTest
 * @BeforeClass
 * @BeforeMethod
 * @Test
 * @AfterMethod
 * @AfterClass
 * @AfterTest
 * @AfterSuite
 */
public class Testng_Ex4_Annotations {

    @BeforeClass
    public void test3() {
        System.out.println("@BeforeClass_test3");
    }

    @BeforeSuite
    public void test1() {
        System.out.println("@BeforeSuite_test1");
    }

    @BeforeTest
    public void test2() {
        System.out.println("@BeforeTest_test2");
    }

    @Test
    public void test5() {
        System.out.println("@Test_test5");
    }

    @BeforeMethod
    public void test4() {
        System.out.println("@BeforeMethod_test4");
    }

    @AfterSuite
    public void test6() {
        System.out.println("@AfterSuite_test6");
    }

    @AfterTest
    public void test7() {
        System.out.println("@AfterTest_test7");
    }

    @AfterClass
    public void test8() {
        System.out.println("@AfterClass_test8");
    }

    @AfterMethod
    public void test9() {
        System.out.println("@AfterMethod_test9");
    }

}
