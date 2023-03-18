package com.testleaf.framework.design;

public interface WebNavigation {
    public String toUrl(String url);
    public String back();
    public String forward();
    public String reload();

}
