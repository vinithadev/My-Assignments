package week4Day2Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgar {

	public static void main(String[] args) {
		/*1. Launch the URL https://www.chittorgarh.com/
			2. Click on stock market
			3. Click on NSE bulk Deals
			4. Get all the Security names
			5. Ensure whether there are duplicate Security names*/
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//2. Click on stock market
		driver.findElement(By.xpath("//a[@id='navbtn_stockmarket']")).click();
		
		//3. Click on NSE bulk Deals
		driver.findElement(By.xpath("//div/a[text()='NSE Bulk Deals']")).click();
		
		//4. Get all the Security names
		List<WebElement> name = driver.findElements(By.xpath("//div[@class='table-responsive']/table/tbody/tr/td[3]"));
		List<String> securityName=new ArrayList<String>();
		for(int i=1;i<=name.size();i++) {
			String namelist=driver.findElement(By.xpath("//div[@class='table-responsive']/table/tbody/tr["+i+"]/td[3]")).getText();
			securityName.add(namelist);
		}System.out.println(securityName);
		
		//5. Ensure whether there are duplicate Security names*/
		Set dup=new TreeSet<String>(securityName);
		System.out.println(dup);
		}


	}


