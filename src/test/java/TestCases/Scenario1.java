package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.OrangeHRM;

public class Scenario1 extends OrangeHRM {
	@BeforeTest
	public void OpenBrowsere() {
		Intialization();
		System.out.println("Browser Is Open");
	}
	@Test
	public void S_1() {
		driver.findElement(By.xpath(prop.getProperty("Usernamexpath"))).sendKeys(prop.getProperty("Username"));
		driver.findElement(By.xpath(prop.getProperty("Passwordxpath"))).sendKeys(prop.getProperty("Password"));
		driver.findElement(By.xpath(prop.getProperty("Loginxpath"))).click();
		driver.findElement(By.xpath(prop.getProperty("Logoutdropdownxpath"))).click();
		driver.findElement(By.xpath(prop.getProperty("Logoutxpath"))).click();
		System.out.println("Login And Logout Successfull");	
	}

	@AfterTest
	public void CloseBrowser() {
		TearDown();
		System.out.println("Browser Is Close");	
	}
}
