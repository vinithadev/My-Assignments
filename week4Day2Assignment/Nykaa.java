package week4Day2Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
	/*	1) Go to https://www.nykaa.com/
			2) Mouseover on Brands and Search L'Oreal Paris
			3) Click L'Oreal Paris
			4) Check the title contains L'Oreal Paris(Hint-GetTitle)
			5) Click sort By and select customer top rated
			6) Click Category and click Hair->Click haircare->Shampoo
			7) Click->Concern->Color Protection
			8)check whether the Filter is applied with Shampoo
			9) Click on L'Oreal Paris Colour Protect Shampoo
			10) GO to the new window and select size as 175ml
			11) Print the MRP of the product
			12) Click on ADD to BAG
			13) Go to Shopping Bag 
			14) Print the Grand Total amount
			15) Click Proceed
			16) Click on Continue as Guest
			17) Check if this grand total is the same in step 14
			18) Close all windows*/
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(4000);
	WebElement mouse=driver.findElement(By.xpath("//li/a[text()='brands']"));
		Actions act=new Actions(driver);
		act.moveToElement(mouse).perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='brandSearchBox']")).sendKeys("L'Oreal Paris");	
		driver.findElement(By.xpath("(//div[@class='css-ov2o3v']/a)[1]")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//span[@class='sort-name']")).click();
		driver.findElement(By.xpath("(//span[@class='title'])[4]")).click();
		driver.findElement(By.xpath("(//div[@id='first-filter']//span)[1]")).click();
		driver.findElement(By.xpath("(//div/span[@class='filter-name '])[2]")).click();
		driver.findElement(By.xpath("(//div/span[@class='filter-name '])[1]")).click();
		driver.findElement(By.xpath("( //div[@class='control-value']/span)[1]")).click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("(//div[@class='css-w2222k']//span[@class='title active'])[2]")).click();
		//driver.findElement(By.xpath("//div[@class='control-value']/span[text()='Color Protection']")).click();
		
		String filter = driver.findElement(By.xpath("//div[@class='css-1hjpwet']/span")).getText();
		if(filter.contains("Shampoo")) {
			System.out.println("Filters Applied");
		}else { System.out.println("Not Applied");
		
		}
		driver.findElement(By.xpath("//div/div[@class='css-xrzmfa']")).click();
		Set<String> windowHandles=driver.getWindowHandles();
		System.out.println(windowHandles.size());
				
		List<String> window=new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(1));
		WebElement size=driver.findElement(By.xpath("//select[@class='css-2t5nwu']"));
		Select value=new Select(size);
		value.selectByIndex(0);
		
		String mrp = driver.findElement(By.xpath("(//div/span[@class='css-1jczs19'])[1]")).getText();
		System.out.println("MRP of the product" +mrp);
		
		driver.findElement(By.xpath("(//button/span[@class='btn-text'])[1]")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		String price = driver.findElement(By.xpath("//div/span[@class='css-n8gwxi e171rb9k3']")).getText();
		System.out.println(price);
		
		driver.findElement(By.xpath("(//button[@class='css-guysem e8tshxd0'])[2]")).click();
		driver.findElement(By.xpath("//button[@class='btn full big']")).click();
		String total = driver.findElement(By.xpath("(//span[text()='567'])[3]")).getText();
		if(price.contains(total)) {
			System.out.println("total amount is same");
			driver.close();
		}
	
	}
	


	}


