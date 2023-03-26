package com.testleaf.framework.web.design;

import org.openqa.selenium.WebElement;

public interface WebAlert {
    public String switchToAlert(WebElement element);
    public String acceptAlert(WebElement element);
    public String dismissAlert(WebElement element);
    public String getAlertText(WebElement element);
}
