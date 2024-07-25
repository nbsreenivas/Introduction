package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.apache.commons.io.FileUtils;

public class DeleteCookiesAndTakeScreenShot {
	public static void main(String[]args) throws IOException {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.google.com/");
	
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("D://AutomationScreenShots//screenshot.png"));
	
	}

	
}
