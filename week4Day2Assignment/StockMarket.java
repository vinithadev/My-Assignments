package week4Day2Assignment;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StockMarket {

	public static void main(String[] args) {
		/*1. Launch the URL https://www.chittorgarh.com/
			2. Click on stock market
			3. Click on NSE bulk Deals
			4. Get all the Security names
			5. Ensure whether there are duplicate Security names*/
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.chittorgarh.com/");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.findElement(By.id("navbtn_stockmarket")).click();
		driver.findElement(By.linkText("NSE Bulk Deals")).click();
		
		List<WebElement> colsize = driver.findElements(By.xpath("//table[contains(@class,'table table-bordered')]/tbody/tr/td[3] "));
		Set<String> set=new LinkedHashSet<String>();
		for(int i=1;i<=colsize.size();i++) {
			WebElement colval=driver.findElement(By.xpath("//table[contains(@class,'table table-bordered')]/tbody/tr["+i+"]/td[3]"));
			String text = colval.getText();
			set.add(text);
		}
		System.out.println(set);
		System.out.println(set.size());
	}

}
