package week2day2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9876543210");
		driver.findElement(By.linkText("Find Leads")).click();
		String text = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
	    System.out.println ("lead ID of First Resulting lead :"+text);
	    driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
	    driver.findElement(By.xpath("//li/a[contains(text(),'Find Leads')]")).click();
	    driver.findElement(By.xpath("//div/input[contains(@name,'id')]")).sendKeys(text);
	    driver.findElement(By.xpath("//em/button[text()='Find Leads']")).click();
	    String verify = driver.findElement(By.xpath("//table/following-sibling::div[contains(text(),'No records to display')]")).getText();
	        
	        if(verify.contains("No records to display")) {
	        	System.out.println("Succesful deletion of Lead");
	        }
	        else {
	        	System.out.println("Lead is not deleted");
	        }
	        driver.close();
		}
	

	
	}

