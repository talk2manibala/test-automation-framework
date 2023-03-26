package com.testleaf.framework.web.impl.playwright;

import com.testleaf.framework.web.design.WebVideo;
import org.openqa.selenium.WebElement;

public class WebVideoImpl implements WebVideo {
    @Override
    public String getVideoName(WebElement element) {
        return null;
    }

    @Override
    public String getVideoFormat(WebElement element) {
        return null;
    }

    @Override
    public String getVideoSizeInPage(WebElement element) {
        return null;
    }

    @Override
    public boolean verifyVideoName(WebElement element, String name) {
        return false;
    }

    @Override
    public boolean verifyVideoFormat(WebElement element, String format) {
        return false;
    }

    @Override
    public String verifyVideoSizeInPage(WebElement element, int size) {
        return null;
    }

    @Override
    public String isItVisible(WebElement element) {
        return null;
    }
}
