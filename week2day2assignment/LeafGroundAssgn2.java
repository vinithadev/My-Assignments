package week2day2assignment;

import java.awt.Component;
import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAssgn2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
		Thread.sleep(2000);
		if(driver.getTitle().contains("Dashboard")) {
			System.out.println("I Confirm the Title");
		}
		driver.navigate().back();
		boolean check=driver.findElement(By.xpath("//button[@type='button']")).isEnabled();
		if(!check) {
			System.out.println("The Button is Enabled");
		}else {
			System.out.println("the Button is Disabled");
		}
		Thread.sleep(4000);
		
	 System.out.println(driver.findElement(By.xpath("(//div[@class='card']//span)[4]")).getLocation());
	 WebElement color=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']"));
	 String color1=color.getCssValue("background-color");
	 System.out.println(color1);
	 
	 WebElement size=driver.findElement(By.xpath("//button[@name='j_idt88:j_idt98']"));
	 System.out.println(size.getSize());
	 
	/* WebElement el=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']/span"));
	 Actions act=new Actions(driver);
	 act.moveToElement(el).perform();*/
	 
	 WebElement image=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt102:imageBtn']"));
	 image.click();
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//button[@id='j_idt88:j_idt110']")).click();
	 Thread.sleep(4000);
	 System.out.println("Hidden button is clicked");
	 
	
		java.util.List<WebElement> elements = driver.findElements(By.xpath("//h5[contains(text(),'buttons')]/following-sibling::button"));
		int button=elements.size();
		System.out.println("The Total No of rounded Buttons are : " +button);
	
		
		
		
		
		}

	

	
		
		

	}


