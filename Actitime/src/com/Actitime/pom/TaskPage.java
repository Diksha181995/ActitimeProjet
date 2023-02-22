package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class TaskPage {
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement addnew;
	@FindBy(xpath = "//div[.='+ New Customer']")
	private WebElement newCust;
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement newcustname;
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement custdesp;
	//@FindBy(xpath = "(//div[@class='dropdownButton'])[15]")
	//private WebElement dropdwnbtn;
	//@FindBy(xpath = "(//div[.='Galaxy Corporation'])[5]")
	//private WebElement ourcomp;
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement createbtn;
	
	public TaskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
				}

	public WebElement getAddnew() {
		return addnew;
	}

	public WebElement getNewCust() {
		return newCust;
	}

	public WebElement getNewcustname() {
		return newcustname;
	}

	public WebElement getCustdesp() {
		return custdesp;
	}

	//public WebElement getDropdwnbtn() {
	//	return dropdwnbtn;
	//}

	//public WebElement getOurcomp() {
	//	return ourcomp;
	//}

	public WebElement getCreatebtn() {
		return createbtn;
	}
		
	//Business logic
	
	public void completetask(String Custname, String Description) throws InterruptedException {
		addnew.click();	
		newCust.click();
		newcustname.sendKeys(Custname);
		custdesp.sendKeys(Description);
		//dropdwnbtn.click();
		//ourcomp.click();
		createbtn.click();
	}	
		
	}
	
	
