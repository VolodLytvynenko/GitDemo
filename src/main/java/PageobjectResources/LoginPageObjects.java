package PageobjectResources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	WebDriver driver;
	
	By emailAdressField = By.id("j_username");
	By passwordField = By.id("j_password");
	By logInButton = By.xpath("//button[@class='btn btn-primary btn-block']"); 
	By forgotPasswordElement = By.cssSelector("a[data-cbox-title = 'Reset Password']");
	By errorMessage = By.xpath("//div[@class='alert alert-danger alert-dismissable getAccAlert']");
	
	public LoginPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement get_emailAdressField() {
		return driver.findElement(emailAdressField);
	}
	
	public WebElement get_passwordField() {
		return driver.findElement(passwordField);
	}
	public WebElement get_forgotPasswordElement() {
		return driver.findElement(forgotPasswordElement);
    }	
	public WebElement get_logInButton() {
		return driver.findElement(logInButton);
    }
    public WebElement get_errorMessage() {
		return driver.findElement(errorMessage);
	}
}
