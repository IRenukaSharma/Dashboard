package com.barclays.helpers;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CaptureScreenshots extends LocalDriverManager {

	final static String imagePath = "Screenshots\\";

	public static void CaputreFullPageScreenshot(String imageName) {

		try {
			TakesScreenshot scrShot = (TakesScreenshot) driver;

			File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

			File DestFile = new File(imagePath + imageName + ".png");

			FileUtils.copyFile(SrcFile, DestFile);
		} catch (Exception ex) {
			System.err.println("Error:" + ex);
		}
	}
}
