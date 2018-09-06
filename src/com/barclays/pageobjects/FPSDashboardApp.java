package com.barclays.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.barclays.helpers.LocalDriverManager;

public class FPSDashboardApp {

	protected static WebDriver driver;
	

	public void LaunchApp(String URL) {
		driver = LocalDriverManager.startLocalDriver();
		driver.navigate().to(URL);
		// Handle SSL Certificate
		if ("Certificate Error: Navigation Blocked".equals(driver.getTitle())) {
			new WebDriverWait(driver, 10).until(ExpectedConditions.titleContains("Certificate"));
			driver.navigate().to("javascript:document.getElementById('overridelink').click()");
		}
	}


	public void QuitApp() {
		LocalDriverManager.QuitApp();
	}
	
	public LoginPage Login() {
		return new LoginPage();
	}
}
