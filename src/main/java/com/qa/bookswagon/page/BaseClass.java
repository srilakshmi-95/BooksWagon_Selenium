package com.qa.bookswagon.page;

import org.apache.commons.math3.stat.inference.TestUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public WebDriver driver;

    public void initialise() {
        System.setProperty("webdriver.chrome.driver","E:\\Seleninum software\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.bookswagon.com/login");
    }

}