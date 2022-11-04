package week2day2assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAssgn5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/link.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//a[text()='Go to Dashboard']")).click();
		Thread.sleep(4000);
		driver.navigate().back();
		WebElement url = driver.findElement(By.xpath("//div/a[contains(text(),'Find the URL without clicking me.')]"));
		System.out.println(url.getAttribute("href"));
		
		driver.findElement(By.xpath("//a[contains(text(),'Broken?')]")).click();
		driver.navigate().back();
		System.out.println("yes,it's a broken link");
		
		//driver.findElement(By.xpath("(//a[contains(text(),'Go to Dashboard')])[2]")).getAttribute("https://www.leafground.com/dashboard.xhtml");
		//System.out.println(getAttribute("https://www.leafground.com/dashboard.xhtml"));
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		List<WebElement> link = driver.findElements(By.xpath("//h5[text()='Count Layout Links']"));
		System.out.println(link.size());
		
		
	}

	
	}


