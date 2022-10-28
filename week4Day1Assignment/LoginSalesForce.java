package week4Day1Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSalesForce {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com ");
		driver.findElement(By.id("password")).sendKeys("Password#123 ");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(9999);
		
		driver.findElement(By.xpath("(//button/span[@class=' label bBody'])[2]")).click();
		
		Set<String> windowHandles=driver.getWindowHandles();
		List<String> window=new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(1));
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		System.out.println(driver.getTitle());
		driver.switchTo().defaultContent();
		driver.quit();
		
	}

}







/*Salesforce Customer service:
1.Launch the browser
2.Load the url as " https://login.salesforce.com/ "
3.Enter the username as " ramkumar.ramaiah@testleaf.com "
4. Enter the password as " Password#123 "
5.click on the login button
6.click on the learn more option in the Mobile publisher
7.Switch to the next window using Windowhandles.
8.click on the confirm button in the redirecting page
9.Get the title
10.Get back to the parent window
11.close the browser*/