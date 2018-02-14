package com.tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTestFileUpload {
	
	@Test
	public void testFileUpload() throws IOException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost:5432/TestMeApp/login.htm");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("userName")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("Password456");
		driver.findElement(By.name("Login")).click();
		
		driver.findElement(By.xpath("//h4[contains(text(),'Add Product')]")).click();
		driver.findElement(By.xpath("//div[@class=' btn btn-default image-preview-input']")).click();
	
		Runtime.getRuntime().exec("C:\\Users\\aswani.kumar.avilala\\Desktop\\autoit\\FileUploadExample.exe");
		
	}

}
