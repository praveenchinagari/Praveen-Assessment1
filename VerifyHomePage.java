package com.homeloan.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.homeloan.pages.HomePage;

public class VerifyHomePage {
	
	@Test
	public void verifyHome () {
		System.setProperty("webdriver.gecko.driver", "C:\\Automation\\Driers.exe");
		WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "E:\\Tasks\\Chrome driver.exe");
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");
		HomePage obj= new HomePage(driver);
		obj.fill();
		Reporter.log("The first method executed successfully");
		obj.method();
		Reporter.log("The second method executed successfully");
		driver.quit();
		Reporter.log("Browser has been closed successfully");
		
	}
	

}
