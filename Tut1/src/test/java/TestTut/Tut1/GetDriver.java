package TestTut.Tut1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDriver {

	public WebDriver dr;
	
	public WebDriver getDriver(String browser)
	{
		String path;
		if(browser.equalsIgnoreCase("chrome"))
		{
			path = "C:\\Users\\vishnu\\Desktop\\chromedriver_win32\\chromedriver.exe";
		    System.setProperty("webdriver.chrome.driver", path);			  
			dr = new ChromeDriver();			
			return dr;
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			
		}
		else if(browser.equalsIgnoreCase("ie"))
		{
			
		}
			
		return null;
	}
	
}
