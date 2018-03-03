package com.tr.selenium.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void initContactCreation() {
        click(By.xpath("//*[@href='edit.php']"));
    }

    public void goToHomePage() {
        click(By.xpath("//a[@href='./']"));
    }

    public void goToGroupsPage() {
        wd.findElement(By.linkText("groups")).click();
    }
}
