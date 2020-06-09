package PageobjectResources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MinicartObject {
	
	WebDriver driver;
	
	By miniCart = By.xpath("//div[@class='yCmsComponent']//div[@class='nav-cart']");
	
	public MinicartObject (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement miniCart() {
		return driver.findElement(miniCart);
	}

}
