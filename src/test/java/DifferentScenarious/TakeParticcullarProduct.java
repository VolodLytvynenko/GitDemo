package DifferentScenarious;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class TakeParticcullarProduct extends Endtoend.basic {
    public WebDriver driver;

//    in thi example the products that are presented in te array should be clicked on the [CONFIGURE] button
    @Test
    public void takeParticullarProduct() throws IOException, InterruptedException {
        driver = initializeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        /*The attribute value is just 'button' that is generic and 20 elements have the sae elements*/
        // 1) Identify the whole block of the product by the uniq text or uniq attribute
        // 2) Get the xpath of the all products with the current attribute and put it to the List<WebElement> products = driver.findElements(By.xpath(""))
        // 3)  Create 'for' loop to iterate the all web elements
        // 4) get products by the text  or by the attribute "products.get(i).getText()"
        // 5) click on the [add to cart] of the product index of which has the 'cucumber' text


        List<WebElement> products = driver.findElements(By.xpath("//button[contains(text(),'ADD TO CART')]")); // 2) findElements will give you all the matches with this elements

        for (int i=0; i<products.size(); i++) // 3)
                                              //i<products.size() means that the size of the products will be incremented 30 times if we have 30 matched elements
        {
            String name = products.get(i).getText(); //products.get will put the particular product among all our 30 web elements.
                                      // getText - means that the text of all products will be taken sequentially
            {
                if (name.contains("Cucumber"))
                {
                    //click on the [add to cart]
                    driver.findElements(By.xpath("//button[contains(text(),'ADD TO CART')]")).get(i).click(); //button[contains(text(),'ADD TO CART')]
                    break;
                }
            }
        }
    }


}
