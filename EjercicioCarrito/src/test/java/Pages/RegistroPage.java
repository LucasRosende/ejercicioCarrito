package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistroPage {
	
	protected ChromeDriver driver;
	
	
	@FindBy(xpath = "/html//a[@id='signin2']")
	WebElement signupLink;
	
	@FindBy(xpath = "/html//input[@id='sign-username']")
	WebElement campoUsuario_register;
	
	@FindBy(xpath = "/html//input[@id='sign-password']")
	WebElement campoContrasenia_register;
	
	@FindBy(xpath= "//div[@id='signInModal']/div[@role='document']//div[@class='modal-footer']/button[2]")
	WebElement botonSignup;
	
	
	
	
	public RegistroPage(ChromeDriver aDriver) {
		
		this.driver = aDriver;
		PageFactory.initElements(driver, this);
	}

	public void navegarPaginaHome() {
	
	
		driver.navigate().to("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
	
}

	public void ingresarUsuario(String usuario) {
	
		campoUsuario_register.sendKeys(usuario);
	
}

	public void ingresarContrasenia(String contrasenia) {
	
		campoContrasenia_register.sendKeys(contrasenia);
	
}

	public void clicquearLinkSignup() {
	
		signupLink.click();
	
}

	public void clicquearBotonSignup() {
	
		botonSignup.click();
	
	
}



	public void esperarCampoLogin() {
	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(campoUsuario_register)).click();
	
}

	public void insertarUserYPassEnSignup(String unUsuario, String unaContrasenia) {
	
		ingresarUsuario(unUsuario);
		ingresarContrasenia(unaContrasenia);
	
	
}


}
