package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	public WebDriver driver;
	
	public LandingPage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	// Page object we use By 
	By password = By.id("password");
	
	// Page factory we use @FindBy annotaion
	
	@FindBy(id="username")
	WebElement username;

	public WebElement getUsername() {
		 return username;	
	}
	
	public WebElement getPassword() {
		 return driver.findElement(password);	
	}
}
