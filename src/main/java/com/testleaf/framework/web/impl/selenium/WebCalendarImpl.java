package com.testleaf.framework.web.impl.selenium;

import com.testleaf.framework.web.design.WebCalendar;
import org.openqa.selenium.WebElement;

public class WebCalendarImpl implements WebCalendar {

    @Override
    public String selectDay(WebElement element, String date) {
        return null;
    }

    @Override
    public String selectMonth(WebElement element, String month) {
        return null;
    }

    @Override
    public String selectYear(WebElement element, String year) {
        return null;
    }

    @Override
    public String selectDate(WebElement element, String date) {
        return null;
    }

    @Override
    public String getSelectedDate(WebElement element) {
        return null;
    }

    @Override
    public String verifySelectedDate(String date) {
        return null;
    }

    @Override
    public boolean verifyMinimumSelectableDate(String date) {
        return false;
    }

    @Override
    public boolean verifyMaximumSelectableDate(String date) {
        return false;
    }

    @Override
    public boolean verifyRangeSelectionOfDates(String fromDate, String toDate) {
        return false;
    }

    @Override
    public boolean verifySelectingDisabledDate(String date) {
        return false;
    }
}
