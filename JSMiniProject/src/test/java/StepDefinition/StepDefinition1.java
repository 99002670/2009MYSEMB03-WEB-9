package StepDefinition;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefinition1 {
	WebDriver driver = null;

	@Given("^I open the chrome browser$")
	public void i_open_the_chrome_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/home/amit/Selenium/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@When("^I enter the URL$")
	public void i_enter_the_url() throws Throwable {
		driver.get(
				"file:///home/amit/Documents/porky/JS-MiniProject/JSMiniProject/src/main/project/Views/signup.html");
	}

	@When("^I enter my full name$")
	public void i_enter_my_full_name() throws Throwable {
		driver.findElement(By.id("name")).sendKeys("Milind Mohapatra");
	}

	@When("^I enter my email address$")
	public void i_enter_my_email_address() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("mohapatra.milind@gmail.com");
	}

	@When("^I enter my phone number$")
	public void i_enter_my_phone_number() throws Throwable {
		driver.findElement(By.id("phone")).sendKeys("9090480487");
	}

	@When("^I enter my password$")
	public void i_enter_my_password() throws Throwable {
		driver.findElement(By.id("password")).sendKeys("milind11");
	}

	@When("^I enter my password again$")
	public void i_enter_my_password_again() throws Throwable {
		driver.findElement(By.id("confirmPassword")).sendKeys("milind11");
	}

	@When("^I click on Sign Up button$")
	public void i_click_on_sign_up_button() throws Throwable {
		driver.findElement(By.id("btn")).click();
	}

	@Then("^The signup page should open$")
	public void the_signup_page_should_open() throws Throwable {
		String expected = "Sign up";
    	String actual = driver.findElement(By.xpath("//*[text()=\"Sign up\"]")).getText();
    	Assert.assertEquals(expected, actual);
	}

	@Then("^My full name should display$")
	public void my_full_name_should_display() throws Throwable {
		String expected = "Milind Mohapatra";
    	String actual = driver.findElement(By.id("name")).getAttribute("value");
    	Assert.assertEquals(expected, actual);
    }

	@Then("^My email address should display$")
	public void my_email_address_should_display() throws Throwable {
		String expected = "mohapatra.milind@gmail.com";
    	String actual = driver.findElement(By.id("email")).getAttribute("value");
    	Assert.assertEquals(expected, actual);
    	}

	@Then("^My phone number should display$")
	public void my_phone_number_should_display() throws Throwable {
		String expected = "9090480487";
    	String actual = driver.findElement(By.id("phone")).getAttribute("value");
    	Assert.assertEquals(expected, actual);
    	}

	@Then("^My password should display$")
	public void my_password_should_display() throws Throwable {
		String expected = "milind11";
    	String actual = driver.findElement(By.id("password")).getAttribute("value");
    	Assert.assertEquals(expected, actual);
    	}

	@Then("^My password should display again$")
	public void my_password_should_display_again() throws Throwable {
		String expected = "milind11";
    	String actual = driver.findElement(By.id("confirmPassword")).getAttribute("value");
    	Assert.assertEquals(expected, actual);
    	}

	@Then("^I should sign up$")
	public void i_should_sign_up() throws Throwable {
		String expected = "Registered, Proceed to Login";
		String actual = driver.switchTo().alert().getText();
		Assert.assertEquals(expected, actual);
		driver.switchTo().alert().accept();
		driver.close();
	}

}
