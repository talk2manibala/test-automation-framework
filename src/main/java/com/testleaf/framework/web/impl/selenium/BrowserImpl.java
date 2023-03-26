package com.testleaf.framework.web.impl.selenium;

import com.testleaf.framework.web.design.Browser;
import org.openqa.selenium.WebDriver;
import java.time.Duration;

public class BrowserImpl implements Browser {

	private WebDriver driver = new WebDriverImpl().getDriver();

	@Override
	public void startApp(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Override
	public void close() {
		driver.close();
	}

	@Override
	public void quit() {
		driver.quit();
	}
}
