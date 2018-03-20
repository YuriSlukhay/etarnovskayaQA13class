package com.tr.selenium.appManager;

import com.tr.selenium.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    private GroupHelper groupHelper;
    private SessionHelper sessionHelper;
    private ContactHelper contactHelper;
    private NavigationHelper navigationHelper;
    WebDriver wd;
    private String browser;
    Properties properties;

    public ApplicationManager(String browser) {
       this.browser = browser;
       properties = new Properties();
    }


    public void start() throws IOException {
        String target = System.getProperty("target", "local");
        properties.load(new FileReader(String.format("addressbook-selenium-tests/src/test/resources/%s.properties", target)));
        //   String browser = BrowserType.CHROME;
        if (browser.equals(BrowserType.FIREFOX)) {
            wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        } else if (browser.equals(BrowserType.CHROME)) {
            wd = new ChromeDriver();
        } else if (browser.equals(BrowserType.IE)) {
            wd = new InternetExplorerDriver();
        }

        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        groupHelper = new GroupHelper(wd);
        contactHelper = new ContactHelper(wd);
        sessionHelper = new SessionHelper(wd);
        navigationHelper = new NavigationHelper(wd);

        openSite(properties.getProperty("web.baseUrl"));
        sessionHelper.logIn(properties.getProperty("web.adminLogin"), properties.getProperty("web.adminPwd"));//"admin", "secret");
    }

    public void getBroserLog(){
        System.out.println(wd.manage().logs().getAvailableLogTypes());
        wd.manage().logs().get("browser").forEach(1 -> System.out.println(l));
    }


    public void openSite(String property) {
        wd.get("http://localhost/addressbook/");
    }

    public void stop() {
        wd.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

   public SessionHelper getSessionHelper(){
        return sessionHelper;
   }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }

    public NavigationHelper getNavigationHelper() {
    return navigationHelper;
    }
}
