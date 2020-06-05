package com.generics.actitime;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.pages.actitime.PomActiLogin;

public class BaseTest implements AutoConstant {
	public WebDriver driver;
	@BeforeClass
	public void openBrowser() {
		System.setProperty(chrome_key,chrome_value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
	}
	@BeforeMethod
	public void startExecution() throws Exception {
		Reporter.log("Execution of test method starts",true);
		PomActiLogin l=new PomActiLogin(driver);
		l.loginTo();
	}
	@AfterClass
	public void closeBrowser() {
		//driver.quit();
	}
	
	
	
	
	
	
	
}
