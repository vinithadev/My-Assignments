package week4Day2Assignment;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) {
		/*Step:1-Launch the url (https://www.redbus.in/)
			Step:2-Enter From -Madiwala Bangalore
			Step:3-Enter To Koyambedu Chennai
			Step:4-Select the Date 30-September-2022
			Step:5-Print the Title of the page*/
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//div/input[@id='src']")).sendKeys("Madiwala Bangalore");
		driver.findElement(By.xpath("//div/input[@id='dest']")).sendKeys("Koyambedu Chennai");
		driver.findElement(By.xpath("//div/input[@id='onward_cal']")).click();
		driver.findElement(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr[7]/td[3]")).click();
		System.out.println(driver.getTitle());
			


	}

}
