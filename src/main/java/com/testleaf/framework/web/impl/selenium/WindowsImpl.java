package com.testleaf.framework.web.impl.selenium;

import com.testleaf.framework.web.design.Windows;

public class WindowsImpl implements Windows {

    @Override
    public String switchToWindow(int index) {
        return null;
    }

    @Override
    public String switchToWindow(String titleOrWindowId) {
        return null;
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public boolean verifyTitle(String title) {
        return false;
    }

    @Override
    public String getAllWindows() {
        return null;
    }

    @Override
    public String getUrl() {
        return null;
    }

    @Override
    public String getPageSource() {
        return null;
    }

    @Override
    public String verifyPageHasText(String text) {
        return null;
    }

    @Override
    public boolean verifyUrl(String url) {
        return false;
    }

    @Override
    public String maximize() {
        return null;
    }

    @Override
    public String getWindowSize() {
        return null;
    }

    @Override
    public boolean verifyWIndowSize(int length, int width) {
        return false;
    }

    @Override
    public String getWindowPosition() {
        return null;
    }

    @Override
    public boolean verifyWindowPosition(int x, int y) {
        return false;
    }

    @Override
    public String close() {
        return null;
    }

    @Override
    public String quit() {
        return null;
    }
}
