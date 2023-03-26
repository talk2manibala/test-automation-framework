package com.testleaf.framework.web.design;

import org.openqa.selenium.WebElement;

public interface WebImage {
    public String getImageName(WebElement element);
    public String getImageFormat(WebElement element);
    public String getImageSize(WebElement element);
    public String getImageAltText(WebElement element);
    public boolean verifyImageLoadingTime(WebElement element);
    public String verifyImageName(WebElement element, String name);
    public String verifyImageFormat(WebElement element, String format);
    public boolean verifyImageSize(WebElement element, int size);
    public boolean verifyImageAltText(WebElement element, String text);
    public boolean isItVisible(WebElement element);

}
