package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @When("user is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        Assert.assertTrue(Driver.getDriver().getTitle().equals("Google"));
    }

    @When("user types apple in the google search box and clicks enter")
    public void userTypesAppleInTheGoogleSearchBoxAndClicksEnter() {
        googleSearchPage.textBox.sendKeys("apple"+ Keys.ENTER);

    }

    @Then("user sees Steve Jobs is in the google title")
    public void userSeesSteveJobsIsInTheGoogleTitle() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("apple"));
    }
}
