package com.testleaf.framework.design;

import org.openqa.selenium.WebElement;

public interface WebCalendar {
    public String selectDay(WebElement element, String date);
    public String selectMonth(WebElement element, String month);
    public String selectYear(WebElement element, String year);
    public String selectDate(WebElement element, String date);
    public String getSelectedDate(WebElement element);
    public String verifySelectedDate(String date);
    public boolean verifyMinimumSelectableDate(String date);
    public boolean verifyMaximumSelectableDate(String date);
    public boolean verifyRangeSelectionOfDates(String fromDate, String toDate);
    public boolean verifySelectingDisabledDate(String date);

}
