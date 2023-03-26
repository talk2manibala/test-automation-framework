package com.testleaf.framework.web.design;

import org.openqa.selenium.WebElement;

public interface WebLink {
    public String click(WebElement element);
    public String getText(WebElement element);
    public boolean verifyText(WebElement element, String value);
    public String getLinkUrl(WebElement element);
    public boolean verifyLinkUrl(WebElement element, String value);
    public boolean isItEnabled(WebElement element);
    public boolean isItVisible(WebElement element);
    public boolean verifyLinkSecurity(WebElement element);
    public boolean verifyLinkStatus(WebElement element);

}
