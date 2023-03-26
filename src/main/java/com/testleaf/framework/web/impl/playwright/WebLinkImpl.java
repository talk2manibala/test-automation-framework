package com.testleaf.framework.web.impl.playwright;

import com.testleaf.framework.web.design.WebLink;
import org.openqa.selenium.WebElement;

public class WebLinkImpl implements WebLink {


    @Override
    public String click(WebElement element) {
        return null;
    }

    @Override
    public String getText(WebElement element) {
        return null;
    }

    @Override
    public boolean verifyText(WebElement element, String value) {
        return false;
    }

    @Override
    public String getLinkUrl(WebElement element) {
        return null;
    }

    @Override
    public boolean verifyLinkUrl(WebElement element, String value) {
        return false;
    }

    @Override
    public boolean isItEnabled(WebElement element) {
        return false;
    }

    @Override
    public boolean isItVisible(WebElement element) {
        return false;
    }

    @Override
    public boolean verifyLinkSecurity(WebElement element) {
        return false;
    }

    @Override
    public boolean verifyLinkStatus(WebElement element) {
        return false;
    }
}
