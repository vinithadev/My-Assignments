package week6Day1Assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateLead extends NewTest {
	

	@Test
	public void runCreate() {
	
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
	driver.findElement(By.name("submitButton")).click();

}
}