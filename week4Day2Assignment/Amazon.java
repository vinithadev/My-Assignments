package week4Day2Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@aria-label='oneplus 9 pro']")).click();
		String price = driver.findElement(By.xpath("(//span/span[@class='a-price-whole'])[1]")).getText();
		System.out.println(price);
		String rating = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
		System.out.println(rating);
		Thread.sleep(4000);
		WebElement mouse = driver.findElement(By.xpath("(//i/span[@class='a-icon-alt'])[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(mouse).perform();
		Thread.sleep(4000);
		String percentage=driver.findElement(By.xpath("(//span/a[@class='a-link-normal'])[1]")).getText();
		System.out.println(percentage);
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a/span[@class='a-size-medium a-color-base a-text-normal'])[1")).click();
		
		WebElement image = driver.findElement(By.xpath("//div[@id='imgTagWrapperId']/img"));
		File ele = image.getScreenshotAs(OutputType.FILE);
		File des = new File("./snap/mobile.jpg");
		FileUtils.copyFile(ele, des);
		
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		String total=driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		if(price==total) {
			System.out.println("the amount is same");
		}
		
	}

}
