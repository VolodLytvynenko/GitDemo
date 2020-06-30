package DifferentScenarious;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class TakeParticcullarProductByArray extends Endtoend.basic {
    public WebDriver driver;

//    in thi example the products that are presented in te array should be clicked on the [CONFIGURE] button
    @Test
    public void takeParticullarProduct() throws IOException, InterruptedException {
        driver = initializeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        int j = 0;


        /*The attribute value is just 'button' that is generic and 20 elements have the sae elements*/
        // 1) Declare array with the list of the items that yow want to get
        // 2) Check whether the name of the product is presented into the array
        // 3) convert array into the array list
        // 4) (Optional) Format the name of the text using .trim(); and .split

        // 1) Identify the whole block of the product by the uniq text or uniq attribute
        // 2) Get the xpath of the all products with the current attribute and put it to the List<WebElement> products = driver.findElements(By.xpath(""))
        // 3)  Create 'for' loop to iterate the all web elements
        // 4) get products by the text  or by the attribute "products.get(i).getText()"
        // 5) click on the [add to cart] of the product index of which has the 'cucumber' text

        List<WebElement> products = driver.findElements(By.xpath("//button[contains(text(),'ADD TO CART')]")); // 2) findElements will give you all the matches with this elements

        String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};

        // 2) findElements will give you all the matches with this elements

        for (int i=0; i<products.size(); i++) // 3)
                                              //i<products.size() means that the size of the products will be incremented 30 times if we have 30 matched elements
        {
            String[] name = products.get(i).getText().split("-");
            // .split("-");  - means that we splited the text after '-' into the  2 parts: 1) Brocolli 2) - 1 Kg
            //products.get will put the particular product among all our 30 web elements.
            // getText - means that the text of all products will be taken sequentially
            String FormattedName=name[0].trim();
    //name[0].trim(); we formatted the text and did it without spaces. As the text is divided into the 2 parts, we take the first one which located into the first index of array name[0]



            {
                List ItemNeededList = Arrays.asList(FormattedName);
                if (ItemNeededList.contains(name))
                {
                    j++;
                    //click on the [add to cart]
                    driver.findElements(By.xpath("//button[contains(text(),'ADD TO CART')]")).get(i).click(); //button[contains(text(),'ADD TO CART')]
                    if (j==3){  //we did it in order the break will happened if the 2 products are found
                        break;
                    }

                }
            }
        }
    }


}
