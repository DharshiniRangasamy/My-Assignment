package week1Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.leafground.com/checkbox.xhtml");
	driver.findElement(By.xpath("//span[text()='Basic']")).click();
	driver.findElement(By.xpath("//span[text()='Ajax']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//label[text()='Java']/preceding::div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/following::div[@class='ui-chkbox ui-widget'][1]")).click();
    driver.findElement(By.xpath("//h5[text()='Toggle Switch']/following::div[@class='ui-toggleswitch-slider']")).click();
    driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right']")).click();
    Thread.sleep(3000);
    String txt ="Paris";
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys(txt);
    Thread.sleep(3000);
    driver.findElement(By.xpath("//li[@data-item-value='"+txt+"']/div")).click();
	
	}

}
