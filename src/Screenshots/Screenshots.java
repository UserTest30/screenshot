package Screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shanmugaundaram\\eclipse-workspace\\sele\\taskscreenshot\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	TakesScreenshot scr=(TakesScreenshot)driver;
	File s=scr.getScreenshotAs(OutputType.FILE);
	System.out.println("greens");
	File d=new File("C:\\Users\\shanmugaundaram\\Desktop\\selenium\\123.png");
	FileUtils.copyFile(s,d);
}
}
