package com.sg.seleniumconcepts;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseVsBrowserTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.online.citibank.co.in/");
		driver.findElement(By.xpath("//img[@class='appclose']"));
		driver.findElement(By.linkText("APPLY FOR CREDIT CARDS"));
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		
		
		
		System.out.println(driver.getTitle());
		driver.close(); //will close current session and tab
		driver.quit(); // always recommended
		
		
	}

}
