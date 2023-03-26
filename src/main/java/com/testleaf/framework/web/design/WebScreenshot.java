package com.testleaf.framework.web.design;

import org.openqa.selenium.WebElement;

public interface WebScreenshot {
    public String pageScreenshot();
    public String fullPageScreenshot();
    public String elementScreenshot(WebElement element);
}
