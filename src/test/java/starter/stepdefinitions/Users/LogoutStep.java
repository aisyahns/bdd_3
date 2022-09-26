package starter.stepdefinitions.Users;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStep {
    @Given("I have logged in")
    public void iHaveLoggedIn() {
        System.out.println("I have logged in");
    }

    @When("I click logout button")
    public void iClickLogoutButton() {
        System.out.println("Logout button");
    }

    @Then("I will go to login page")
    public void iWillGoToLoginPage() {
        System.out.println("Go to login page");
    }
}
