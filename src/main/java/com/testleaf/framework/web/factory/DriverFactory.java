package com.testleaf.framework.web.factory;

import com.testleaf.framework.web.impl.playwright.PlaywrightImpl;
import com.testleaf.framework.web.impl.selenium.BrowserImpl;
import com.testleaf.framework.web.impl.selenium.BrowserTypes;
import com.testleaf.framework.web.impl.selenium.WebDriverImpl;

public class DriverFactory {

    public static BrowserImpl driverFactory(DriverTypes type, BrowserTypes browserTypes) {
        switch(type) {
            case Playwright:
                new PlaywrightImpl(browserTypes);
            case WebDriver:
                new WebDriverImpl(browserTypes);
            default:
                return null;
        }
    }

}