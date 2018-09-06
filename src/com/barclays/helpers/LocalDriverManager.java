package com.barclays.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LocalDriverManager {

	protected static WebDriver driver;

	public static WebDriver startLocalDriver() {
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		System.setProperty("webdriver.ie.driver", "Drivers\\IEDriverServer.exe");
		// initialize the IE driver
		driver = new InternetExplorerDriver(capabilities);
		driver.manage().window().maximize();
		return driver;
	}

	public static boolean isApplicationAvailable() {
		
		String pageTitle = driver.getTitle();
		if(pageTitle.contains("Error 404 "))
			return false;
			else 
				return true;	
	}
	
	
	public static void QuitApp() {
		driver.quit();
	}

}
