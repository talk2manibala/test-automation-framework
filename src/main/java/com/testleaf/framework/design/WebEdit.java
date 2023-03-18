package com.testleaf.framework.design;

import org.openqa.selenium.WebElement;

public interface WebEdit {
    public String type(WebElement element, String value);
    public String getTypedText(WebElement element);
    public String clear(WebElement element);
    public String append(WebElement element, String value);
    public boolean verifyText(WebElement element, String value);
    public String click(WebElement element);
    public String getColor(WebElement element);
    public boolean verifyColor(WebElement element, String value);
    public boolean isItEnabled(WebElement element);
    public boolean isItVisible(WebElement element);

}
