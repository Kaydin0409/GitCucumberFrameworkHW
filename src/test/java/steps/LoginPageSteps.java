package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigReader;

import java.util.Collections;

public class LoginPageSteps extends CommonMethods {

    @Given("user navigates to HRMS website")
    public void user_navigates_to_hrms_website() {

    }
    @When("user enters valid admin username and password")
    public void user_enters_valid_admin_username_and_password() {
        sendText(login.userName, ConfigReader.getPropertyValue("username"));
        sendText(login.password,ConfigReader.getPropertyValue("password"));
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
       click(login.loginButton);
    }
    @Then("user is successfully logged in to HRMS")
    public void user_is_successfully_logged_in_to_hrms() {
        System.out.println("Admin user is successfully logged in");
    }
}
