package com.testleaf.framework.web.impl.selenium;

import com.testleaf.framework.web.design.WebImage;
import org.openqa.selenium.WebElement;

public class WebImageImpl implements WebImage {
    @Override
    public String getImageName(WebElement element) {
        return null;
    }

    @Override
    public String getImageFormat(WebElement element) {
        return null;
    }

    @Override
    public String getImageSize(WebElement element) {
        return null;
    }

    @Override
    public String getImageAltText(WebElement element) {
        return null;
    }

    @Override
    public boolean verifyImageLoadingTime(WebElement element) {
        return false;
    }

    @Override
    public String verifyImageName(WebElement element, String name) {
        return null;
    }

    @Override
    public String verifyImageFormat(WebElement element, String format) {
        return null;
    }

    @Override
    public boolean verifyImageSize(WebElement element, int size) {
        return false;
    }

    @Override
    public boolean verifyImageAltText(WebElement element, String text) {
        return false;
    }

    @Override
    public boolean isItVisible(WebElement element) {
        return false;
    }
}
