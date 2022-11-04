package week4Day2Assignment;



import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {

	public static void main(String[] args) throws IOException, InterruptedException {
	
	/* Open https://www.myntra.com/
		2) Mouse hover on MeN 
		3) Click Jackets 
		4) Find the total count of item 
		5) Validate the sum of categories count matches
		6) Check jackets
		7) Click + More option under BRAND
		8) Type Duke and click checkbox
		9) Close the pop-up x
		10) Confirm all the Coats are of brand Duke
		    Hint : use List 
		11) Sort by Better Discount
		12) Find the price of first displayed item
		Click on the first product
		13) Take a screen shot
		14) Click on WishList Now
		15) Close Browser*/
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement mouse = driver.findElement(By.xpath("//div/a[text()='Men']"));
		Actions act=new Actions(driver);
		act.moveToElement(mouse).perform();
		driver.findElement(By.xpath("(//li/a[text()='Jackets'])[1]")).click();
		WebElement items = driver.findElement(By.xpath("//span[@class='title-count']"));
		System.out.println(items.getText());
		WebElement items1 = driver.findElement(By.xpath("(//span[@class='categories-num'])[1]"));
		if(items==items1) {
			System.out.println("counts are matching");
		}else {System.out.println("counts are not matching");}
		
		driver.findElement(By.xpath("//div/div[@class='brand-more']")).click();
		driver.findElement(By.xpath("//div/input[@placeholder='Search brand']")).sendKeys("Duke");
		driver.findElement(By.xpath("//li/label[@class=' common-customCheckbox']")).click();
		driver.findElement(By.xpath("//div[@class='FilterDirectory-titleBar']/span")).click();
		List<WebElement> jacket=driver.findElements(By.xpath("//div[@class='product-productMetaInfo']/h3"));
		List<String> jacket1=new ArrayList<String>();
		for(int i=1;i<=jacket.size();i++) {
		String brand=driver.findElement(By.xpath("(//div[@class='product-productMetaInfo']/h3)["+i+"]")).getText();
			jacket1.add(brand);
		}
		Set<String> dup=new LinkedHashSet<String>(jacket1);
		if(dup.contains("Duke")) {
			System.out.println("The coats are same");}
		else {System.out.println("The coats are Not same");}
			
		WebElement sort = driver.findElement(By.xpath("//div[@class='sort-sortBy']"));
		act.moveToElement(sort).perform();
		driver.findElement(By.xpath("//input[@value='discount']/parent::label")).click();
		//act.moveToElement(mouse1).click().perform();
		String price=driver.findElement(By.xpath("(//div[@class='product-price'])[1]")).getText();
		System.out.println(price);
		driver.findElement(By.xpath("(//div[@class='product-sliderContainer'])[1]")).click();
		Thread.sleep(4000);
		Set<String> windowHandles=driver.getWindowHandles();
		List<String> window=new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(1));
		Thread.sleep(4000);
		File ele=driver.getScreenshotAs(OutputType.FILE);
		File destn=new File("./snap/pic.jpg");
		FileUtils.copyFile(ele, destn);
		
		driver.findElement(By.xpath("//span[text()='WISHLIST']")).click();
		driver.close();
		}
		

 
	
}
	
	
	


