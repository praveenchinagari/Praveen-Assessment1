package com.homeloan.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class HomePage {
	
	
	WebDriver driver;
	By Apptype = By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div[1]/div/div[1]/ul/li[1]/label");
	By Dependents = By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div[1]/div/div[2]/div/select");
	By PropType = By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/ul/li[1]/label");
	By uric = By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div[2]/div/div[1]/div/input");
	By urotic = By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div[2]/div/div[2]/div/input");
	By LivExp = By.id("expenses");
	By CurHoRep = By.id("homeloans");
	By OtLonRep = By.id("otherloans");
	By othComt = By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div[3]/div/div[4]/div/input");
	By totcreditcrd = By.id("credit");
	By workotbtn = By.id("btnBorrowCalculater");
	By strtovrbtn = By.xpath("/html/body/main/div/div[2]/div[1]/div/div/div[2]/div/div/div/div/div[1]/div/div[3]/div/div/div/div[3]/div[2]/button");
	

	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void fill() {
		driver.findElement(uric).sendKeys("80000");
		driver.findElement(urotic).sendKeys("10000");
		driver.findElement(LivExp).sendKeys("500");
		driver.findElement(CurHoRep).sendKeys("0");
		driver.findElement(OtLonRep).sendKeys("100");
		driver.findElement(othComt).sendKeys("0");
		driver.findElement(totcreditcrd).sendKeys("10000");
		driver.findElement(workotbtn).click();
		driver.findElement(strtovrbtn).click();
		System.out.println("The 1st scenario completed and clicked on the startover button");
		Reporter.log("The 1st scenario completed and clicked on the startover button");
		
	}
	public void method () {
		driver.findElement(LivExp).sendKeys("1");
		driver.findElement(workotbtn).click();
		boolean text = driver.getPageSource().contains("Text which you looking for");
		System.out.println("The warning text is" +text);
		Reporter.log("The warning text is\" +text");
		System.out.println("The warnin text scenario is passed");
		Reporter.log("The warnin text scenario is passed");
	}
	
	
	
	
	
	}



