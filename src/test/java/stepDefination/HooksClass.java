package stepDefination;

import java.nio.file.Paths;
import java.util.ArrayList;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;
import base.Base;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends Base {
	
	@Before

	public static void startUp(){

		String chromePath = "c:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
		Playwright playwright;
		playwright = Playwright.create();

		ArrayList<String> arguments = new ArrayList<>();
		arguments.add("--start-maximized");

		LaunchOptions launchOptions;
		launchOptions = new BrowserType.LaunchOptions().setHeadless(false).setArgs(arguments)
				.setExecutablePath(Paths.get(chromePath));

		Browser browser;
		browser = playwright.chromium().launch(launchOptions);

		BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
		page = context.newPage();
	}

	@After

	public void tearDown() {

		page.close();
		
	}

}
