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
import resources.Base;

public class TestLandPage extends Base {
	public WebDriver driver;
    @Test
    public void LandingPage() throws IOException, InterruptedException
    {
       
    	driver=InitializeDriver();
    	driver.get("https://savaari.com/");
    	Landingpage lp=new Landingpage(driver);
    	lp.getTwowayRadio().click();
    	lp.getOnewayRadio().click();
    	lp.getFromaddressbox().sendKeys("Eluru");
    	Thread.sleep(2000L);
    	lp.getFromaddressbox().sendKeys(Keys.ENTER);
    	lp.getTOaddressBox().sendKeys("Rajahmundry");
    	Thread.sleep(2000L);
    	lp.getTOaddressBox().sendKeys(Keys.ENTER);
    	
    	lp.getDatePickBox().click();
    	String month=lp.getcalenderhead().getText();
    	while(!month.contains("December"))
    	{
    		lp.getMonthnextbtn().click();
    	}
    	List<WebElement> dates=lp.getDatepicker();
    	for(int i=0;i<dates.size();i++)
    	{
    		String text=dates.get(i).getText();
    		if(text.contains("30"))
    		{
    			dates.get(i).click();
    		}
    	}
    	WebElement staticdropdown=lp.getTimepickup();
    	Select dropdown= new Select(staticdropdown);
    	dropdown.selectByVisibleText("8:15 PM ");
    	lp.getSelectCarbtn().click();
    	lp.getcarselectbtn().click();
    	lp.getuserName().sendKeys("raja");
    	lp.getuserEmail().sendKeys("raja.siripireddy@gmail.com");
    	lp.getuserMobileNumber().sendKeys("9652287814");
    	lp.getpickupaddress().sendKeys("southern street");
    	Thread.sleep(5000L);
    	lp.getpickupaddress().sendKeys(Keys.DOWN);
    	lp.getpickupaddress().sendKeys(Keys.ENTER);
    	Thread.sleep(2000L);
    	lp.getproceedbtn().click();
    	lp.getpay25percent().click();
    	lp.getpayproceed().click();
    	
    }
    
    @AfterTest
    public void teardrops()
    {
    	driver.close();
    }



}
