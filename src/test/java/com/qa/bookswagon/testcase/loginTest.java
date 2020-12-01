package com.qa.bookswagon.testcase;

import com.qa.bookswagon.page.BaseClass;
import com.qa.bookswagon.page.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginTest extends BaseTest {

    @Test(priority = 1)
    public void verifyLoginPageTest(){
        LoginPage loginpage = new LoginPage(driver);
        String title = loginpage.getLoginPageTitle();
        System.out.println(title);
        Assert.assertEquals(title,"Online BookStore India, Buy Books Online, Buy Book Online India - Bookswagon.com");
    }

    @Test(priority = 2)
    public void loginTest(){
        LoginPage loginpage = new LoginPage(driver);
        loginpage.login("srilakshmi.shivanand@gmail.com","123456");
    }


}