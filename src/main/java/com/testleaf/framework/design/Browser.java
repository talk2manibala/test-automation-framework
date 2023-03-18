package com.testleaf.framework.design;

import org.openqa.selenium.*;

import java.net.MalformedURLException;
import java.util.List;

public interface Browser {
	
	/**
	 * This method will launch the Chrome browser and 
	 * maximise the browser and set the wait for 30 seconds 
	 * and load the url
	 * @param url - This will load the specified url  
	 * @author Testleaf
	 * @throws MalformedURLException 
	 */	
	public void startApp(String url);
	
	/**
	 * This method will launch the Any browser and 
	 * maximise the browser and set the wait for 30 seconds 
	 * and load the url
	 * @param browser - This will load the specified browser
	 * @since
	 * @see
	 * @param url - This will load the specified url  
	 * @author Testleaf
	 * @return 
	 * @throws MalformedURLException 
	 */
	public void startApp(String browser, String url);

	/**
	 * This method will close the active browser
	 * @author Testleaf
	 */
	public void close();
	
	/**
	 * This method will close all the browsers
	 * @author Testleaf
	 */
	public void quit();
	
	
	
	

	
}
