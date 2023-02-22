package com.Actitime.GenericLibrary;
//we create the object to call the non static ethod 

import java.io.IOException;
//generic librarraries is a componenet of a framawork which has has a geneiric methods and generic class which write once and can use multipule time in a project 
//
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Actitime.pom.HomePage;
import com.Actitime.pom.LoginPage;

public class BaseClass {
	
	FileLibrary f=new FileLibrary();
	public static WebDriver driver;
	@BeforeSuite
	public void databaseconnetion() {
		Reporter.log("database Connected", true);		
	}
	@AfterSuite
	public void databasedisconnection() {
		Reporter.log("database disconnected",true);
	}
	@BeforeClass
	public void launchbrowser() throws IOException {
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String url = f.readDataFromProprtyFile("url");
		driver.get(url);
		Reporter.log("Browser launched Successfully",true);
	}
	@AfterClass
	public void CloseBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
		Reporter.log("Browser closed Successfully",true);
	}
	@BeforeMethod
	public void logintoActitime() throws IOException {
		String UN = f.readDataFromProprtyFile("username");
		String PW = f.readDataFromProprtyFile("password");
		LoginPage lp=new LoginPage(driver);
		lp.login(UN, PW);
		//driver.findElement(By.id("username")).sendKeys(UN);
		//driver.findElement(By.name("pwd")).sendKeys(PW);
		//driver.findElement(By.xpath(".//div[.='Login ']")).click();
		Reporter.log("Login Successfully", true);
			
	}
	@AfterMethod()
		public void LogoutFromActitime() {
			HomePage hp=new HomePage(driver);
			hp.getLgoutlnk().click();
			//driver.findElement(By.id("logoutLink")).click();
			Reporter.log("Logout Successfully", true);
		}
	
	}


