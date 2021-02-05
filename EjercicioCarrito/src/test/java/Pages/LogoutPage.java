package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class LogoutPage {
	
	protected ChromeDriver driver;
	
	@FindBy(xpath = "/html//a[@id='login2']")
	WebElement loginLink;
	
	@FindBy(xpath = "/html//input[@id='loginusername']")
	WebElement campoUsuario_login;
	
	@FindBy(xpath = "/html//input[@id='loginpassword']")
	WebElement campoContrasenia_login;
	
	@FindBy(xpath = "//div[@id='logInModal']/div[@role='document']//div[@class='modal-footer']/button[2]")
	WebElement botonLogin;
	
	@FindBy(xpath = "/html//a[@id='logout2']")
	WebElement logoutLink;
	
	public String usuario = "lucas.rosende10@yopmail.com";
	public String contrasenia = "contrasenia10";
	protected String textoLoginLink;
	
	
	public LogoutPage(ChromeDriver aDriver) {
		
		this.driver = aDriver;
		PageFactory.initElements(driver, this);
	}
	
	public void navegarPaginaHome() {
		
		
		driver.navigate().to("https://www.demoblaze.com/index.html");
	    driver.manage().window().maximize();
		
	}
	
	public void ingresarUsuario(String usuario) {
		
		campoUsuario_login.sendKeys(usuario);
		
	}
		
	
	public void ingresarContrasenia(String contrasenia) {
		
		campoContrasenia_login.sendKeys(contrasenia);
		
	}
	
	public void clicquearLinkLogin() {
		
		loginLink.click();
		
	}
	
	public void clicquearBotonLogin() {
		
		botonLogin.click();		
		
	}
	
	
	public void clicquearLinkLogout() {
		
		logoutLink.click();
		
	}
	
	public void esperarCampoLogin() {
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(campoUsuario_login)).click();
		
	}
	
	public void insertarUserYPassEnLogin(String unUsuario, String unaContrasenia) {
		
		esperarCampoLogin();
		ingresarUsuario(unUsuario); 
		ingresarContrasenia(unaContrasenia);		
		
	}
	
	public void loguearse(String unUsuario, String unaContrasenia) {
		
		navegarPaginaHome();
		clicquearLinkLogin();
		insertarUserYPassEnLogin(unUsuario, unaContrasenia);
		clicquearBotonLogin();		
		
	}
	
	public void seVisualizaLinkLogin() {
		
		textoLoginLink = loginLink.getAttribute("innerHTML");
		Assert.assertEquals("Log in", textoLoginLink);
		
		
	}
	
}
