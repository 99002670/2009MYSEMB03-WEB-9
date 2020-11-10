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
public class StepDefinition2 {
	WebDriver driver = null;

	@Given("^I open the chrome browser1$")
	public void i_open_the_chrome_browser1() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/home/milind/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@When("^I enter the URL1$")
	public void i_enter_the_url1() throws Throwable {
		driver.get(
				"file:///home/milind/Documents/JavaScript%20Codes/MiniProject/JSMiniProject/src/main/project/Views/signup.html");
	}

	@When("^I do not enter name$")
	public void i_do_not_enter_name() throws Throwable {
		driver.findElement(By.id("name")).sendKeys("");
	}

	@When("^I do not enter email$")
	public void i_do_not_enter_email() throws Throwable {
		driver.findElement(By.id("name")).sendKeys("Milind Mohapatra");
		driver.findElement(By.id("email")).sendKeys("");
	}

	@When("^I enter invalid email$")
	public void i_enter_invalid_email() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("mohapatra.milind#gmail.com");
	}

	@When("^I do not enter phone number$")
	public void i_do_not_enter_phone_number() throws Throwable {
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("mohapatra.milind@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("");
	}

	@When("^I enter invalid phone number$")
	public void i_enter_invalid_phone_number() throws Throwable {
		driver.findElement(By.id("phone")).sendKeys("9090fgh487");
	}

	@When("^I do not enter password$")
	public void i_do_not_enter_password() throws Throwable {
		driver.findElement(By.id("phone")).clear();
		driver.findElement(By.id("phone")).sendKeys("9090480487");
		driver.findElement(By.id("password")).sendKeys("");
	}

	@When("^I enter an invalid password$")
	public void i_enter_an_invalid_password() throws Throwable {
		driver.findElement(By.id("password")).sendKeys("mili");
	}

	@When("^I enter nonmatching password$")
	public void i_enter_nonmatching_password() throws Throwable {
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("milind11");
		driver.findElement(By.id("confirmPassword")).sendKeys("milind");
	}

	@Then("^The signup page should open1$")
	public void the_signup_page_should_open() throws Throwable {
		String expected = "Sign up";
		String actual = driver.findElement(By.xpath("//*[text()=\"Sign up\"]")).getText();
		Assert.assertEquals(expected, actual);
	}

	@Then("^name mandataory error message should display$")
	public void name_mandataory_error_message_should_display() throws Throwable {
		String expected = "Name is mandatory";
		String actual = driver.findElement(By.id("errName")).getText();
		Assert.assertEquals(expected, actual);
	}

	@Then("^email mandatory error message should display$")
	public void email_mandatory_error_message_should_display() throws Throwable {
		String expected = "Email is mandatory";
		String actual = driver.findElement(By.id("errEmail")).getText();
		Assert.assertEquals(expected, actual);
	}

	@Then("^email invalid message should display$")
	public void email_invalid_message_should_display() throws Throwable {
		String expected = "Email is not in a valid format";
		String actual = driver.findElement(By.id("errEmail")).getText();
		Assert.assertEquals(expected, actual);
	}

	@Then("^number mandatory error message should display$")
	public void number_mandatory_error_message_should_display() throws Throwable {
		String expected = "Phone number is mandatory";
		String actual = driver.findElement(By.id("errPhone")).getText();
		Assert.assertEquals(expected, actual);
	}

	@Then("^number invalid message should display$")
	public void number_invalid_message_should_display() throws Throwable {
		String expected = "Phone number is not in a valid format";
		String actual = driver.findElement(By.id("errPhone")).getText();
		Assert.assertEquals(expected, actual);
	}

	@Then("^password mandataory error message should display$")
	public void password_mandataory_error_message_should_display() throws Throwable {
		String expected = "Password is mandatory";
		String actual = driver.findElement(By.id("errPassword")).getText();
		Assert.assertEquals(expected, actual);
	}

	@Then("^password invalid message should display$")
	public void password_invalid_message_should_display() throws Throwable {
		String expected = "Password must be atleast 8 charachters";
		String actual = driver.findElement(By.id("errPassword")).getText();
		Assert.assertEquals(expected, actual);
	}

	@Then("^nonmatching password message should display$")
	public void nonmatching_password_message_should_display() throws Throwable {
		String expected = "Password does not match";
		String actual = driver.findElement(By.id("errConfirmPassword")).getText();
		Assert.assertEquals(expected, actual);
		driver.close();
	}

	@And("^I click on Sign Up button1$")
	public void i_click_on_sign_up_button1() throws Throwable {
		driver.findElement(By.id("btn")).click();
	}

}
