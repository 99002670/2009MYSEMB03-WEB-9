package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
public class StepDefinition4 {
	WebDriver driver = null;
	
    @Given("^I open the chrome browser3$")
    public void i_open_the_chrome_browser3() throws Throwable {
    	System.setProperty("webdriver.chrome.driver", "/home/milind/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}

    @When("^I enter the URL3$")
    public void i_enter_the_url3() throws Throwable {
    	driver.get(
				"file:///home/milind/Documents/JavaScript%20Codes/MiniProject/JSMiniProject/src/main/project/Views/index.html");
	    }

    @When("^I do not enter email3$")
    public void i_do_not_enter_email3() throws Throwable {
    	driver.findElement(By.id("email")).sendKeys("");
    	}

    @When("^I enter invalid email3$")
    public void i_enter_invalid_email3() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("mohapatra.milind#gmail.com");
    }

    @When("^I do not enter password3$")
    public void i_do_not_enter_password3() throws Throwable {
    	driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("mohapatra.milind@gmail.com");
		driver.findElement(By.id("password")).sendKeys("");
		}

    @When("^I enter nonregistered email and password$")
    public void i_enter_nonregistered_email_and_password() throws Throwable {
    	driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("email")).sendKeys("mohapatra.milind@gmail.com");
		driver.findElement(By.id("password")).sendKeys("milind");
    }

    @Then("^The login page should open3$")
    public void the_login_page_should_open3() throws Throwable {
    	String expected = "Log in";
		String actual = driver.findElement(By.xpath("//*[text()='Log in']")).getText();
		Assert.assertEquals(expected, actual);
		}

    @Then("^email mandatory error message should dislpay3$")
    public void email_mandatory_error_message_should_dislpay3() throws Throwable {
    	String expected = "Email is mandatory";
		String actual = driver.findElement(By.id("errEmail")).getText();
		Assert.assertEquals(expected, actual);
		}

    @Then("^email invalid message should display3$")
    public void email_invalid_message_should_display3() throws Throwable {
    	String expected = "Email is not in a valid format";
		String actual = driver.findElement(By.id("errEmail")).getText();
		Assert.assertEquals(expected, actual);
		}

    @Then("^password mandataory error message should display3$")
    public void password_mandataory_error_message_should_display3() throws Throwable {
    	String expected = "Password is mandatory";
		String actual = driver.findElement(By.id("errEmail")).getText();
		Assert.assertEquals(expected, actual);
		}

    @Then("^invalid credentials error message should display$")
    public void invalid_credentials_error_message_should_display() throws Throwable {
    	String expected = "Invalid credentials";
		String actual = driver.findElement(By.id("errEmail")).getText();
		Assert.assertEquals(expected, actual);
		System.out.println("Invalid credentials");
    }

    @And("^I click on Log In button3$")
    public void i_click_on_log_in_button3() throws Throwable {
    	driver.findElement(By.id("btn")).click();
    }

}