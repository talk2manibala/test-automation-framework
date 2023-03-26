package com.testleaf.framework.web.design;

import org.openqa.selenium.WebElement;

public interface WebButton {
    public String click(WebElement element);
    public String getText(WebElement element);
    public String verifyText(WebElement element, String value);
    public String getColor(WebElement element);
    public boolean verifyColor(WebElement element, String value);
    public boolean isItEnabled(WebElement element);
    public boolean isItVisible(WebElement element);

}
