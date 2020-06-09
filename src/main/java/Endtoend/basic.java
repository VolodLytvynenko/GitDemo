package Endtoend;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class basic {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException 
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Volodymyr Lytvynenko\\eclipse-workspace\\Final\\src\\main\\java\\Endtoend\\data.properties");
		
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome"))		{
			//execute chrome browser
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Volodymyr Lytvynenko\\Desktop\\Work\\Selenium\\chromedriver\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if (browserName.equals("firefox"))
		{
			//execute firefox browser
			System.setProperty("webdriver.gecko.driver" , "C:\\Users\\Volodymyr Lytvynenko\\Desktop\\Work\\geckodriver\\geckodriver.exe");		
			 driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // if the test case is not run during 100 seconds it will be define as FAILED
		return driver;
	}
	
	public void getScreenShotPath(String testCaseName, WebDriver driver) throws IOException
	  {
	   TakesScreenshot ts = (TakesScreenshot) driver;
	   File source =ts.getScreenshotAs(OutputType.FILE); 
	   String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
	   FileUtils.copyFile(source,new File(destinationFile));
	   
	  }
	
}


