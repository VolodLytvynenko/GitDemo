package PageobjectResources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePageObjects {

	WebDriver driver;

	public By ProductsQuantity = By.xpath("//img[contains(@src, '/b2b/medias/?')]");
	public By LinksQuantity = By.xpath("//li[@class='yCmsComponent footer__link']");


	By signIn = By.xpath("//li[contains(@class,'liOffcanvas')]//a[contains(text(),'Sign in')]");
	By brands = By.xpath("//a[contains(text(),'Brands')]");
	By logOut = By.xpath("//li[@class='liOffcanvas']//a[contains(text(),'Sign Out')]");
	By Power_Drills = By.xpath("//img[@title='Power Drills']");
	By Angle_Grinders = By.xpath("//img[@title='Angle Grinders']");
	By Screwdrivers = By.xpath("//img[@title='Screwdrivers']");
	By Sanders = By.xpath("//img[@title='Sanders']");
	By WhatsNewCarousel = By.xpath("/html[1]/body[1]/main[1]/div[3]/div[4]/div[1]/div[1]/div[2]");
	By OURBESTSELLINGPRODUCTSCarousel = By.xpath("//div[2]//div[1]//div[2]//div[1]//div[1]//div[4]//div[1]//a[1]//div[1]//img[1]");
	By Footer = By.xpath("//div[contains(text(),'SAP Commerce Cloud')]/parent::div/parent::div");


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
		return driver.findElement(Footer);
	}
	public WebElement logOut() { // The method that return: driver.findElement(By.xpath("//input[@name='login']"))
		return driver.findElement(logOut);
	}
	public WebElement Power_Drills() {
		return driver.findElement(Power_Drills);
	}
	public WebElement Angle_Grinders() {
		return driver.findElement(Angle_Grinders);
	}
	public WebElement Screwdrivers() {
		return driver.findElement(Screwdrivers);
	}
	public WebElement Sanders() {
		return driver.findElement(Sanders);
	}
	public WebElement WhatsNewCarousel() {
		return driver.findElement(WhatsNewCarousel);
	}
	public WebElement OURBESTSELLINGPRODUCTSCarousel() {

		return driver.findElement(OURBESTSELLINGPRODUCTSCarousel);
	}

	public int GetProductsQuantity() {
		List<WebElement> products =  driver.findElements(ProductsQuantity); //Identify the number of products on webpage and assign into Webelement List
		int productsCount = products.size();     // Count the total products  list on Web Page
		return productsCount;
	}
	public int FooterLiksCount() {
		List<WebElement> links =  driver.findElements(LinksQuantity); //Identify the number of products on webpage and assign into Webelement List
		int linksCount = links.size();     // Count the total links on the footer
		return linksCount;
	}

}
