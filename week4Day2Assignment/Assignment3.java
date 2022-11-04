package week4Day2Assignment;

import java.awt.List;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) {
		/*1. Launch the URL https://html.com/tags/table/
			2. You have to print the respective values based on given Library
			(hint: if the library was absolute usage, then print all its value)*/


			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://html.com/tags/table/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			java.util.List<WebElement> rowsize=driver.findElements(By.xpath("//div[@class='render']/table/tbody/tr"));
			System.out.println(rowsize.size());
			
			java.util.List<WebElement> colsize=driver.findElements(By.xpath("//div[@class='render']/table/tbody/tr[1]/td"));
			System.out.println(colsize.size());
			for(int i=1;i<=rowsize.size();i++) {
			for(int j=1;j<=colsize.size();j++) {
				String values=driver.findElement(By.xpath("//div[@class='render']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(values);
			}
			
	}}
			

}
