package aboutUs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class formValidation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://metapercept.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='rcc-confirm-button']")).click();
		Thread.sleep(5000);
		WebElement chatFrame =  driver.findElement(By.xpath("//*[@id='siqiframe']"));
		driver.switchTo().frame(chatFrame);
		driver.findElement(By.xpath("//*[@id='min_window']")).click();
		driver.switchTo().parentFrame();
		
	}
	
}
