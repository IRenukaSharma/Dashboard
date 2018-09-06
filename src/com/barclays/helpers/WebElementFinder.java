package com.barclays.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementFinder extends LocalDriverManager {

	public static WebElement GetElement(By elementLocator) {

		try {
			System.out.println("Driver:"+driver);
			return driver.findElement(elementLocator);
		} catch (Exception ex) {
			throw ex;
		}
	}
}
