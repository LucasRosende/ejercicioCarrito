package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps{
	
	ChromeDriver driver = null;
	
	LoginPage login;

	@Given("That the user has the login Modal open")
	public void that_the_user_has_the_login_modal_open() {
		
		String projectPath = System.getProperty("user.dir");		
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		login = new LoginPage(driver);
		
		login.navegarPaginaHome();
		login.clicquearLinkLogin();
		
	}

	@When("^He enters his (.*) and enters his (.*)$")
	public void he_enters_his_username_and_enters_his_contrasenia(String usuario, String contrasenia) {

		login.esperarCampoLogin();
		login.insertarUserYPassEnLogin(usuario, contrasenia);
		
	}

	@And("He clicks the Log in button")
	public void he_clicks_the_log_in_button() {

		login.clicquearBotonLogin();
		
	}

	@Then("We are logged in the page")
	public void we_are_logged_in_the_page() {
		
		Assert.assertEquals("Log out", login.traerTextoLinkLogout());
		driver.quit();
	}	

}
