package TestCases;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.OrangeHRM;

public class Scenario5 extends OrangeHRM {

	@BeforeTest
	public void OpenBrowsere() {
		Intialization();
		System.out.println("Browser Is Open");
	
	}
	@Test
	public void S_5() throws AWTException {
		driver.findElement(By.xpath(prop.getProperty("Usernamexpath"))).sendKeys(prop.getProperty("Username"));
		driver.findElement(By.xpath(prop.getProperty("Passwordxpath"))).sendKeys(prop.getProperty("Password"));
		driver.findElement(By.xpath(prop.getProperty("Loginxpath"))).click();
		System.out.println("1");
		driver.findElement(By.xpath(prop.getProperty("S_4S_5RecruitmentMenu"))).click();
		System.out.println("2");
		driver.findElement(By.xpath(prop.getProperty("S_5VacanciesMenu"))).click();
		System.out.println("3");
		driver.findElement(By.xpath(prop.getProperty("S_5AddVacancyButton"))).click();
		System.out.println("4");
		driver.findElement(By.xpath(prop.getProperty("S_5Namexpath"))).sendKeys(prop.getProperty("S_5Name"));
		System.out.println("5");
		driver.findElement(By.xpath(prop.getProperty("S_5JobTitiledropdownkeyxpath"))).click();
		System.out.println("6");
		List<WebElement> JobTitle = driver.findElements(By.xpath(prop.getProperty("S_5JobTitilelistxpath")));
		for (int i = 0; i<JobTitle.size(); i++) {
			if (JobTitle.get(i).equals("Chief Executive Officer")) {
				JobTitle.get(i).click();
			}
		}
		System.out.println("7");
		driver.findElement(By.xpath(prop.getProperty("S_5Descriptionxpath"))).sendKeys(prop.getProperty("S_5Description"));
		System.out.println("8");
		driver.findElement(By.xpath(prop.getProperty("S_5HiringManagerxpath"))).sendKeys(prop.getProperty("S_5HiringManager"));
		System.out.println("9");
		driver.findElement(By.xpath(prop.getProperty("S_5Positionxpath"))).sendKeys(prop.getProperty("S_5Position"));
		System.out.println("10");
		driver.findElement(By.xpath(prop.getProperty("S_5Submitxpath"))).click();
		System.out.println("Added Vacancy Details");
	}
}
