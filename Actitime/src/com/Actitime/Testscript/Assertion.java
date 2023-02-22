package com.Actitime.Testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	@Test
	public void demoassertion() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String expectedtitle = "Google";
		String Actualtitle = driver.getTitle();
		SoftAssert s=new SoftAssert();
		s.assertEquals(expectedtitle, Actualtitle);
		driver.close();
		s.assertAll();
		
	}

}
