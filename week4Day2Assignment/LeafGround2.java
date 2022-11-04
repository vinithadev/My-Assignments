package week4Day2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround2 {

	public static void main(String[] args) throws InterruptedException {
		/*2.Launch the url : https://www.leafground.com/drag.xhtml
			Draggable Columns
			        -Move the Column Name to Column Quanity 
			       -Get the Toaster message to confirm it
			Draggable Rows
			        -Move the row 3 to row 4
			        -Get the Toaster message to confirm it
			Resize Image 
			         -Resize the message and Verify it 
			Range Slider
			            -Give a range between 10 and 80 (use movebyOffset() for x values ,y should be 0  and use negative value for right move)*/
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 WebElement name = driver.findElement(By.xpath("(//tr/th[@role='columnheader'])[1]"));
		 WebElement quantity = driver.findElement(By.xpath("(//tr/th[@role='columnheader'])[3]"));
		 Actions act=new Actions(driver);
		 act.clickAndHold(name).moveToElement(quantity).release(quantity).perform();
		 
		WebElement alert = driver.findElement(By.xpath("//div/span[@class='ui-growl-title']"));
		System.out.println(alert.getText());
		
		WebElement row3 = driver.findElement(By.xpath("(//table[@role='grid']/tbody/tr[3])[2]"));
		act.moveToElement(row3).clickAndHold().sendKeys(Keys.ARROW_UP).moveByOffset(0, 40).release().perform();
		
		WebElement alert1 = driver.findElement(By.xpath("//div/span[text()='Row moved']"));
		System.out.println(alert1.getText());
		
	//	WebElement image = driver.findElement(By.xpath("//div/img[@id='form:logo']"));
		
		//act.clickAndHold(image).moveByOffset(60, 0).release().perform();
		
		WebElement slider = driver.findElement(By.xpath("//table[@style='margin-bottom: 10px']/tbody/tr[3]"));
		act.click(slider).moveByOffset(-80, 0).release().perform();
		
	}
}
