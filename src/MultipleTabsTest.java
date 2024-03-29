import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabsTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.online.citibank.co.in/");
		driver.findElement(By.xpath("//img[@class='appclose']"));
		driver.findElement(By.linkText("APPLY FOR CREDIT CARDS"));
		
		List<String> windows=new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		
		driver.findElement(By.linkText("Travel")).click();
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
