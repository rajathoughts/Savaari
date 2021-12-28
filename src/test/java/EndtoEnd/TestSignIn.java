package EndtoEnd;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObject.Landingpage;
import pageObject.SigninPage;
import resources.Base;

public class TestSignIn extends Base {
	public WebDriver driver;
    @Test
    public void Signin() throws IOException, InterruptedException
    {
       
    	driver=InitializeDriver();
    	driver.get("https://savaari.com/");
    	Landingpage lp=new Landingpage(driver);
    	lp.getsigninButton().click();
    	SigninPage si=new SigninPage(driver);
    	si.getRegisterButton().click();
    	si.getUserName().sendKeys("raja");
    	si.getUserMobileNumber().sendKeys("9652287814");
    	si.getUserEmail().sendKeys("raja.siripireddy@gmail.com");
    	si.getUserPassword().sendKeys("raja1992");
    	si.getUserConfirmPassword().sendKeys("raja1992");
    	si.getUserRegister().click();
    	
    }
    
    @AfterTest
    public void teardrops()
    {
    	driver.close();
    }


}