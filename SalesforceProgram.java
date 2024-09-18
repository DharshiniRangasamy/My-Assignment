package week1Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceProgram {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vinothkumar@testleaf.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SeleniumChallenge@24");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(20000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		//p[text()='Sales']
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//span[text()='Leads'])[1]")).click();
		driver.findElement(By.xpath("(//span[text()='Leads']/following::a[@class='slds-button slds-button_reset'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[text()='New']")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("dharshini");
		driver.findElement(By.xpath("//label[text()='Last Name']")).sendKeys("rangasamy");
		driver.findElement(By.xpath("//label[text()='Company']")).sendKeys("testleaf");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
