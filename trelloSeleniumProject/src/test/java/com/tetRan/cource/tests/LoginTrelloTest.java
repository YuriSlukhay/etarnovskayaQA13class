package com.tetRan.cource.tests;

import org.testng.annotations.*;

public class LoginTrelloTest extends TestBase {

@BeforeMethod
        public void createPreconditions(){
    app.openSite("https://trello.com");
}


    @Test(priority = 1)
    public void LoginTrelloTest() {

        app.login("elena.telran@yahoo.com", "12345.com");
        app.logout();
         }

    @Test(priority = 2)
    public void ALoginTrelloTestNotValidmail() {

        app.login("1", "12345.com");

    }

    @Test
    public void BLoginTrelloemptiFieldTest() {
        app.openSite("https://trello.com");
        app.login("", "");

    }


}
