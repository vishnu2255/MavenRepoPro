package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Drivers {
	
	public static WebDriver getDriver(String browser)
	{
		if(browser.equals("firefox"))
		{
			return new FirefoxDriver();
		}
		else if(browser.equals("chrome"))
		{
			return new ChromeDriver();
		}
		else if(browser.equals("ie"))
		{
			return new InternetExplorerDriver();
		}
		else
		{
			return null;
		}
		
	}

}
