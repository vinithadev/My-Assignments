package week4Day2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resizable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resizable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.switchTo().frame(0);
		WebElement resize = driver.findElement(By.xpath("//div/div[@class='ui-resizable-handle ui-resizable-e']"));
		Point location=resize.getLocation();
		int x=location.getX();
		int y=location.getY();
		Actions act=new Actions(driver);
		act.dragAndDropBy(resize, x+200,y+20).perform();
		
	}

}
