package com.testleaf.framework.web.impl.selenium;

import com.testleaf.framework.web.design.WebCheckbox;
import org.openqa.selenium.WebElement;

public class WebCheckboxImpl implements WebCheckbox {

    @Override
    public String select(WebElement element) {
        return null;
    }

    @Override
    public String deSelect(WebElement element) {
        return null;
    }

    @Override
    public boolean isItSelected(WebElement element) {
        return false;
    }

    @Override
    public String getLabel(WebElement element) {
        return null;
    }

    @Override
    public boolean verifyLabel(WebElement element, String value) {
        return false;
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
