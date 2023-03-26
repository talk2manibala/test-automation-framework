package com.testleaf.framework.web.impl.playwright;

import com.testleaf.framework.web.design.WebButton;
import org.openqa.selenium.WebElement;

public class WebButtonImpl implements WebButton {

    @Override
    public String click(WebElement element) {
        return null;
    }

    @Override
    public String getText(WebElement element) {
        return null;
    }

    @Override
    public String verifyText(WebElement element, String value) {
        return null;
    }

    @Override
    public String getColor(WebElement element) {
        return null;
    }

    @Override
    public boolean verifyColor(WebElement element, String value) {
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
}
