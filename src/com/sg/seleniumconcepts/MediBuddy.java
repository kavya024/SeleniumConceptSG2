package com.sg.seleniumconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MediBuddy {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.medibuddy.in/");
		driver.findElement(By.id("wzrk-cancel")).click();
		driver.findElement(By.linkText("Signup")).click();
		//driver.findElement(By.xpath("//a[text()='Signup']")).click();
		driver.findElement(By.id("mobile")).sendKeys("123");
		driver.findElement(By.id("name")).sendKeys("Test");
		driver.findElement(By.id("email")).sendKeys("test@test.com");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();
		//Thread.sleep(2000);
		//String error=driver.findElement(By.id("signuperr")).getText();
		
		String error=driver.findElement(By.xpath("//div[contains(text(),'INVALID')]")).getText();
		System.out.println(error);

	}

}
