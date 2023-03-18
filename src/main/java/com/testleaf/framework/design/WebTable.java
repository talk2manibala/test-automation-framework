package com.testleaf.framework.design;

import org.openqa.selenium.WebElement;

public interface WebTable {
    public String getHeaders(WebElement element);
    public boolean verifyHeaders(WebElement element, String values);
    public boolean verifyTableHasThisData(WebElement element, String value);
    public String getRecordForUniqueId(WebElement element, String value);
    public String getNumberOfColumns(WebElement element);
    public String getNumberOfRows(WebElement element);
    public String getSpecificColumnForUniqueId(WebElement element, String value);
    public boolean verifyRecordForUniqueId(String uniqueId);
    public boolean verifyNumberOfColumns(int noOfColumns);
    public boolean verifyNumberOfRows(int noOfRows);
    public boolean verifySpecificColumnForUniqueId(String uniqueId, String columnName);
    public boolean verifyPaginationWithSelectedNoOfRecs(WebElement element, String value);

}
