package Screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shanmugaundaram\\eclipse-workspace\\sele\\screenshots\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.moneycontrol.com/markets/fno-market-snapshot");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	TakesScreenshot scr=(TakesScreenshot)driver;
	WebElement scr1 = driver.findElement(By.xpath("(//div[(@class='leftD')])[2]"));
	scr1.click();
	File sourc=scr1.getScreenshotAs(OutputType.FILE);
	File desc=new File("C:\\Users\\shanmugaundaram\\eclipse-workspace\\sele\\screenshots\\img132.png");
	FileUtils.copyFile(sourc,desc);
}
}
