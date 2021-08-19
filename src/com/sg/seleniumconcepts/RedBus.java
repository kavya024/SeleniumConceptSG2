package com.sg.seleniumconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("sign-in-icon-down")).click();
		driver.findElement(By.id("signInLink")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'OnlyMobile')]")));
		driver.findElement(By.id("mobileNoInp")).sendKeys("787878");
		Thread.sleep(3000);
		String error=driver.findElement(By.xpath("//span[contains(text(),'valid mobile number')]")).getText();
		System.out.println(error);
		driver.switchTo().defaultContent();	
		
		
	}

}
