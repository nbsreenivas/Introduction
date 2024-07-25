import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Invoking browser
//		System.setProperty(null, null)
		//WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close()
;	}

}
