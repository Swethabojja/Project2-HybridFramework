package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.OrangeHRM;

public class Scenario3 extends OrangeHRM {
	
	@BeforeTest
	public void OpenBrowsere() {
		Intialization();
		System.out.println("Browser Is Open");	
	}
	
	@Test
	public void S_3() {
		driver.findElement(By.xpath(prop.getProperty("S_3ForgotPasswxpath"))).click();
		driver.findElement(By.xpath(prop.getProperty("S_3Usernamexpath"))).sendKeys(prop.getProperty("S_3Username"));
		driver.findElement(By.xpath(prop.getProperty("S_3Submitxpath"))).click();
		driver.findElement(By.xpath(prop.getProperty("S_3ResetPasswDisplayedxpath"))).isDisplayed();
		System.out.println("Reset Password");
	}
	

	@AfterTest
	public void CloseBrowser() {
		TearDown();
		System.out.println("Browser Is Close");	
	}

}
