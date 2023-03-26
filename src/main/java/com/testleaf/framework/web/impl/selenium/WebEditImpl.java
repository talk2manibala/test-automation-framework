package com.testleaf.framework.web.impl.selenium;

import com.testleaf.framework.web.design.WebEdit;
import org.openqa.selenium.WebElement;

public class WebEditImpl implements WebEdit {
    @Override
    public String type(WebElement element, String value) {
        return null;
    }

    @Override
    public String getTypedText(WebElement element) {
        return null;
    }

    @Override
    public String clear(WebElement element) {
        return null;
    }

    @Override
    public String append(WebElement element, String value) {
        return null;
    }

    @Override
    public boolean verifyText(WebElement element, String value) {
        return false;
    }

    @Override
    public String click(WebElement element) {
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
