package com.testleaf.framework.web.impl.playwright;

import com.testleaf.framework.web.impl.selenium.BrowserTypes;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.Duration;

public class PlaywrightImpl {
    @Autowired
    private static final ThreadLocal<RemoteWebDriver> remoteWebDriver = new ThreadLocal<RemoteWebDriver>();

    @Autowired
    private static final ThreadLocal<WebDriverWait> wait = new ThreadLocal<WebDriverWait>();

    public PlaywrightImpl(BrowserTypes types) {
        switch (types) {
            case Chrome:
                break;
            case Firefox:
                break;
            case Edge:
                break;
            default:
                break;
        }
    }
    public void getDriver() {

    }

}
