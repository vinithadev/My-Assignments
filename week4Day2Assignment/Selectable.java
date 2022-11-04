package week4Day2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.switchTo().frame(0);
		WebElement item1 = driver.findElement(By.xpath("(//ol[@id='selectable']/li)[1]"));
		WebElement item2 = driver.findElement(By.xpath("(//ol[@id='selectable']/li)[2]"));
		WebElement item3 = driver.findElement(By.xpath("(//ol[@id='selectable']/li)[3]"));
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).click(item1).click(item2).click(item3).keyUp(Keys.CONTROL).perform();
	}

}
