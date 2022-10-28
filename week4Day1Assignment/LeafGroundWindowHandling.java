package week4Day1Assignment;

import java.awt.Window;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/window.xhtml");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']")).click();
		
		Set<String> windowHandles=driver.getWindowHandles();
		System.out.println(windowHandles.size());
		
		List<String> windowHandle=new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowHandle.get(1));
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(windowHandle.get(1));
		driver.close();
		
		driver.switchTo().window(windowHandle.get(0));
		driver.close();
		//driver.switchTo().window(windowHandle.get(0));
		//stem.out.println(driver.getTitle());
				
		
		
	}

}












/*.https://www.leafground.com/window.xhtml
    Click Open Multiple 
    Get the size of available Windows
    switch to last window 
    Get the Title of the Window
     Close all the windows except last window*/

