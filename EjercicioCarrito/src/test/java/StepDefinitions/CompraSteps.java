package StepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.CompraPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CompraSteps{
	
	ChromeDriver driver = null;
	CompraPage compra;

	@Given("That the user is logged in the page")
	public void that_the_user_is_logged_in_the_page() throws InterruptedException {
		
		String projectPath = System.getProperty("user.dir");		
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		compra = new CompraPage(driver);
		
		
		compra.loguearse(compra.usuario, compra.contrasenia);
		Thread.sleep(5000);
		
	}

	@When("He clicks on a product")
	public void he_clicks_on_a_product() {
		
		compra.clicquearProducto();
		
	}

	@And("He clicks the Add to cart button")
	public void he_clicks_the_add_to_cart_button() throws InterruptedException {
		
		compra.esperarBotonAnadirProducto();
		compra.setNombreProducto(compra.nombreProducto());
		compra.cliquearBotonAniadirProducto();
		Thread.sleep(3000);
		
	}

	@Then("The product is added to the cart")
	public void the_product_is_added_to_the_cart() throws InterruptedException {
		
		new WebDriverWait(driver, 20).until(ExpectedConditions. alertIsPresent()).accept();
		driver.switchTo().alert().accept();
		
		/*try {
			
			driver.switchTo().alert().accept();
			
		}catch(Exception e) {
			
			compra.clicquearLinkCarrito();
			
		}*/
		
		compra.clicquearLinkCarrito();
		
		
		driver.getPageSource().contains(compra.getNombreProducto());
		
		driver.quit();
	}
	
	
}
