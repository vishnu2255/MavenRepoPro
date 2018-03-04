package TestTut.Tut1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;


public class First1 {
	
	public WebDriver dr = null;
	
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("before class");
	}
	
	@BeforeMethod
	public void beforeMet()
	{
		System.out.println("before method");
		
	}
	
	@BeforeTest
	public void beforTest()
	{
		System.out.println("before test");
		
//		DesiredCapabilities ds = new DesiredCapabilities();
//		
////		System.setProperty(arg0, arg1);
//		
//		dr= new ChromeDriver();
//		
//		dr.get("https://www.amazon.ca/");
//		dr.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		dr.manage().window().maximize();	
		
		
		
	}
	
  @Test
  public void f() {
	  
	 System.out.println("Test1");
                  }
  
  @Test
  public void s() {
	  
	 System.out.println("Test2");
                  }
  
  @Test
  public void t() {
	
	  
	 System.out.println("Test3");
	 
	 
   }
  
  
    @AfterTest
    public void afterTest()
    {
    	System.out.println("After Test");
    }
    
    @AfterClass
    public void afterClass()
    {
    	System.out.println("after class");
    }
    
    @AfterMethod
    public void afterMethod()
    {
    	System.out.println("after method");
    }

@BeforeSuite
  public void beforesuite()
  {
	  System.out.println("before suite");
//	  DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//	  capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
	 
	  String path = "C:\\Users\\vishnu\\Desktop\\chromedriver_win32\\chromedriver.exe";
      System.setProperty("webdriver.chrome.driver", path);
	  
	  if(dr==null)
	  {
//		  GetDriver d = new GetDriver();
//		  dr =d.getDriver("chrome");
		  
		  dr = new ChromeDriver();
	  }
      
	  dr.get("https://www.amazon.ca/");
	  dr.manage().window().maximize();
	  dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  }
  @AfterSuite
  public void aftersuite()
  {
	  System.out.println("after suite");	  
	  if(dr!=null)
	  {
//		  dr.quit();  
		  dr.close();
	  }
	  
  }
  
}
