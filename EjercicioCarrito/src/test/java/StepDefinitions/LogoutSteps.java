package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LogoutPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutSteps {
	
	ChromeDriver driver = null;
	
	LogoutPage logout;
	
	@Given("That the user is logged in")
	public void that_the_user_is_logged_in() throws InterruptedException {
		
		String projectPath = System.getProperty("user.dir");		
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		logout = new LogoutPage(driver);
		
		logout.loguearse(logout.usuario, logout.contrasenia);
		Thread.sleep(4000);
		
	}

	@When("He clicks on the logout button")
	public void he_clicks_on_the_logout_button() {
				
		logout.clicquearLinkLogout();
		
	}

	@Then("The user is logged out of the page")
	public void the_user_is_logged_out_of_the_page() {
		
		logout.seVisualizaLinkLogin();
		
		driver.quit();
	}
	

}
