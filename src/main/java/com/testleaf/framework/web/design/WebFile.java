package com.testleaf.framework.web.design;

import org.openqa.selenium.WebElement;

public interface WebFile {

    public String downloadFile(WebElement element);
    public String uploadFile(WebElement element, String filePath);
    public String verifyFileFormat(String filepath);
    public boolean verifyFileSize(String filepath);
    public boolean verifyFileSecurity(String filepath);


}
