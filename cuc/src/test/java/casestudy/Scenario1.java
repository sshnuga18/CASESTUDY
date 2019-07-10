package casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario1 {

	WebDriver driver;
	@Given("url for registration is {string}")
	public void url_for_registration_is(String string) {
		String chromePath="C:\\Users\\a07208trng_b4a.04.26\\Desktop\\selenium_eclipse\\jar\\chromedriver_win32 (1)\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		driver= new ChromeDriver();
		driver.get(string);
		driver.manage().window().maximize();
	}

	@When("usr enter username as {string}")
	public void usr_enter_username_as(String string) {
		driver.findElement(By.name("userName")).sendKeys(string);
	}

	@When("usr enter firstname as {string}")
	public void usr_enter_firstname_as(String string) {
		driver.findElement(By.name("firstName")).sendKeys(string);
	}

	@When("usr enter lastname as {string}")
	public void usr_enter_lastname_as(String string) {
		driver.findElement(By.name("lastName")).sendKeys(string);
	}

	@When("usr enter password as {string}")
	public void usr_enter_password_as(String string) {
		driver.findElement(By.name("password")).sendKeys(string);
	}

	@When("usr enter confirmpassword as {string}")
	public void usr_enter_confirmpassword_as(String string) {
		driver.findElement(By.name("confirmPassword")).sendKeys(string);
	}

	@When("usr enter gender as {string}")
	public void usr_enter_gender_as(String string) {
		driver.findElement(By.xpath("//input[@id='gender'][1]")).click();
	}

	@When("usr enter email as {string}")
	public void usr_enter_email_as(String string) {
		driver.findElement(By.name("emailAddress")).sendKeys(string);
	}

	@When("usr enter mobilenumber as {string}")
	public void usr_enter_mobilenumber_as(String string) {
		driver.findElement(By.name("mobileNumber")).sendKeys(string);
	}

	@When("usr enter Dob as {string}")
	public void usr_enter_Dob_as(String string) {
		driver.findElement(By.name("dob")).sendKeys(string);
	}

	@When("usr enter address as {string}")
	public void usr_enter_address_as(String string) {
		driver.findElement(By.name("address")).sendKeys(string);
	}

	@When("usr enter security question as {string}")
	public void usr_enter_security_question_as(String string) {
		Select sel=new Select(driver.findElement(By.name("securityQuestion")));
		sel.selectByIndex(1);
	}

	@When("usr enter answer as {string}")
	public void usr_enter_answer_as(String string) {
		driver.findElement(By.name("answer")).sendKeys(string);
	}

	@Then("usr is in login page")
	public void usr_is_in_login_page() {
		driver.findElement(By.name("Submit")).click();
	}


}
