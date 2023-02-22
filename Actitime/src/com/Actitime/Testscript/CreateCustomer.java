package com.Actitime.Testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Actitime.GenericLibrary.BaseClass;
import com.Actitime.GenericLibrary.FileLibrary;
import com.Actitime.pom.HomePage;
import com.Actitime.pom.TaskPage;

public class CreateCustomer extends BaseClass{
	FileLibrary flib=new FileLibrary();
		@Test
	public void createCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
			
	HomePage hp=new HomePage(driver);
	hp.getTasklnk().click();
	TaskPage tp=new TaskPage(driver);
	String customername = flib.readDataFromExcelFile("Sheet1", 5, 1);
	String description = flib.readDataFromExcelFile("Sheet1", 2, 2);	
	tp.completetask(customername, description);
	String expected = customername;
	String actual = driver.findElement(By.xpath("//div[@title='"+customername+"']")).getText();
	SoftAssert s=new SoftAssert();
	s.assertEquals(expected, actual);
	Reporter.log("Assertion Pass", true);
	s.assertAll();
	
	}		

}
