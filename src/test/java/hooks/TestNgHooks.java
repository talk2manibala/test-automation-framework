package hooks;

import pages.AutoWiredPages;
import com.testleaf.framework.config.ConfigurationManager;
import com.testleaf.framework.utils.ExcelReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.io.IOException;

public class TestNgHooks extends AutoWiredPages {

	public String dataSheetName;	

	@DataProvider(name = "fetchData", indices = {0})
	public Object[][] fetchData() throws IOException {
		return ExcelReader.readExcelData(dataSheetName);
	}	

	@BeforeMethod
	public void beforeMethod() {
		startApp("chrome", ConfigurationManager.configuration().baseUrl());
		setNode();
	}
	

	@AfterMethod
	public void afterMethod() {
		close();
	}













}
