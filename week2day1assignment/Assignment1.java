package week2day1assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vinitha");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Senthil");
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Vinitha");
	    driver.findElement(By.name("departmentName")).sendKeys("Testing");
	    driver.findElement(By.name("description")).sendKeys("Testing the Test Leaf Web Page");
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vinithatech89@gmail.com");
	   driver.findElement(By.name("submitButton")).click();
	   String title=driver.getTitle();
	  System.out.println(title);
		
		

	}

}
