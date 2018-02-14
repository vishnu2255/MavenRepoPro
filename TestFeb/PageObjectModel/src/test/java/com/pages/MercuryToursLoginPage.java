package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

public class MercuryToursLoginPage extends LoadableComponent<MercuryToursLoginPage> {
	
	WebDriver driver;
	
	@FindBy(name="userName")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath="//input[@value='Login']")
	WebElement signin;
	@FindBy(linkText="REGISTER")
	WebElement register;
	
	
	public MercuryToursLoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public String clickOnSignin()
	{
		username.sendKeys("selenium");
		password.sendKeys("selenium");
		signin.click();
		return driver.getTitle();
	}
	public void clickOnRegister()
	{
		register.click();
	}
	/*public void sendURL(String url) {
		//driver.get(url);
		
	}
*/
	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		System.out.println("in loaded");
		Assert.assertTrue(driver.getCurrentUrl().contains("newtours"));
	}

	@Override
	protected void load() {
		// TODO Auto-generated method stub
		System.out.println("in load");
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
	}

}
