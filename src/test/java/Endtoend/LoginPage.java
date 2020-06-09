package Endtoend;
import org.testng.annotations.Test;
import java.io.IOException;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import PageobjectResources.HomePageObjects;
import PageobjectResources.LoginPageObjects;
public class LoginPage extends basic {
	public WebDriver driver; // the declaration of the driver here will help to execute test cases step by step

	@Test(dataProvider = "getData")
	public void ValidLogin(String username, String password) throws IOException, InterruptedException {
		driver = initializeDriver();
		driver.get("https://electronics.demo-1905.zaelab.com/b2c/electronics/en/");
		driver.manage().window().maximize();
		HomePageObjects s = new HomePageObjects(driver);
		s.getSignIn().click();
		LoginPageObjects s1 = new LoginPageObjects(driver);
		s1.get_emailAdressField().sendKeys(username);
		s1.get_passwordField().sendKeys(password);
		s1.get_logInButton().click();
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][]data = new Object[3][2]; //1) 'Users[][]data' - Here we declared massive 2) 'new Users[2][1];' Here we Allocated massive
		   // we have 3 users
		   // each user has 2 Data: 1) Login 2) password
				
		data[0][0] = "preferred@user.com";
		data[0][1] = "";
		
		data[1][0] = ""; 
		data[1][1] = "12341234";
		
		data[2][0] = "preferred@user.com"; 
		data[2][1] = "12341234";
		return data;
	}
}
