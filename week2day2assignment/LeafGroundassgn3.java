package week2day2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundassgn3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		WebElement source=driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select opt=new Select(source);
		opt.selectByIndex(2);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='j_idt87:country']")).click();
		driver.findElement(By.xpath("//li[text()='Germany']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='j_idt87:city']")).click();
		driver.findElement(By.xpath("//li[text()='Berlin']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(@class,'ui-corner-right ui-button-icon-only')]")).click();
		driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(@class,'ui-corner-right ui-button-icon-only')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[text()='ReactJs']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[text()='Select Language']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li[text()='Tamil']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[text()='Select Values']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li[@id='j_idt87:value_3']")).click();
		
		driver.close();

	}

}
