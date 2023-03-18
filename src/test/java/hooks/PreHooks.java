package hooks;

import com.testleaf.framework.config.ConfigurationManager;
import org.testng.annotations.BeforeMethod;

public class PreHooks extends TestNgHooks {

	@BeforeMethod
	public void beforeMethod() {
		super.beforeMethod();
		loginPage.doLogin(ConfigurationManager.configuration().appUserName(),
				ConfigurationManager.configuration().appPassword());
	}

}
