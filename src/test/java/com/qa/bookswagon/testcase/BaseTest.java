package com.qa.bookswagon.testcase;

import com.qa.bookswagon.page.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends BaseClass {
    @BeforeMethod
    public void setup(){
        initialise();
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
