package com.testleaf.framework.web.design;

import org.openqa.selenium.WebElement;

public interface WebRadioBtn {

    public String click(WebElement element);
    public String getselected(WebElement element);
    public boolean isSelected(WebElement element);
    public String IsEnabled(WebElement element);


}
