package SeleniumFrameworkProject.E2ETesting;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pageObjects.LandingPage;
import resources.base;

public class HomePage extends base {
	
	@Test(dataProvider = "getData")
	public void navigateHomePage(String username,String password, String title) throws IOException {
		driver = initializeDriver();
		driver.get("https://staging01.sims.co.uk/");
		LandingPage lp = new LandingPage(driver);
		lp.getUsername().sendKeys(username);
		lp.getPassword().sendKeys(password);
		String actual_title = driver.getTitle().trim();
		System.out.println(title);
		AssertJUnit.assertEquals(actual_title, title);
		
		
	//	driver.findElements(By.)
		
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("In Before Suite");
		
	}
	
	@BeforeTest
	public void beforeTest() {


	System.out.println("In Before Test master");
		
	}
	
	@BeforeClass
	public void beforeClass() {

		System.out.println("In Before class");
		
	}
	
	
	@BeforeMethod
	public void beforeMethod() {

		System.out.println("In Before Method");
		
	}
	
	@AfterMethod
	public void afterTest() {

		System.out.println("In After Test");
		driver.quit();		
	}
	
	@DataProvider
	public Object[][] getData() {
		
		// i = row stands for how many different datatype test should run
		// j = column stands for how many values per test
		Object[][] data= new Object[3][3];
		data[0][0] = "test0";
		data[0][1] = "test0";
		data[0][2] = "SIMS ID";
		
		data[1][0] = "test1";
		data[1][1] = "test1";
		data[1][2] = "SIMS ID1";
	
		data[2][0] = "test2";
		data[2][1] = "test2";
		data[2][2] = "SIMS ID";
		
		
		return data;
		     
	}
	

}
