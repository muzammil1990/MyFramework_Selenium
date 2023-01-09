/**
 * 
 */
package com.volvo.testngtutorials;

import org.testng.annotations.Test;

/**
 * This pg is used to check testng support negative priority or not
 * 
 * order of execution= priority order =  -ve integer to +ve integer
 */
public class Testng_Ex3 {

    @Test(priority = 1, description = "This tc is used to login to application")
    public void login() {
        System.out.println("inside login");
    }

    @Test(priority = 0, description = "This tc is used to select the item")
    public void selectItem() {
        System.out.println("inside selectitem");
    }

    @Test(priority = 2, description = "This tc is used to checkout")
    public void checkout() {
        System.out.println("inside check out");
    }

    @Test(priority = -3, description = "This tc is used to read")
    public void ball() {
        System.out.println("inside ball");
    }

}
