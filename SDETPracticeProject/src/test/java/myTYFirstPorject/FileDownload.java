package myTYFirstPorject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownload {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoapps.qspiders.com/ui/download?sublist=0");
	WebElement textdataElement=driver.findElement(By.xpath("//textarea[@placeholder='Enter text here']"));
	textdataElement.sendKeys("Please download the File");
	
	driver.findElement(By.id("downloadButton")).click();
}
}
