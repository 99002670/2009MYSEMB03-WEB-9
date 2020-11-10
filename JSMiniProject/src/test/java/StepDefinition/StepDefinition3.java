package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
public class StepDefinition3 {
	WebDriver driver = null;

	@Given("^I open the chrome browser2$")
	public void i_open_the_chrome_browser2() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/home/milind/Downloads/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@When("^I enter the URL2$")
	public void i_enter_the_url2() throws Throwable {
		driver.get(
				"file:///home/milind/Documents/JavaScript%20Codes/MiniProject/JSMiniProject/src/main/project/Views/index.html");
	}

	@When("^I enter my email address2$")
	public void i_enter_my_email_address2() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("mohapatra.milind@gmail.com");
	}

	@When("^I enter my password2$")
	public void i_enter_my_password2() throws Throwable {
		driver.findElement(By.id("password")).sendKeys("milind11");
	}

	@When("^I click on Log In button$")
	public void i_click_on_log_in_button() throws Throwable {
		driver.findElement(By.id("btn")).click();
	}

	@Then("^The login page should open$")
	public void the_login_page_should_open() throws Throwable {
		String expected = "Log in";
		String actual = driver.findElement(By.xpath("//*[text()='Log in']")).getText();
		Assert.assertEquals(expected, actual);
	}

	@Then("^My email address should display2$")
	public void my_email_address_should_display2() throws Throwable {
		String expected = "mohapatra.milind@gmail.com";
    	String actual = driver.findElement(By.id("email")).getAttribute("value");
    	Assert.assertEquals(expected, actual);
    	}

	@Then("^My password should display2$")
	public void my_password_should_display2() throws Throwable {
		String expected = "milind11";
    	String actual = driver.findElement(By.id("password")).getAttribute("value");
    	Assert.assertEquals(expected, actual);
    	}

	@Then("^I should log in$")
	public void i_should_log_in() throws Throwable {
		System.out.println("Log in");
		driver.close();
	}

}