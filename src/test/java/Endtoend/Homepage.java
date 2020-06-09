package Endtoend;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import PageobjectResources.HomePageObjects;
import junit.framework.Assert;
import java.io.IOException;
import org.testng.annotations.AfterMethod;


public class Homepage extends basic // 'extends basic' means that we took extensions of the 'basic' class. So all methods from the 'basic' class can be called here
{
	public WebDriver driver; // the declaration of the driver here will help to execute test cases step by step

	@Test
	public void homePage() throws IOException {
		
		driver = initializeDriver();
		driver.get("https://electronics.demo-1905.zaelab.com/b2c/electronics/en/"); 
		driver.manage().window().maximize();
		HomePageObjects s = new HomePageObjects(driver);
		s.getSignIn().click();

	}
	@SuppressWarnings("deprecation")
	@Test
	public void footer() throws IOException { 
		
		driver = initializeDriver();
		driver.get("https://electronics.demo-1905.zaelab.com/b2c/electronics/en/");
		driver.manage().window().maximize();
		HomePageObjects s = new HomePageObjects(driver);
		Assert.assertFalse(s.getFooter().isDisplayed()); //check is the footer displayed


	}
	
	@AfterMethod
	public void close1() {
		driver.close();
	}

}
