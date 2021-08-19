import java.util.ArrayList;
import java.util.List;
import java.util.Set;
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
		String parent =driver.getWindowHandle();
		System.out.println(parent);//session id
		//Set<String> windows=driver.getWindowHandles();
		List<String> windows=new ArrayList<>(driver.getWindowHandles());
		System.out.println(windows.get(0));
		System.out.println(windows.get(1));
		
		
		System.out.println(driver.getTitle());
		driver.close(); //will close current session and tab
		driver.quit(); // always recommended
		
		
	}

}
