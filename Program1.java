package Automationtest2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/ ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("chennai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[text()='Chennai'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[text()='Bangalore'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Tomorrow']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		String text = driver.findElement(By.xpath("(//h5[@class='title'])[1]")).getText();
		System.out.println("Bus Name:" + text);
		WebElement element = driver.findElement(By.xpath("//span[text()='Sleeper']"));
		element.click();
		driver.findElement(By.xpath("( //div[@class='text-grey'])[1]")).click();
		driver.findElement(By.xpath("//button[text()='Show Seats']")).click();
		String text5 = driver.findElement(By.xpath("(//div[@class='text-grey']//small)[1]")).getText();
		System.out.println(text5);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='4UC']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Thread.sleep(2000);
		String text2 = driver.findElement(By.xpath("(//div[contains(@class,'seat-fare col auto')])[1]")).getText();
		String text3 = driver.findElement(By.xpath("(//div[contains(@class,'selected-seat col auto')])[1]")).getText();
		System.out.println(text2);
		System.out.println(text3);
		String title = driver.getTitle();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		System.out.println(title);
		driver.close();

	}

}
