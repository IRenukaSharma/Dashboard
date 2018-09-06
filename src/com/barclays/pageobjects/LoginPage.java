package com.barclays.pageobjects;

import java.io.PrintWriter;

import org.openqa.selenium.By;

import com.barclays.helpers.LocalDriverManager;

public class LoginPage extends FPSDashboardApp {

	public void login() {

		if (LocalDriverManager.isApplicationAvailable()) {
			// write your login steps
			// click on view menu

			// Close the pop up

			// Get the inner text of some element and write into Notepad file
			//String text = driver.findElement(By.id("")).getAttribute("innerText");
			//Write text into a file
			writeTextIntoNotepadFile("hello");

		} else {
			QuitApp();
			LaunchApp("http://flipkart.com");
			login();
		}
	}
	
	public void writeTextIntoNotepadFile(String text) {
		
		try {
			PrintWriter writer = new PrintWriter("data.txt", "UTF-8");
			writer.append(text);
			writer.close();
		}catch(Exception ex) {
			System.err.println(ex);
		}
	}

}
