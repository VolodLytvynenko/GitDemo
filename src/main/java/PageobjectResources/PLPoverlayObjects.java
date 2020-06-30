package PageobjectResources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PLPoverlayObjects {
	WebDriver driver;
	private By checkout = By.xpath("//a[contains(@class,'btn btn-primary btn-block add-to-cart-button')]");

	public PLPoverlayObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement get_checkoutButton() {
		return driver.findElement(checkout);
	}
}
