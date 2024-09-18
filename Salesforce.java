package week1Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Salesforce { 
		public static void main(String[] args) throws Exception {
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");
			ChromeDriver driver = new ChromeDriver(option);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://login.salesforce.com/?locale=in");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vinothkumar@testleaf.com");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SeleniumChallenge@24");
			driver.findElement(By.xpath("//input[@id='Login']")).click();
			Thread.sleep(20000);
			driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
			driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
			driver.findElement(By.xpath("//button[text()='View All']")).click();
			driver.findElement(By.xpath("//p[text()='Sales']")).click();
			Thread.sleep(5000);
			
			WebElement element = driver.findElement(By.xpath("//span[text()='Opportunities']"));
			driver.executeScript("arguments[0].click()", element);
			driver.findElement(By.xpath("//div[text()='New']")).click();
			driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by DharshiniRangasamy");
			driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys("75000");
			driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("16/9/2024");
			Thread.sleep(1000);
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			WebElement element2 = driver.findElement(By.xpath("(//label[text()='Stage']/following::lightning-icon[@class='slds-input__icon slds-input__icon_right slds-icon-utility-down slds-icon_container'])[1]"));
			executor.executeScript("arguments[0].click();", element2);
			WebElement element3 = driver.findElement(By.xpath("//div[@aria-label='Stage']//following::span[text()='Needs Analysis']"));
			executor.executeScript("arguments[0].click();", element3);
			driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
			String title = driver.getTitle();
			if(title.contains("New Opportunity | Salesforce")) {
				System.out.println("verified");
			}
			else {
				System.out.println("not verified");
			}

	}

}
