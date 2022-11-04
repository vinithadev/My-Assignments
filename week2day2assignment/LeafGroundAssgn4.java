package week2day2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAssgn4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[text()='Javascript']")).click();
		driver.findElement(By.xpath("//label[text()='C-Sharp']")).click();
		WebElement tri=driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']"));
		tri.click();
		Thread.sleep(4000);
		tri.click();
		Thread.sleep(4000);
		tri.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		boolean check=driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']")).isEnabled();
		if(!check) {
			System.out.println("enabled");
			}
		else 
		{
			System.out.println("disabled");
		}
		driver.findElement(By.xpath("//div[@id='j_idt87:multiple']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li[@data-item-value='Miami']/label")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li[@data-item-value='Paris']/label")).click();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
		Thread.sleep(4000);
		driver.close();
		}
		

	}


