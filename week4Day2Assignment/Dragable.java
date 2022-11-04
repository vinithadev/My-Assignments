package week4Day2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dragable {

	public static void main(String[] args) throws InterruptedException {
		
		/*https://jqueryui.com/draggable
		https://jqueryui.com/droppable
		https://jqueryui.com/resizable
		https://jqueryui.com/selectable */
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/draggable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(4000);
		driver.switchTo().frame(0);
		WebElement drag=driver.findElement(By.xpath("//body/div[@id='draggable']"));
		Point location=drag.getLocation();
		int x=location.getX();
		int y=location.getY();
		Actions act=new Actions(driver);
		act.dragAndDropBy(drag,x+20,y+30).perform();
		
		
	}

}
