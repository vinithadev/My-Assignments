package week4Day2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround1 {

	public static void main(String[] args) throws InterruptedException {
		/*1. Launch the url: https://www.leafground.com/menu.xhtml
		     Menu Bar
		         -Do click on shipment and mousehover on Tracker and Do rightClick on Tracker
		     Slide Menu
		         -Do click Orders and click Back*/
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/menu.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.findElement(By.xpath("//a//span[text()='Shipments']")).click();
	    WebElement mouse = driver.findElement(By.xpath("//span[text()='Tracker']"));
		Actions act=new Actions(driver);
		act.moveToElement(mouse).perform();
		WebElement mouse1 = driver.findElement(By.xpath("//span[text()='Tracker']"));
		Actions act1=new Actions(driver);
		act.contextClick(mouse1).perform();
		driver.findElement(By.xpath("(//span[text()='Orders'])[2]")).click();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-w']")).click();
		Thread.sleep(4000);
		driver.quit();
		
		


	}

}
