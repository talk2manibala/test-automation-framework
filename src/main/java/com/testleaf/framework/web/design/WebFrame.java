package com.testleaf.framework.web.design;

import org.openqa.selenium.WebElement;

public interface WebFrame {

    public String SwitchToFrame(String frameIdOrName);
    public String SwitchToFrame(WebElement element);
    public String SwitchOutOfFrame();


}
