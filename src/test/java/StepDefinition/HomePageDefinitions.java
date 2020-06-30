package StepDefinition;

import Endtoend.basic;

import PageobjectResources.HomePageObjects;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class HomePageDefinitions extends basic {

    @Given("^Initialized browser is a chrome$")
    public void initialized_browser_is_a_chrome() throws Throwable {
        driver = initializeDriver();
    }

    @When("^Homepage is opened \"([^\"]*)\"$")
    public void homepage_is_opened(String arg1) throws Throwable {
        driver.get(arg1);
        driver.manage().window().maximize();
        Thread.sleep(1000);
    }

    @Then("^POWER DRILLS, ANGLE GRINDERS, SCREWDRIWERS, SANDERS Categories are displayed$")
    public void power_DRILLS_ANGLE_GRINDERS_SCREWDRIWERS_SANDERS_Categories_are_displayed() throws Throwable {
        HomePageObjects hpo = new HomePageObjects(driver);
        Assert.assertTrue(hpo.Angle_Grinders().isDisplayed());
        Assert.assertTrue(hpo.Screwdrivers().isDisplayed());
        Assert.assertTrue(hpo.Sanders().isDisplayed());
        Assert.assertTrue(hpo.Power_Drills().isDisplayed());    }

    @Then("^Products in the WHAT'S NEW section$")
    public void products_in_the_WHAT_S_NEW_section() throws Throwable {
        HomePageObjects hpo = new HomePageObjects(driver);
        Assert.assertTrue(hpo.WhatsNewCarousel().isDisplayed());    }

    @Then("^Products in the OUR BESTSELLING PRODUCTS section$")
    public void products_in_the_OUR_BESTSELLING_PRODUCTS_section() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^Total count of products on the home page = (\\d+)$")
    public void total_count_of_products_on_the_home_page(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("^The footer is displayed$")
    public void the_footer_is_displayed() throws Throwable {
        HomePageObjects hpo = new HomePageObjects(driver);
        Assert.assertTrue(hpo.getFooter().isDisplayed());
    }

    @Then("^The (\\d+) links are displayed in the footer$")
    public void the_links_are_displayed_in_the_footer(int arg1) throws Throwable {
        HomePageObjects hpo = new HomePageObjects(driver);
        hpo.FooterLiksCount();
    }

}
