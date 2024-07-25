package Selenium;

import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scope {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println("Total anchor Elements  count :"+driver.findElements(By.tagName("a")).size());
		
		// to get the links count of footer section
		WebElement footElement = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		List<WebElement> links = footElement.findElements(By.tagName("a"));
		System.out.println("Footer section count :"+footElement.findElements(By.tagName("a")).size());
//		for(WebElement link : links) {
//			System.out.println(link.getAttribute("href"));		
//		}
		WebElement columndriver = footElement.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		//click on all the links 
		for(int i=0;i<columndriver.findElements(By.tagName("a")).size();i++) {
			
			String clickOnLink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
			Thread.sleep(5000);
		}
			Set<String> windows= driver.getWindowHandles();
			java.util.Iterator<String> it = windows.iterator();
		
			while(it.hasNext()) {
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			
		}
		
		
		
		
		
		
	}

}
