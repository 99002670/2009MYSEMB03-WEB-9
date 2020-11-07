package StepDefinition;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefinition {
	WebDriver driver = null;
	
	@Given("^I open the chrome browser$")
    public void i_open_the_chrome_browser() throws Throwable {
        throw new PendingException();
    }

    @When("^I enter the URL$")
    public void i_enter_the_url() throws Throwable {
        throw new PendingException();
    }

    @When("^I enter my full name$")
    public void i_enter_my_full_name() throws Throwable {
        throw new PendingException();
    }

    @When("^I enter my email address$")
    public void i_enter_my_email_address() throws Throwable {
        throw new PendingException();
    }

    @When("^I enter my phone number$")
    public void i_enter_my_phone_number() throws Throwable {
        throw new PendingException();
    }

    @When("^I enter my password$")
    public void i_enter_my_password() throws Throwable {
        throw new PendingException();
    }

    @When("^I enter my password again$")
    public void i_enter_my_password_again() throws Throwable {
        throw new PendingException();
    }

    @When("^I click on Sign Up button$")
    public void i_click_on_sign_up_button() throws Throwable {
        throw new PendingException();
    }

    @Then("^The signup page should open$")
    public void the_signup_page_should_open() throws Throwable {
        throw new PendingException();
    }

    @Then("^My full name should display$")
    public void my_full_name_should_display() throws Throwable {
        throw new PendingException();
    }

    @Then("^My email address should display$")
    public void my_email_address_should_display() throws Throwable {
        throw new PendingException();
    }

    @Then("^My phone number should display$")
    public void my_phone_number_should_display() throws Throwable {
        throw new PendingException();
    }

    @Then("^My password should display$")
    public void my_password_should_display() throws Throwable {
        throw new PendingException();
    }

    @Then("^My password should display again$")
    public void my_password_should_display_again() throws Throwable {
        throw new PendingException();
    }

    @Then("^I should sign up$")
    public void i_should_sign_up() throws Throwable {
        throw new PendingException();
    }

}
