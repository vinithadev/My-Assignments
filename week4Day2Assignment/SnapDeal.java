package week4Day2Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		
	/*1. Launch https://www.snapdeal.com/
		2. Go to Mens Fashion
		3. Go to Sports Shoes
		4. Get the count of the sports shoes
		5. Click Training shoes
		6. Sort by Low to High
		7. Check if the items displayed are sorted correctly
		8.Select the price range (900-1200)
		9.Filter with color Navy 
		10 verify the all applied filters 
		11. Mouse Hover on first resulting Training shoes
		12. click QuickView button
		13. Print the cost and the discount percentage
		14. Take the snapshot of the shoes.
		15. Close the current window
		16. Close the main window*/
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
		WebElement mouse=driver.findElement(By.xpath("(//a/span[@class='catText'])[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(mouse).perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a/span[text()='Sports Shoes'])[1]")).click();
		String items = driver.findElement(By.xpath("(//div[@class='child-cat-count '])[2]")).getText();
		
				System.out.println("total no of shoes " + items);
		
		driver.findElement(By.xpath("//a/div[text()='Training Shoes']")).click();
		driver.findElement(By.xpath("//div/span[@class='sort-label']")).click();
		driver.findElement(By.xpath("(//ul/li[@data-index='1'])[2]")).click();
		String sort = driver.findElement(By.xpath("(//ul/li[@data-index='1'])[2]")).getText();
		
		if(sort.contains(sort)) {
			System.out.println("sorted correctly");
		}
		
		WebElement low = driver.findElement(By.xpath("//input[@name='fromVal']"));
		WebElement high = driver.findElement(By.xpath("//input[@name='toVal']"));
		low.click();
		low.clear();
		low.sendKeys("600");
		high.click();
		high.clear();
		high.sendKeys("900");
		driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//label[@for='Color_s-Navy']")).click();
		Thread.sleep(4000);
		String filter = driver.findElement(By.xpath("(//div/a[@data-value='undefined'])[1]")).getText();
		System.out.println(filter);
		
	   /* List<WebElement> filters = driver.findElements(By.xpath("(//div[@class='filters'])[1]/div"));
	    List<String> filter=new ArrayList<String>();
	    for(int i=1; i<filters.size(); i++) {
	    	String adding = driver.findElement(By.xpath("(//div[@class='filters'])[1]/div["+i+"]")).getText();
	    	filter.add(adding);
	    }
	    System.out.println(filter);*/
		Thread.sleep(4000);
		driver.findElement(By.xpath("//img[@class='product-image wooble']")).click();
		driver.findElement(By.xpath("(//div[@supc='SDL239668535'])[1]")).click();
		Thread.sleep(4000);
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> window1=new ArrayList<String>(windowHandles);
		driver.switchTo().window(window1.get(1));
		
		String cost=driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		System.out.println("cost : "+cost);
		String discount = driver.findElement(By.xpath("//span[@class='pdpDiscount ']")).getText();
		System.out.println("discount" +discount);
		
		WebElement image = driver.findElement(By.xpath("(//ul[@class='clearfix']/li/img)[1]"));
		File ele = image.getScreenshotAs(OutputType.FILE);
		File des = new File("./snap/shoe.jpg");
		FileUtils.copyFile(ele, des);
		
		driver.close();
		driver.quit();
}
}