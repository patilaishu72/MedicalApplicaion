package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	WebDriver driver;
	@Given("Open the chrome browser and url of application")
	public void open_the_chrome_browser_and_url_of_application() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		driver.manage().window().maximize();
		System.out.println("**LOGIN PAGE**");
	    
	}

	@When("Enter the valid Username and password")
	public void enter_the_valid_username_and_password() {
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("Admin123");
		driver.findElement(By.id("Inpatient Ward")).click();
		
	   
	}

	@When("click on login button")
	public void click_on_login_button() {
	  driver.findElement(By.id("loginButton")).click();
	  System.out.println(" CLICK TO LOGIN BUTTON ");
	  
	}

	@Then("Login to the Account")
	public void login_to_the_account() {
		
		System.out.println("LOGIN SUCCESFUL");
		driver.quit();
	}

	@When("Enter the invalid Username and password")
	public void enter_the_invalid_username_and_password() {
		driver.findElement(By.id("username")).sendKeys("Adm");
		driver.findElement(By.id("password")).sendKeys("Adm123");
		driver.findElement(By.id("Inpatient Ward")).click();
	   
	}

	@Then("Error Message to be the display-invalid details")
	public void error_message_to_be_the_display_invalid_details() {
		driver.findElement(By.id("loginButton")).click();
	    System.out.println("Error Message to be the display");
	}
	@When("Enter {string} & {string}")
	public void enter(String username, String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("Inpatient Ward")).click();
	    
	}


	

	@When("Enter the valid deatils")
	public void enter_the_valid_deatils(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	   List<Map<String,String>> data= dataTable.asMaps(String.class, String.class);
	   System.out.println(data.get(0).get("username"));
	   System.out.println(data.get(0).get("password"));
	   driver.findElement(By.id("username")).sendKeys(data.get(0).get("username"));
		driver.findElement(By.id("password")).sendKeys(data.get(0).get("password"));
		driver.findElement(By.id("Inpatient Ward")).click();
	}

}
