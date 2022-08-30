package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.ConfigReader;

public class AddEmployeeSteps extends CommonMethods {
    @Given("user is successfully logged into HRMS Website")
    public void user_is_successfully_logged_into_hrms_website() {
        sendText(login.userName, ConfigReader.getPropertyValue("username"));
        sendText(login.password,ConfigReader.getPropertyValue("password"));
        click(login.loginButton);
    }
    @When("user clicks on PIM and selects Add Employee")
    public void user_clicks_on_pim_and_selects_add_employee() {
        click(addEmp.pim);
        click(addEmp.addEmpLink);
    }
    @Then("user enters employee first and last name")
    public void user_enters_employee_first_and_last_name() {
        sendText(addEmp.empFirstName, "John");
        sendText(addEmp.empLastName, "Smith");
    }
    @And("clicks the save button")
    public void clicks_the_save_button() {
        click(addEmp.saveButton);
    }
    @Then("employee is added successfully")
    public void employee_is_added_successfully() {
        System.out.println("Employee added successfully");
    }

}
