package com.tr.selenium.appManager;

import com.tr.selenium.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

            public void fillContactForm(ContactData contactData) {
            type(By.name("firstname"),contactData.getFirstName());
            type(By.name("lastname"), contactData.getLastName());
            type(By.name("address"), contactData.getAddress());
                new Select(wd.findElement(By.name("new_group")))
                        .selectByVisibleText(contactData.getGroup());
                attach(By.name("photo"), contactData.getPhoto());
        }

    public void submitContactCreation() {
        click(By.name("submit"));
    }

    public int getContactCount() {
       return wd.findElements(By.name("selected[]")).size();
    }
}


