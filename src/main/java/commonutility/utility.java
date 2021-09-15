package commonutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;

import pagefactory.mainpagefact;

public class utility {
	public static void screenshot(WebDriver driver,String picturename) throws IOException {
	
	File folder = new File("./target/screenshot");
	TakesScreenshot ts =(TakesScreenshot)driver;
	File file = ts.getScreenshotAs(OutputType.FILE);
	Files.copy(file, new File(picturename+".png"));
	}
	
	public static void highlighter(WebDriver driver) {
		
	//calling method from pagefactory
	mainpagefact pg = new mainpagefact(driver);	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	WebElement user=pg.getUsername();
	js.executeScript("arguments[0].style.border='10px solid yellow'", user);
	
	WebElement password=pg.getPassword();
	js.executeScript("arguments[0].style.border='5px solid yellow'", password);
	
	WebElement button=pg.getLogin();
	js.executeScript("arguments[0].style.border='5px solid red'", button);
	
	}

}
