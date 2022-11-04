package week2day2assignment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//input[@id='j_idt88:name']")).sendKeys("Vinitha");
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']")).sendKeys(",India");
		driver.findElement(By.xpath("//div[@class='col-12']")).isEnabled();
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95']")).clear();
		System.out.println(driver.findElement(By.xpath("//input[@id='j_idt88:j_idt97']")).getAttribute("value"));
		driver.findElement(By.xpath("//div/input[@id='j_idt88:j_idt99']")).sendKeys("vinithatech89@gmail.com",Keys.TAB);
		driver.findElement(By.xpath("//div/textarea[@id='j_idt88:j_idt101']")).sendKeys("hello");
		driver.findElement(By.xpath("(//span[@class='ql-picker-label'])[2]")).click();
		driver.findElement(By.xpath("//span[@data-value='large']")).click();
		driver.findElement(By.xpath("(//span/button[@class='ql-bold'])[1]")).click();
		driver.findElement(By.xpath("(//span/button[@class='ql-bold'])[1]")).sendKeys("hello");
		driver.findElement(By.xpath("(//span/span[@class='ql-picker-label'])[4]")).click();
		driver.findElement(By.xpath("//div/input[@id='j_idt106:thisform:age']")).sendKeys(Keys.ENTER);
		System.out.println("Error Message dispayed");
		driver.findElement(By.xpath("//span/input[@id='j_idt106:float-input']")).click();
		Thread.sleep(4000);
		System.out.println("The label position changed");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Search']/parent::li")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@aria-label='Show Options']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//ul/li[text()='2']")).click();
		driver.findElement(By.xpath("(//span/input[@role='textbox'])[2]")).click();
		driver.findElement(By.xpath("(//span/input[@role='textbox'])[2]")).sendKeys("9/6/1989");
		
		driver.findElement(By.xpath("(//span/input[@role='textbox'])[3]")).click();
		driver.findElement(By.xpath("(//span/input[@role='textbox'])[3]")).sendKeys("12345678");
		driver.findElement(By.xpath("(//a/span[@class='ui-button-text'])[1]")).click();
		driver.findElement(By.xpath("(//h5/following-sibling::input)[5]")).click();
		driver.findElement(By.xpath("(//h5/following-sibling::input)[5]")).sendKeys("12345");
		System.out.println("the slide moves correctly");
		
		driver.findElement(By.xpath("(//h5[text()='Click and Confirm Keyboard appears']/following-sibling::input)[1]")).click();
		System.out.println("keyboard has appeared");
		//driver.findElement(By.xpath("(//span/button[@class='ql-bold'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[2]")).sendKeys("vinitha");
		driver.findElement(By.xpath("(//span/button[@class='ql-bold'])[2]")).click();
		
	
	
	
	}
	
}