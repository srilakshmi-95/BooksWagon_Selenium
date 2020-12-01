package com.qa.bookswagon.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BaseClass {
    WebDriver driver;

    public HomePage (WebDriver driver) {
        this.driver= driver;
    }

    By search = By.xpath("//input[@id='ctl00_TopSearch1_txtSearch']");





}
