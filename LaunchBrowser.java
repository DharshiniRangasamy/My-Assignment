package week1Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {

		
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("Democsr");
		
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		driver.findElement(By.partialLinkText("CRM/")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("QEagle");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("dharshini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("rangasamy");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("50");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9840392036");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("dharshinimeenakshi12@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		if(title.contains("Leaftaps")) {
			System.out.println("Title is verified");
			
			
		}
		else {
			System.out.println("Title is not verified");

		}
		driver.close();
		
		
		
		
		
		
		
		
		
	}
}

