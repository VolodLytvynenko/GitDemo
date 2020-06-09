package PageobjectResources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartPageObjects {
	WebDriver driver;
	
	By message = By.xpath("//div[contains(text(),'The coupon code entered is not valid.')]");
	By couponField = By.xpath("//input[contains(@placeholder,'enter coupon code')]");
	By apply = By.xpath("//button[@id='js-voucher-apply-btn']");
	
	public ShoppingCartPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement messageIfCouponIsNotValid() {
		return driver.findElement(message);
	}
	
	public WebElement get_CouponPaceholdr() {
		return driver.findElement(couponField);
	}
	
	public WebElement get_ApplyButton() {
		return driver.findElement(apply);
	}

}
