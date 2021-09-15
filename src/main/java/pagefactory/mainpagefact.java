package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mainpagefact {
	
	public mainpagefact(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	
	
	
	}
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement login;
	
	
	@FindBy(xpath="//a[text()='Transfer Funds']")
	private WebElement fund;
	
	@FindBy(xpath="//input[@id='amount']")
	private WebElement ammount;
	
	@FindBy(xpath="//input[@Value='Transfer']")
	private WebElement transfer;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getFund() {
		return fund;
	}

	public WebElement getAmmount() {
		return ammount;
	}

	public WebElement getTransfer() {
		return transfer;
	}


	
	
}
