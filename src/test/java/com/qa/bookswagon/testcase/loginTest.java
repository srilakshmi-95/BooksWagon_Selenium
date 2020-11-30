package com.qa.bookswagon.testcase;

import com.qa.bookswagon.page.BaseClass;
import com.qa.bookswagon.page.LoginPage;
import org.testng.annotations.Test;

public class loginTest extends BaseTest {
    LoginPage loginpage;

    @Test(priority = 1)
    public void verifyLoginPageTest(){
        String title = loginpage.getLoginPageTitle();

    }
    @Test(priority = 2)
    public void loginTest(){
        loginpage.login("srilakshmi.shivanand@gmail.com","123456");

    }


}