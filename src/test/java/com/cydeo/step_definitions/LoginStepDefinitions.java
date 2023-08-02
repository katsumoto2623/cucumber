package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

    @When("user enters librarian username")
    public void userEntersLibrarianUsername() {
    }

    @When("user enters librarian password")
    public void user_enters_librarian_password() {

    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {

    }


    @When("user enters student username")
    public void userEntersStudentUsername() {
        System.out.println("User enters username");
    }

    @And("user enters student password")
    public void userEntersStudentPassword() {
    }

    @When("user enters admin username")
    public void userEntersAdminUsername() {
    }

    @And("user enters admin password")
    public void userEntersAdminPassword() {
    }

    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        System.out.println("user on the login page");
    }
}
