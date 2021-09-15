package step_def;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import base.baseclass;
import commonutility.utility;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pagefactory.mainpagefact;

public class stef_def extends baseclass {
	
	//calling the pagefactory class
	mainpagefact mf;
	
	@Given("user open parabank website")
	public void user_open_parabank_website() throws IOException  {
		driver.get(prop.getProperty("url"));

	mf = PageFactory.initElements(driver,mainpagefact.class);   
	}

	@Given("user input id and password")
	public void user_input_id_and_password() throws IOException {
	 mf.getUsername().sendKeys(prop.getProperty("id"));
	 
	 //calling the highligther
	 utility.highlighter(driver);
	 mf.getPassword().sendKeys(prop.getProperty("password"));
	   
	}

	@When("click submit button")
	public void click_submit_button() throws IOException {
	    
	 mf.getLogin().click();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 utility.screenshot(driver, "dashboard");
	}

	@When("user able to click transfer button")
	public void user_able_to_click_transfer_button() {
	mf.getFund().click();   
	   
	}

	@When("put ammount and submit")
	public void put_ammount_and_submit() throws IOException {
	    
	 mf.getAmmount().sendKeys(prop.getProperty("ammount"));  
	 
	 mf.getTransfer().click();
	}

	@Then("user validate the page title")
	public void user_validate_the_page_title() {
	String validate = driver.getTitle();
	System.out.println(validate);
	   
	}

}
