package week4Day1Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Merge {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='x-panel-header']/a)[3]")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		driver.findElement(By.xpath("(//a/img[@alt='Lookup'])[1]")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> window1 = new ArrayList<String>(windowHandles);
		driver.switchTo().window(window1.get(1));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		driver.switchTo().window(window1.get(0));
		driver.findElement(By.xpath("(//a/img[@alt='Lookup'])[2]")).click();
		
		Set<String> windowHandle = driver.getWindowHandles();
		List<String> window2 = new ArrayList<String>(windowHandle);
		driver.switchTo().window(window2.get(1));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		driver.switchTo().window(window2.get(0));
		
		driver.findElement(By.xpath("//td/a[@class='buttonDangerous']")).click();
		driver.switchTo().alert().accept();
		System.out.println(driver.getTitle());


/* 6. Click on Merge Contacts using Xpath Locator
* 
* 7. Click on Widget of From Contact
* 
* 8. Click on First Resulting Contact
* 
* 9. Click on Widget of To Contact
* 
* 10. Click on Second Resulting Contact
* 
* 11. Click on Merge button using Xpath Locator
* 
* 12. Accept the Alert
* 
* 13. Verify the title of the page
*/
}

}
