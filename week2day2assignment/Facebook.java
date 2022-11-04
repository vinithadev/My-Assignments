package week2day2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Senthil");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Vinitha");
		driver.findElement(By.xpath("//div[contains(text(),'Mobile number or email address']")).sendKeys("9698719789");
		driver.findElement(By.xpath("//div[contains(text(),'New password']")).sendKeys("Venba@15");
		WebElement Day=driver.findElement(By.id("day"));
		Select option=new Select(Day);
		option.selectByIndex(5);
		
		WebElement Month=driver.findElement(By.id("month"));
		Select option1=new Select(Month);
		option1.selectByValue("Sep");
		
		WebElement Year=driver.findElement(By.id("year"));
		Select option2=new Select(Year);
		option2.selectByVisibleText("2020");
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		driver.close();
		
		
		
		
		
		
		
	}
	}

