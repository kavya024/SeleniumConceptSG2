package com.sg.seleniumconcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Db4freeTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.db4free.net/");
		driver.findElement(By.xpath("//a[@href='/phpMyAdmin']")).click();
		List<String> windows=new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		driver.findElement(By.id("input_username")).sendKeys("admin");
		
		}

}
