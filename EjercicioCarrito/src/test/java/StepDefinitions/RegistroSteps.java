package StepDefinitions;


import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.RegistroPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class RegistroSteps{
	
	
	ChromeDriver driver = null;
	
	RegistroPage registro;


	@Given("That the user has the Registration Modal open")
	public void that_the_user_has_the_registration_modal_open() {
		
		String projectPath = System.getProperty("user.dir");		
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
		
		
		driver = new ChromeDriver();
		registro = new RegistroPage(driver);
		
		registro.navegarPaginaHome();
		registro.clicquearLinkSignup();
		
		
	}

	@When("^He enters a (.*) and enters a (.*)$")
	public void he_enters_a_username_and_enters_a_contrasenia(String usuario, String contrasenia) {
		
		registro.esperarCampoLogin();
		registro.insertarUserYPassEnSignup(usuario, contrasenia);
	    
	}


	@And("He clicks the Sign Up button")
	public void he_clicks_the_sign_up_button() {
		
		registro.clicquearBotonSignup();		
		
	}

	@Then("The box that shows us that the registration has been successful is displayed")
	public void the_box_that_shows_us_that_the_registration_has_been_successful_is_displayed() {
	    
		driver.switchTo().alert();

		
		driver.quit();
		
	}
	

}
