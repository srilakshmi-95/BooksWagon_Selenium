package com.qa.bookswagon.testcase;

import com.qa.bookswagon.page.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends BaseClass {

    @BeforeClass
    public void setup(){
        initialise();
    }
    @AfterClass
    public void teardown(){
        logout();
    }
}
