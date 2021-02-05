package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CompraPage {
	
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
	
	@FindBy(xpath = "/html//div[@id='tbodyid']//a[@href='#']")
	WebElement botonAniadirProducto;
	
	@FindBy(xpath = "/html//div[@id='tbodyid']/div[2]//h4/a[@href='prod.html?idp_=2']")
	WebElement producto;
	
	@FindBy(xpath = "//div[@id='navbarExample']/ul/li[4]/a[@href='#']")
	WebElement carritoLink;
	
	protected String nombreProducto;
	public String usuario = "lucas.rosende10@yopmail.com";
	public String contrasenia = "contrasenia10";
	
	public CompraPage(ChromeDriver aDriver) {
		
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
	
	public void setNombreProducto(String unNombre) {
		
		nombreProducto = unNombre;
		
	}
	
	
	public String getNombreProducto(){
		
		return nombreProducto;
		
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
	public void clicquearProducto() {
		
		producto.click();
		
	}
	
	public void cliquearBotonAniadirProducto() {
		
		botonAniadirProducto.click();
		
	}
	
	public void clicquearLinkCarrito() {
		
		carritoLink.click();
		
	}
	
	public String nombreProducto() {
		
		return producto.getAttribute("innerHTML");
		
	}
	
	public void esperarCampoLogin() {
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(campoUsuario_login)).click();
		
	}
	
	public void esperarBotonAnadirProducto() {
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(botonAniadirProducto)).click();
		
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

}
