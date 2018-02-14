package com.tests;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.pages.MercuryToursLoginPage;
import com.pages.MercuryToursRegisterPage;
import com.utility.Drivers;

public class MercuryToursTest {
	WebDriver driver;
	MercuryToursRegisterPage mrp;
	MercuryToursLoginPage mlp;
	
	@Parameters({"browser","node"})
	@BeforeTest
	public void beforeTest(String value1,String value2) throws MalformedURLException
	{
		//driver=Drivers.getDriver(value);
		DesiredCapabilities ds=null;
		if(value1.equals("firefox"))
		{
			ds=DesiredCapabilities.firefox();
		}
		else if(value1.equals("chrome"))
		{
			ds=DesiredCapabilities.chrome();
		}
		else if(value1.equals("ie"))
		{
			ds=DesiredCapabilities.internetExplorer();
		}
		/*DesiredCapabilities ds=new DesiredCapabilities();
		ds.setBrowserName(value1);*/
		ds.setPlatform(Platform.ANY);
		
		driver=new RemoteWebDriver(new URL(value2),ds);
		mrp=PageFactory.initElements(driver,MercuryToursRegisterPage.class);
		mlp=PageFactory.initElements(driver,MercuryToursLoginPage.class);
		
	}
	@AfterTest
	public void afterTest()
	{
		driver.quit();
	}
	
  @Test
  public void testMercuryTours() throws IOException {
	//mlp.sendURL("http://newtours.demoaut.com/");
	mlp.get();
	
	mlp.clickOnRegister();
	

	mrp.clickSubmit();
	/*}
	catch(Exception e)
	{
		TakesScreenshot screen=(TakesScreenshot) driver;
		File src=screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\images\\"+new SimpleDateFormat("yyyy-MM-dd hh-mm-ss-ms").format(new Date())+".png"));
		
	}*/
	mrp.clickSignOFF();
	String title=mlp.clickOnSignin();
	Assert.assertTrue(title.contains("Find"));
  }
}
