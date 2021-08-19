package com.sg.seleniumconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenemrTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.openemr.io/b/openemr/interface/login/login.php?site=default");
		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		Select selectLang=new Select(driver.findElement(By.name("languageChoice")));
		selectLang.selectByVisibleText("English (Indian)");
		//new Select(driver.findElement(By.name("languageChoice"))).selectByVisibleText("English (Indian)");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebDriverWait wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[text()='Flow Board']")));
		System.out.println(driver.getTitle());
		//mouse hover
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[@data-bind='text:label']"))).build().perform();
		//Thread.sleep(5000);
		//Select option = new Select(driver.findElement(By.linkText("Patients")));
		//option.selectByVisibleText("Patients");
		action.moveToElement(driver.findElement(By.xpath("//div[text()='Patients']"))).click().build().perform();
		driver.findElement(By.id("create_patient_btn1")).click();
		Select title =new Select(driver.findElement(By.id("form_title")));
		title.selectByValue("Ms.");
		driver.findElement(By.id("form_fname")).sendKeys("Jane");
		driver.findElement(By.id("form_lname")).sendKeys("williams");
		driver.findElement(By.id("form_DOB")).sendKeys("2021-08-12");
		new Select(driver.findElement(By.id("form_sex"))).selectByValue("Female");
		driver.findElement(By.id("create")).click();
				
		action.moveToElement(driver.findElement(By.xpath("//span[@data-bind='text:fname']"))).build().perform();
		//logout
		driver.findElement(By.xpath("//li[text()='Logout']")).click();
		
	
	}

}
