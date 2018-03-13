package com.tr.selenium.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class HelperBase {
    WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }


    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void type(By locator, String text) {
        click(locator);
        if(text!=null){
            String existText = wd.findElement(locator).getAttribute("value");
            if(!text.equals(existText)){
                wd.findElement(locator).clear();
                wd.findElement(locator).sendKeys(text);
            }
        }
    }

    public void attach(By locator, File file) {

        if (file != null) {

            wd.findElement(locator).sendKeys(file.getAbsolutePath());
        }
    }


    public static boolean isAlertPresent(WebDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public boolean isElementPresent(By locator) {
        try{
            wd.findElement(locator);
            return  true;
        } catch (NoSuchElementException ex){
            return  false;
        }

    }
}
