package com.sg.seleniumconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.openemr.io/b/openemr/interface/login/login.php?site=default");
		String text = driver.findElement(By.partialLinkText("Acknowledgment")).getText();
		System.out.println(text);
		
		String tagname=driver.findElement(By.partialLinkText("Acnlodgements")).getAttribute("href");
		
		String placeholderuser=driver.findElement(by)
	}

}
