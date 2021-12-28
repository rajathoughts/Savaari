
package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Landingpage {
	
	public WebDriver driver;
	public Landingpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	 By signinButton=  By.cssSelector("div.bg-signin.m-auto");
	 By TwowayRadio=  By.xpath("//label[text()='Round Trip']");
	 By onewayRadio=  By.xpath("//label[text()='One Way']");
	 By Fromaddressbox=  By.id("fromCityList");
	 By TOaddressBox= By.xpath("//div[@class='col-10 position-relative'] //input");
	 By DatePickBox=  By.xpath("//span[@class='ng-tns-c75-1 p-calendar']//input");
	 By calenderhead= By.xpath("//div[@class='p-datepicker-title ng-tns-c75-1']//span");
	 By monthnextbtn= By.xpath("//span[@class='p-datepicker-next-icon pi pi-chevron-right ng-tns-c75-1']");
	 By Datepicker= By.xpath("//table[@class='p-datepicker-calendar ng-tns-c75-3'] //tbody/tr/td/span");
	 By Timepickup= By.id("pickUpTime");
	 By SelectCarbtn= By.xpath("//button[@class='book-button btn']");
	 By carselectbtn= By.cssSelector("button.select-button.ng-star-inserted");
	 By userName= By.xpath("//input[@formcontrolname='bookingPersonNameControl']");
	 By userEmail= By.xpath("//input[@formcontrolname='userEmailControl']");
	 By userMobileNumber= By.xpath("//input[@formcontrolname='bookingMobileNumber']");
	 By pickupaddress= By.cssSelector("#search_places");
	 By proceedbtn= By.xpath("//div[@class='hori-vertical-center']");
	 By pay25percent= By.xpath("//input[@id='pay25per']");
	 By payproceed= By.xpath("//span[text()='Proceed']");
	 
	 

	 public WebElement getsigninButton() {
		 return driver.findElement(signinButton);
	 }
	 
	 public WebElement getTwowayRadio() {
		 return driver.findElement(TwowayRadio);
	 }
	 
	 public WebElement getOnewayRadio() {
		 return driver.findElement(onewayRadio);
	 }
	 public WebElement getFromaddressbox() {
		 return driver.findElement(Fromaddressbox);
	 }
	 public WebElement getTOaddressBox() {
		 return driver.findElement(TOaddressBox);
	 }
	 public WebElement getDatePickBox() {
		 return driver.findElement(DatePickBox);
	 }
	 public WebElement getcalenderhead() {
		 return driver.findElement(calenderhead);
	 }
	 public WebElement getMonthnextbtn() {
		 return driver.findElement(monthnextbtn);
	 }
	 public List<WebElement> getDatepicker() {
		 return driver.findElements(Datepicker);
	 }
	 public WebElement getTimepickup() {
		 return driver.findElement(Timepickup);
	 }
	 public WebElement getSelectCarbtn() {
		 return driver.findElement(SelectCarbtn);
	 }
	 public WebElement getcarselectbtn() {
		 return driver.findElement(carselectbtn);
	 }
	 public WebElement getuserName() {
		 return driver.findElement(userName);
	 }
	 public WebElement getuserEmail() {
		 return driver.findElement(userEmail);
	 }
	 public WebElement getuserMobileNumber() {
		 return driver.findElement(userMobileNumber);
	 }
	 public WebElement getpickupaddress() {
		 return driver.findElement(pickupaddress);
	 }
	 public WebElement getproceedbtn() {
		 return driver.findElement(proceedbtn);
	 }
	 public WebElement getpay25percent() {
		 return driver.findElement(pay25percent);
	 }
	 public WebElement getpayproceed() {
		 return driver.findElement(payproceed);
	 }
	 
  
  
}
