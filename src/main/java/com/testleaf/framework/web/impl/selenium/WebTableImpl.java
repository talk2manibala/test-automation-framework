package com.testleaf.framework.web.impl.selenium;

import com.testleaf.framework.web.design.WebTable;
import org.openqa.selenium.WebElement;

public class WebTableImpl implements WebTable {

    @Override
    public String getHeaders(WebElement element) {
        return null;
    }

    @Override
    public boolean verifyHeaders(WebElement element, String values) {
        return false;
    }

    @Override
    public boolean verifyTableHasThisData(WebElement element, String value) {
        return false;
    }

    @Override
    public String getRecordForUniqueId(WebElement element, String value) {
        return null;
    }

    @Override
    public String getNumberOfColumns(WebElement element) {
        return null;
    }

    @Override
    public String getNumberOfRows(WebElement element) {
        return null;
    }

    @Override
    public String getSpecificColumnForUniqueId(WebElement element, String value) {
        return null;
    }

    @Override
    public boolean verifyRecordForUniqueId(String uniqueId) {
        return false;
    }

    @Override
    public boolean verifyNumberOfColumns(int noOfColumns) {
        return false;
    }

    @Override
    public boolean verifyNumberOfRows(int noOfRows) {
        return false;
    }

    @Override
    public boolean verifySpecificColumnForUniqueId(String uniqueId, String columnName) {
        return false;
    }

    @Override
    public boolean verifyPaginationWithSelectedNoOfRecs(WebElement element, String value) {
        return false;
    }
}
