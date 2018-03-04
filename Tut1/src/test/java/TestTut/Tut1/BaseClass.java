package TestTut.Tut1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseClass {
 
   public WebDriver dr;
   String path = "C:\\Users\\vishnu\\Desktop\\chromedriver_win32\\chromedriver.exe";

@Test
public void test()
{
	System.setProperty("webdriver.chrome.driver", path);
		 
	dr = new ChromeDriver();

}

}
