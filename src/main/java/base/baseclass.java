package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {
	public WebDriver driver;
	public Properties prop;
	
	
	public baseclass() {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("./config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		
	System.setProperty("webdriver.chrome.driver","/Users/ashrafhossain/Downloads/92/chromedriver");
	
	driver = new ChromeDriver();
	
	
	}
}


