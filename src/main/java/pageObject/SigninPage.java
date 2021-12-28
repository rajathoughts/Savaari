
package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SigninPage {
	
	public WebDriver driver;
	public SigninPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	 
	 By RegisterButton=  By.xpath("//button[text()='Register']");
	 By UserName=  By.cssSelector("input[formcontrolname='userName']");
	 By UserMobileNumber=  By.cssSelector("input[placeholder='Enter your mobile number']");
	 By UserEmail=  By.cssSelector("input[placeholder='Email']");
	 By UserPassword=  By.cssSelector("input[placeholder='Password']");
	 By UserConfirmPassword=  By.cssSelector("input[placeholder='Re-enter Password']");
	 By UserRegister=  By.xpath("//span[text()='Register']");
	 

	 
	 
	 
	 
	 public WebElement getRegisterButton() {
		 return driver.findElement(RegisterButton);
	 }
	 
	 public WebElement getUserName() {
		 return driver.findElement(UserName);
	 }
	 public WebElement getUserMobileNumber() {
		 return driver.findElement(UserMobileNumber);
	 }
	 public WebElement getUserEmail() {
		 return driver.findElement(UserEmail);
	 }
	 public WebElement getUserPassword() {
		 return driver.findElement(UserPassword);
	 }
	 public WebElement getUserConfirmPassword() {
		 return driver.findElement(UserConfirmPassword);
	 }
	 public WebElement getUserRegister() {
		 return driver.findElement(UserRegister);
	 }
	 
  
  
}
