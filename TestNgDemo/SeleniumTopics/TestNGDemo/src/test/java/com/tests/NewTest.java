package com.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;





public class NewTest extends MyListener{
	
	//Logger log=Logger.getLogger(NewTest.class);
	
	@Test
	public void abc()
	{
		
		System.out.println(driver);
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		
		test.log(LogStatus.INFO,"Web page loaded");
		driver.findElement(By.name("userName")).sendKeys("selenium");
		
		Assert.assertNotNull(driver.findElement(By.name("pas")));
		
		System.out.println("in test abc");
		//log.info("in test abc");
		
		
	}

}
