package PageobjectResources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {
	
	WebDriver driver;
	
	By signIn = By.xpath("//li[contains(@class,'liOffcanvas')]//a[contains(text(),'Sign in')]");
	By brands = By.xpath("//a[contains(text(),'Brands')]");
	By footer = By.xpath("//div[contains(@class,'footer__left col-xs-12 col-sm-12 col-md-9')]//div[contains(@class,'row')]");
	By logOut = By.xpath("//li[@class='liOffcanvas']//a[contains(text(),'Sign Out')]");
	
	public HomePageObjects(WebDriver driver) {
		this.driver = driver;		
	}
	
	public WebElement getSignIn() { // The method that return: driver.findElement(By.xpath("//input[@name='login']"))
		
		return driver.findElement(signIn);
	}
	
    public WebElement getBrandsCategory() { // The method that return: driver.findElement(By.xpath("//input[@name='login']"))
		
		return driver.findElement(brands);
	}
    
    public WebElement getFooter() { // The method that return: driver.findElement(By.xpath("//input[@name='login']"))
		
		return driver.findElement(footer);
	}

	public WebElement logOut() { // The method that return: driver.findElement(By.xpath("//input[@name='login']"))

		return driver.findElement(logOut);
	}

}
