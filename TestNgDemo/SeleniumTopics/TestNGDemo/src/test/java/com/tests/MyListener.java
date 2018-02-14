package com.tests;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MyListener implements ITestListener {

	protected static WebDriver driver;
	protected static ExtentReports report;
	protected static ExtentTest test;
	
	
	
	Logger mylog=Logger.getLogger(MyListener.class);
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("on test start");
		mylog.info("on test start");
		test=report.startTest(result.getMethod().getMethodName()+"test started");
		

	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("on test success");
		mylog.info("on test success");
		test.log(LogStatus.PASS,result.getMethod().getMethodName()+" test is passed");
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//result.getThrowable().getMessage();
		System.out.println("on test failure");
		TakesScreenshot screen=(TakesScreenshot) driver;
		File src=screen.getScreenshotAs(OutputType.FILE);
		try {
			/*FileUtils.copyFile(src,new File("C:\\images\\"+
			new SimpleDateFormat("yyyy-MM-dd hh-mm-ss-ms").format(new Date())+".png"));
				*/
			FileUtils.copyFile(src,new File("C:\\images\\"+result.getMethod().getMethodName()+".png"));	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String image=test.addScreenCapture("C:\\images\\"+result.getMethod().getMethodName()+".png");
	
		
		System.out.println(result.getMethod().getMethodName()+" test failed");
		mylog.info(result.getMethod().getMethodName()+" test failed");
		test.log(LogStatus.FAIL,result.getMethod().getMethodName()+" test failed");
		test.log(LogStatus.FAIL,result.getThrowable().getMessage());
		test.log(LogStatus.FAIL,"",image);
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("on test skipped");
		mylog.info("on test skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("on test fail but within sucess %");
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("on start");
		driver=new ChromeDriver();
		report=new ExtentReports("MyReport1.html");
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("on finish");
		mylog.info("on finish");
		
		report.endTest(test);
		report.flush();
		
	}

}
