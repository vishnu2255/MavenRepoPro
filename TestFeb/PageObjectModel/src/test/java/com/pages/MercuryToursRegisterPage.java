package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MercuryToursRegisterPage {
	
	WebDriver driver;
	
	@FindBy(name="email")
	WebElement email;
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="confirm")
	WebElement confirmPassword;
	@FindBy(name="register")
	WebElement register;
	@FindBy(linkText="SIGN-OFF")
	WebElement signOFF;
	
	public MercuryToursRegisterPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public String clickSubmit()
	{
		email.sendKeys("selenium");
		password.sendKeys("selenium");
		confirmPassword.sendKeys("selenium");
		register.click();
		return driver.getTitle();
	}
	public void clickSignOFF()
	{
		signOFF.click();
	}

}
