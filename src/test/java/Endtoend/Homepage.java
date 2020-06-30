package Endtoend;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import PageobjectResources.HomePageObjects;

import java.io.IOException;

import org.testng.annotations.AfterMethod;


public class Homepage extends basic // 'extends basic' means that we took extensions of the 'basic' class. So all methods from the 'basic' class can be called here
{
	public WebDriver driver; // the declaration of the driver here will help to execute test cases step by step

//	@Test
//	public void homePage() throws IOException {
//
//		driver = initializeDriver();
//		driver.get("https://demo-1811.zaelab.com/b2b/powertools/en/USD/");
//		driver.manage().window().maximize();
//		HomePageObjects s = new HomePageObjects(driver);
//		s.getSignIn().click();
//
//	}
//	@Test
//	public void footer() throws IOException {
//
//		driver = initializeDriver();
//		driver.get("https://demo-1811.zaelab.com/b2b/powertools/en/USD/");
//		driver.manage().window().maximize();
//		HomePageObjects s = new HomePageObjects(driver);
//		Assert.assertFalse(s.getFooter().isDisplayed()); //check is the footer displayed
//	}
    @Test
	public void TotalCountProducts() throws IOException {
		driver = initializeDriver();
		driver.get("https://demo-1811.zaelab.com/b2b/powertools/en/USD/");
		driver.manage().window().maximize();
		HomePageObjects s1 = new HomePageObjects(driver);
		Assert.assertEquals(s1.GetProductsQuantity(), 14);

	}

	@Test
	public void test1() throws IOException {
		driver = initializeDriver();
		driver.get("https://demo-1811.zaelab.com/b2b/powertools/en/USD/");
		driver.findElement(By.xpath("//div[@class='carousel__item--price']")).getAttribute("class");
		System.out.print(driver.findElement(By.xpath("//div[@class='carousel__item--price']")).getAttribute("class"));


	}

//	@AfterMethod
//	public void close1() {
//		driver.close();
//	}

}
