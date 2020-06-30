package Endtoend;
import PageobjectResources.HomePageObjects;
import PageobjectResources.PLPoverlayObjects;
import PageobjectResources.ShoppingCartPageObjects;

import java.io.IOException;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ShoppingCartPage extends basic{
	public WebDriver driver; // the declaration of the driver here will help to execute test cases step by step

	@Test
	public void CheckTheMessageIfCouponIsNotValid() throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get("https://demo-1811.zaelab.com/b2b/powertools/en/USD/");
		driver.manage().window().maximize();
		HomePageObjects s = new HomePageObjects(driver);
		s.getBrandsCategory().click();
		driver.findElement(By.xpath("//form[contains(@id, 'addToCartForm')]")).click(); // select any product
		Thread.sleep(2000);
		PLPoverlayObjects s1 = new PLPoverlayObjects(driver);
		s1.get_checkoutButton().click();
		ShoppingCartPageObjects s2 = new ShoppingCartPageObjects(driver);
		s2.get_CouponPaceholdr().sendKeys("ffff");
		s2.get_ApplyButton().click();
		Assert.assertEquals("The coupon code entered is not valid.", s2.messageIfCouponIsNotValid().getText());
	}
	
	@AfterMethod
	public void close3() {
		driver.close();
	}
}
