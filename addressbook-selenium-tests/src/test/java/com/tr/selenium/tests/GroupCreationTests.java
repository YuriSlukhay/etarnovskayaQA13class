package com.tr.selenium.tests;

import com.tr.selenium.model.GroupData;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void groupCreationTest() {
        app.goToGroupsPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("test1", "Test1Header", "Test1Footer"));
        app.submitGroupCreation();
        app.returnToGroupsPage();
    }

}
