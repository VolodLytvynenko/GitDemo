package StepDefinition;

import Endtoend.basic;
import PageobjectResources.HomePageObjects;
import PageobjectResources.LoginPageObjects;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Stepdefinitions extends basic {
    @Given("^Initialized browser is a chromebrowser$")
    public void initialized_browser_is_a_chromebrowser() throws Throwable {
        driver = initializeDriver();    }

    @Given("^The web site is \"([^\"]*)\"$")
    public void the_web_site_is(String arg1) throws Throwable {
        driver.get(arg1);
        driver.manage().window().maximize();
    }

    @Given("^The user clicked on the \\[Sign in\\] button$")
    public void the_user_clicked_on_the_Sign_in_button() throws Throwable {
        HomePageObjects s = new HomePageObjects(driver);
        s.getSignIn().click();
    }
    @When("^User enters valid login \"([^\"]*)\" and valid password \"([^\"]*)\"$")
    public void user_enters_valid_login_something_and_valid_password_something(String strArg1, String strArg2) throws Throwable {
        LoginPageObjects s1 = new LoginPageObjects(driver);
        s1.get_emailAdressField().sendKeys(strArg1);
        s1.get_passwordField().sendKeys(strArg2);
    }

    @Then("^Verify the user is successfully logged in$")
    public void verify_the_user_is_successesfully_logged_in() throws Throwable {
       HomePageObjects s = new HomePageObjects(driver);
       Assert.assertTrue(s.logOut().isDisplayed());
    }

    @Then("^Verify the error message is displayed$")
    public void Verify_the_error_message_is_displayed() throws Throwable {
        LoginPageObjects s1 = new LoginPageObjects(driver);
        Assert.assertTrue(s1.get_errorMessage().isDisplayed());

    }

    @And("^Clicks on the 'Login' button$")
    public void clicksOnTheLoginButton() {
        LoginPageObjects s1 = new LoginPageObjects(driver);
        s1.get_logInButton().click();
    }
}
