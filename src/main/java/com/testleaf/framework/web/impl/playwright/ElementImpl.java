package com.testleaf.framework.web.impl.playwright;

import com.testleaf.framework.web.design.Element;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.html5.Location;

public class ElementImpl implements Element {

    @Override
    public Location getPosition(WebElement element) {
        return null;
    }

    @Override
    public boolean verifyPosition(WebElement element) {
        return false;
    }

    @Override
    public Dimension getSize(WebElement element) {
        return null;
    }

    @Override
    public boolean verifySize(int x, int y) {
        return false;
    }

    @Override
    public String getColor(WebElement element) {
        return null;
    }

    @Override
    public boolean verifyColor(String color) {
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
    public String screenshot(WebElement element) {
        return null;
    }
}
