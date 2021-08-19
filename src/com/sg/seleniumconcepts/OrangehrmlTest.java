package com.sg.seleniumconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangehrmlTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		driver.findElement(By.xpath("//a[text()='Emergency Contacts']")).click();
		driver.findElement(By.id("btnAddContact")).click();
		driver.findElement(By.id("emgcontacts_name")).sendKeys("john");
		driver.findElement(By.id("emgcontacts_relationship")).sendKeys("Brother");
		driver.findElement(By.id("emgcontacts_mobilePhone")).sendKeys("9201234567");
		driver.findElement(By.id("btnSaveEContact")).click();	
		
	}

}
