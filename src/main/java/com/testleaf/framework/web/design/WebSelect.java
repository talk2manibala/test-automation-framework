package com.testleaf.framework.web.design;

import org.openqa.selenium.WebElement;

public interface WebSelect {
    public String SelectUsingText(WebElement element, String value);
    public String SelectUsingValue(WebElement element, String value);
    public String SelectUsingID(WebElement element, String value);
    public String getAllSelectedOptions(WebElement element);
    public String GetAllOptions(WebElement element);
    public String Unselect(WebElement element, String value);
}
