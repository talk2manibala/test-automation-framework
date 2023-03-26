package com.testleaf.framework.web.impl.selenium;

import com.testleaf.framework.web.design.WebFile;
import org.openqa.selenium.WebElement;

public class WebFileImpl implements WebFile {
    @Override
    public String downloadFile(WebElement element) {
        return null;
    }

    @Override
    public String uploadFile(WebElement element, String filePath) {
        return null;
    }

    @Override
    public String verifyFileFormat(String filepath) {
        return null;
    }

    @Override
    public boolean verifyFileSize(String filepath) {
        return false;
    }

    @Override
    public boolean verifyFileSecurity(String filepath) {
        return false;
    }
}
