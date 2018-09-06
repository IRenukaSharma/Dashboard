package com.barclays.runner;

import com.barclays.pageobjects.FPSDashboardApp;

public class RunnerClass {
	// Application Objects
	public static FPSDashboardApp app;
	
	public static void main(String[] args) {
		String applicationUrl = "http://flipkart.com";
		// Login into FPS board 
		app = new FPSDashboardApp();
		//Launch the application
		app.LaunchApp(applicationUrl);
		//Login Into Application 
		app.Login().login();
		
		

	}
}
