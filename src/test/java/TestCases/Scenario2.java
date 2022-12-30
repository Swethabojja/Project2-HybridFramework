package TestCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.OrangeHRM;

public class Scenario2 extends OrangeHRM {
	
	@BeforeTest
	public void OpenBrowsere() {
		Intialization();
		System.out.println("Browser Is Open");
	}
	@Test
	public void S_2() throws AWTException {
		driver.findElement(By.xpath(prop.getProperty("Usernamexpath"))).sendKeys(prop.getProperty("Username"));
		driver.findElement(By.xpath(prop.getProperty("Passwordxpath"))).sendKeys(prop.getProperty("Password"));
		driver.findElement(By.xpath(prop.getProperty("Loginxpath"))).click();
		System.out.println("a1");
		driver.findElement(By.xpath(prop.getProperty("S_2PIMMenu"))).click();
		System.out.println("a2");
		driver.findElement(By.xpath(prop.getProperty("S_2PIMAddButton"))).click();
		System.out.println("a3");
		WebElement Button = driver.findElement(By.xpath(prop.getProperty("S_2PICAddButton")));
		Button.click();
		Robot rb = new Robot();
		rb.delay(3000);
		StringSelection ss = new StringSelection(prop.getProperty("S_2StringSelection"));
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("a4");
		driver.findElement(By.xpath(prop.getProperty("S_2Firstnamexpath"))).sendKeys(prop.getProperty("S_2Firstname"));
		System.out.println("a5");
		driver.findElement(By.xpath(prop.getProperty("S_2Middlenamexpath"))).sendKeys(prop.getProperty("S_2Middlename"));
		System.out.println("a6");
		driver.findElement(By.xpath(prop.getProperty("S_2Lastnamexpath"))).sendKeys(prop.getProperty("S_2Lastname"));
		System.out.println("a7");
		driver.findElement(By.xpath(prop.getProperty("S_2EmployeeIDxpath"))).sendKeys("24");
		System.out.println("a8");
		driver.findElement(By.xpath(prop.getProperty("S_2CreateLoginDetailsButton"))).click();
		System.out.println("a9");
		driver.findElement(By.xpath(prop.getProperty("S_2Usernamexpath"))).sendKeys(prop.getProperty("S_2Username"));
		System.out.println("1");
		driver.findElement(By.xpath(prop.getProperty("S_2Passwordxpath"))).sendKeys(prop.getProperty("S_2Password"));
		System.out.println("2");
		driver.findElement(By.xpath(prop.getProperty("S_2Confirmpasswordxpath"))).sendKeys(prop.getProperty("S_2Confirmpassword"));
		System.out.println("3");
		driver.findElement(By.xpath(prop.getProperty("S_2SaveButtonxpath"))).click();
		System.out.println("User Is Added");
		driver.findElement(By.xpath(prop.getProperty("Logoutdropdownxpath"))).click();
		driver.findElement(By.xpath(prop.getProperty("Logoutxpath"))).click();
		System.out.println("Logout");
	}

	@AfterTest
	public void CloseBrowser() {
		TearDown();
		System.out.println("Browser Is Close");
	}
}
