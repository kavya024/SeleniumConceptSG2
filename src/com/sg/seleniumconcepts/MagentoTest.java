package com.sg.seleniumconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MagentoTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://magento.com/");
		
		driver.findElement(By.id("gnav_557")).click();
		
		driver.findElement(By.id("email")).sendKeys("balaji0017@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("balaji@12345");
		driver.findElement(By.id("send2")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Log Out")));
		
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		String actualid= driver.findElement(By.xpath("//span[contains(text(),'ID:')]")).getText();
		System.out.println(actualid);		
		driver.findElement(By.partialLinkText("Log Out")).click();
		
		
	}

}
