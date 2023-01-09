/**
 * 
 */
package com.volvo.testngtutorials;

import org.testng.annotations.Test;

/**
 * This pg is used to check the execution order when priority is given.
 */
public class Testng_Ex2 {

    @Test(priority = 3, description = "This tc is used to checkout")
    public void checkout() {
        System.out.println("inside check out");
    }

    @Test(priority = 2, description = "This tc is used to select the item")
    public void selectItem() {
        System.out.println("inside selectitem");
    }

    @Test(priority = 1, description = "This tc is used to login to application")
    public void login() {
        System.out.println("inside login");
    }

}
