package com.testleaf.framework.web.design;

public interface Windows {
    public String switchToWindow(int index);
    public String switchToWindow(String titleOrWindowId);
    public String getTitle();
    public boolean verifyTitle(String title);
    public String getAllWindows();
    public String getUrl();
    public String getPageSource();
    public String verifyPageHasText(String text);
    public boolean verifyUrl(String url);
    public String maximize();
    public String getWindowSize();
    public boolean verifyWIndowSize(int length, int width);
    public String getWindowPosition();
    public boolean verifyWindowPosition(int x, int y);
    public String close();
    public String quit();

}
