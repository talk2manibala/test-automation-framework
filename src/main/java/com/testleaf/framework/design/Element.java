package com.testleaf.framework.design;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.html5.Location;

public interface Element {
    Location getPosition(WebElement element);
    boolean verifyPosition(WebElement element);
    Dimension getSize(WebElement element);
    boolean verifySize(int x, int y);
    String getColor(WebElement element);
    boolean verifyColor(String color);
    boolean isItEnabled(WebElement element);
    boolean isItVisible(WebElement element);
    String screenshot(WebElement element);

}
