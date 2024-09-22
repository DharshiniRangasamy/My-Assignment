package week1Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver	= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//form[@data-testid='royal_login_form']//a)[3]")).click();
		driver.findElement(By.xpath("//div[@class='mbm _1iy_ _a4y _3-90 lfloat _ohe']//input")).sendKeys("Dharshini");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Rangasamy");
		driver.findElement(By.xpath("(//div[text()='Mobile number or email address']/following::input)[1]")).sendKeys("9840392036");
		driver.findElement(By.xpath("//div[@class='mbm _br- _a4y']//input")).sendKeys("Dharsh12#R");
		Select Day = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		Day.selectByValue("5");
		Select month = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		month.selectByVisibleText("Jan");
		Select year = new Select(driver.findElement(By.xpath("//select[@id='year']")));
		year.selectByVisibleText("2024");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();
		
		
		

	}

}
