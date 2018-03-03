package com.tr.selenium.appManager;

import com.tr.selenium.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactHelper extends HelperBase {

    public ContactHelper(FirefoxDriver wd) {
        super(wd);
    }

            public void fillContactForm(ContactData contactData) {
            type(By.name("firstname"),contactData.getFirstName());
            type(By.name("lastname"), contactData.getLastName());
            type(By.name("address"), contactData.getAddress());
        }

    public void submitContactCreation() {
        click(By.name("submit"));
    }

    public int getContactCount() {
       return wd.findElements(By.name("selected[]")).size();
    }
}


