package week4Day2Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) {
		/*1. Launch the URL https://html.com/tags/table/
			2. Get the count of number of rows
			3. Get the count of number of columns*/
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		List<WebElement> rowsize= driver.findElements(By.xpath("//table[@class='attributes-list']/tbody/tr"));
		System.out.println(rowsize.size());
		
		List<WebElement> columnvalue=driver.findElements(By.xpath("//table[@class='attributes-list']/tbody/tr/td"));
		System.out.println(columnvalue.size());

	}

}
