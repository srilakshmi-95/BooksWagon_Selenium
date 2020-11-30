package com.qa.bookswagon.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
      WebDriver driver;
      By email = By.xpath("//input[@id='ctl00_phBody_SignIn_txtEmail']");
      By password = By.xpath("//input[@id='ctl00_phBody_SignIn_txtPassword']");
      By login = By.xpath("//input[@id='ctl00_phBody_SignIn_btnLogin']");

      //Page actions

    public String getLoginPageTitle(){
        return driver.getTitle();
    }
    public void login(String id, String pwd){
        driver.findElement(email).sendKeys(id);
        driver.findElement(password).sendKeys(pwd);
    }


}
