package com.Actitime.pom;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field.Xpath;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsersPage {
	//Declaration
	@FindBy(xpath = "//div[.='New User']")
	private WebElement newuser;
	@FindBy(xpath = "(//input[@placeholder='First Name'])[3]")
	private WebElement firstname;
	@FindBy(xpath = "(//input[@placeholder='Last Name'])[3]")
	private WebElement lastname;
	@FindBy(xpath = "(//input[@placeholder='Email'])[3]")
	private WebElement email;
	@FindBy(xpath = "(//input[@placeholder='MI'])[2]")
	private WebElement mi;
	@FindBy(xpath = "(//div[@class='downIcon'])[5]")
	private WebElement drpdwn;
	@FindBy(xpath = "//div[.='Quality Control']")
	private WebElement dept;
	@FindBy(xpath = "(//td[@class='x-btn-right'])[4]")
	private WebElement cldricon;
	@FindBy(xpath = "(//button[@class='x-btn-text'])[5]")
	private WebElement year;
	@FindBy(xpath = "//a[@class='x-date-mp-prev']")
	private WebElement rgtarow;
	@FindBy(xpath = "//button[@class='x-date-mp-ok']")
	private WebElement clderok;
	@FindBy(id = "ext-gen681")
	private WebElement okay;
	@FindBy(xpath = "(//span[@class='checkmark '])[3]")
	private WebElement tickmark;
	@FindBy(xpath = "(//button[@class='x-btn-text'])[6]")
	private WebElement ovrtrkingdrpdwn;
	@FindBy(xpath = "(//button[@class='x-btn-text'])[6]")
	private WebElement saveandsend;
	
	//Initialization
	public UsersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}

	public WebElement getNewuser() {
		return newuser;
	}

	public WebElement getFirstname() {
		return firstname;

	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getMi() {
		return mi;
	}

	public WebElement getDrpdwn() {
		return drpdwn;
	}

	public WebElement getDept() {
		return dept;
	}

	public WebElement getCldricon() {
		return cldricon;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getRgtarow() {
		return rgtarow;
	}

	public WebElement getClderok() {
		return clderok;
	}

	public WebElement getOkay() {
		return okay;
	}

	public WebElement getTickmark() {
		return tickmark;
	}

	public WebElement getOvrtrkingdrpdwn() {
		return ovrtrkingdrpdwn;
	}

	public WebElement getSaveandsend() {
		return saveandsend;
	}
	public void createnewuser(String Firstname, String Lastname, String Email, String Mi ) {
		newuser.click();
		firstname.sendKeys(Firstname);
		lastname.sendKeys(Lastname);
		mi.sendKeys(Mi);
		email.sendKeys(Email);
		drpdwn.click();
		dept.click();
		cldricon.click();
		year.click();
		//Scroll down 
		//JavascriptExecutor j=(JavascriptExecutor) driver;
		// int yaxis=driver.findElement(By.xpath("(//div[.='Cost of Work Rates'])[2]")).getLocation().getY();
			//j.executeScript("window.scrollBy(0,"+yaxis+")");


		rgtarow.click();
		clderok.click();
		okay.click();
		tickmark.click();
		//double click
		//Actions act=new Actions((WebDriver) tickmark);
		//act.doubleClick(tickmark).perform();
		//Alert a = ((WebDriver) tickmark).switchTo().alert();
		//a.accept();
		ovrtrkingdrpdwn.click();
		saveandsend.click();
	}
	
	

}
