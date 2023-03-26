package com.testleaf.framework.web.impl.selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.Duration;

public class WebDriverImpl {
    @Autowired
    private static final ThreadLocal<RemoteWebDriver> remoteWebDriver = new ThreadLocal<RemoteWebDriver>();

    @Autowired
    private static final ThreadLocal<WebDriverWait> wait = new ThreadLocal<WebDriverWait>();

    public void setWait() {
        wait.set(new WebDriverWait(getDriver(), Duration.ofSeconds(30)));
    }

    public WebDriverWait getWait() {
        return wait.get();
    }
    public RemoteWebDriver getDriver(BrowserTypes type) {
        RemoteWebDriver driver=null;
        switch (type) {
            case Chrome:
                System.setProperty("webdriver.chrome.driver", "../drivers/chrome/chromedriver.exe");
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--incognito");
                options.addArguments("--remote-allow-origins=*");
                 driver = new ChromeDriver(options);
                break;
            case Firefox:
                driver =  new FirefoxDriver();
                break;
            case Edge:
                driver =  new InternetExplorerDriver();
            default:
                break;
        }
        remoteWebDriver.set(driver);
        return driver;
    }

    public RemoteWebDriver getDriver() {
        return remoteWebDriver.get();
    }

}
