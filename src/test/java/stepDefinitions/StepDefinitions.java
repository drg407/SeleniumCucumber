package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import resources.Base;

public class StepDefinitions extends Base {

    public WebDriver driver;

    @Given("^that I have gone to the Google page$")
    public void that_i_have_gone_to_the_google_page() throws IOException {

        driver = Base.driverSetup();

    }

    @When("^I add \"([^\"]*)\" to the search box$")
    public void i_add_something_to_the_search_box(String searchTerm) {

        googleNewsPage.getSearch().sendKeys(searchTerm);

    }

    @When("^I add (.+) to the search$")
    public void i_add_to_the_search(String searchTerm) {

        googleNewsPage.getSearch().sendKeys(searchTerm);

    }

    @Then("^a follow button should be displayed$")
    public void a_follow_button_should_be_displayed() throws Throwable {

        Assert.assertTrue(googleNewsPage.followButton().isDisplayed());

    }

    @Then("^a sign in window will appear$")
    public void a_sign_in_window_will_appear() {

        Assert.assertTrue(googleNewsPage.getSignInBanner().isDisplayed());

    }

    @And("^click the Search Button$")
    public void click_the_search_button() {

        googleNewsPage.searchButton().click();

    }

    @And("^click the Follow button$")
    public void click_the_follow_button() {

        googleNewsPage.followButton().click();

    }
}