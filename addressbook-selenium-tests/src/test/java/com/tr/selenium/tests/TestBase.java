package com.tr.selenium.tests;

import com.tr.selenium.appManager.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

import java.lang.reflect.Method;

public class TestBase {
    Logger logger = LoggerFactory.getLogger(TestBase.class);

    protected static ApplicationManager app =
            new ApplicationManager(System.getProperty("browser", BrowserType.CHROME));//);

    @BeforeSuite
    public void setUp() throws Exception {
        app.start();
    }

    @AfterSuite
    public void tearDown() {
        app.stop();
    }

    @BeforeMethod
    public void startLog(Method m){

        logger.info("Start test" + " " + m.getName());
    }

    @AfterMethod
    public void stopLog(Method m){
        app.getBroserLog();
        logger.info("Stop test" + " " + m.getName());
    }

}
