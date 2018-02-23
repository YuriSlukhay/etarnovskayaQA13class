package com.tetRan.cource.tests;

import com.tetRan.cource.model.BoardData;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RenameBoardTest extends TestBase {
    @BeforeClass
    public void precondition(){
        app.login("elena.telran@yahoo.com", "12345.com");
    }

    @Test
    public void testRenameBoard(){
        app.selectBoard();
        app.clickOnTheBoardTitle();
        app.fillRenameBoardTitle(new BoardData("Renamed"));
        app.clickRenameBoardButton();
        app.reTurnToHomePage();





    }


}
