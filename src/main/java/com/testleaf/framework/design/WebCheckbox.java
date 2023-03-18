package com.testleaf.framework.design;

import org.openqa.selenium.WebElement;

public interface WebCheckbox {
    public String select(WebElement element);
    public String deSelect(WebElement element);
    public boolean isItSelected(WebElement element);
    public String getLabel(WebElement element);
    public boolean verifyLabel(WebElement element, String value);
    public String getColor(WebElement element);
    public boolean verifyColor(WebElement element, String value);
    public boolean isItEnabled(WebElement element);
    public boolean isItVisible(WebElement element);

}
