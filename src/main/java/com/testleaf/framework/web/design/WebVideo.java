package com.testleaf.framework.web.design;

import org.openqa.selenium.WebElement;

public interface WebVideo {
    public String getVideoName(WebElement element);
    public String getVideoFormat(WebElement element);
    public String getVideoSizeInPage(WebElement element);
    public boolean verifyVideoName(WebElement element, String name);
    public boolean verifyVideoFormat(WebElement element, String format);
    public String verifyVideoSizeInPage(WebElement element, int size);
    public String isItVisible(WebElement element);
}
