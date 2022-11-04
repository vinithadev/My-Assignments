package week2day2assignment;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
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
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Vinitha");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a)[1]")).click();
		
		driver.findElement(By.xpath("//div[@class='x-panel-header sectionHeaderTitle']")).click();
		System.out.println("The Title is"+driver.getTitle());
		if(driver.getTitle().contains("View Lead")) {
			System.out.println("I Confirm the Title");
		}
		
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(4000);
	    WebElement company= driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
	    Thread.sleep(4000);
		company.clear();
		company.sendKeys("Leaf Test");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String change  =driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		if(change.contains("Leaf Test")) {
			System.out.println("The Name Changed");
		}
		driver.close();
		
		/* 10 Click on first resulting lead
		* 11 Verify title of the page//div[@class='x-panel-header sectionHeaderTitle']
		* 12 Click Edit
		* 13 Change the company name
		* 14 Click Update
		* 15 Confirm the changed name appears
		* 16 Close the browser (Do not log out)*/

	}

}
