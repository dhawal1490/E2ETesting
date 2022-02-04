package resources;

import java.io.FileInputStream;
import org.apache.logging.log4j.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	public WebDriver driver;
	public static final String USERNAME = "dhawalmokashi1";
	public static final String AUTOMATE_KEY = "KaXpZA8NmU2tUVDpJje8";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

 
	
	
	public WebDriver initializeDriver() throws IOException {
		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream("//Users/dhawalmokashi/eclipse-workspace/E2ETesting/src/main/java/resources/data.properties");
		pro.load(fis);
		
		
		
		//Setting system properties of ChromeDriver
		
		System.setProperty("webdriver.chrome.driver", "//Users/dhawalmokashi/Documents/seleniumdrivers/chromedriver/chromedriver");
		System.out.println(pro.getProperty("browser"));
		String browser = pro.getProperty("browser");
		//chrome
		if(browser.equals("chrome")) {
		//driver = new RemoteWebDriver(new URI(URL));

		 driver = new ChromeDriver();
		 //driver = driver.Chrome(ChromeDriverManager().install());
		}
		else if(browser == "firefox") {
			
		}else if(browser == "IE") {
			
		}
		return driver;
		}
}
