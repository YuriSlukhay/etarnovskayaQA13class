package com.tr.selenium.tests;

import com.tr.selenium.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class ContactCreationTest extends TestBase{
    @Test
    public void creationContactTest(){
        app.getNavigationHelper().goToHomePage();
        int before = app.getContactHelper().getContactCount();
        app.getNavigationHelper().initContactCreation();
        File photo = new File("addressbook-selenium-tests/src/test/resources/cat.jpg");
        app.getContactHelper().fillContactForm(new ContactData()
                .setFirstName("fName")
                .setLastName("lName")
                .setAddress("address")
                .setGroup("test1")
                .setPhoto(photo));
        app.getContactHelper().submitContactCreation();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before + 1);
    }

}
