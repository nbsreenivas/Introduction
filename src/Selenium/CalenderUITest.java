package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;





public class CalenderUITest {

	
	@Test
	public static void calender() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		String month = "6";
		String date = "15";
		String year = "2027";
		String [] array = {month,date,year};
		driver.findElement(By.name("year")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
        String date1 = driver.findElement(By.xpath("//div[@class='react-date-picker__inputGroup']/input")).getAttribute("value");
        System.out.println(date1);
//        String total_date = year+"-"+month+"-"+date;
//        Assert.assertEquals(date1, total_date);
//        driver.close()
        List<WebElement> element = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
        for(int i=0;i<element.size();i++) {
        	
        	System.out.println(element.get(i).getAttribute("value"));
        	Assert.assertEquals(element.get(i).getAttribute("value"),array[i]);
        }
        }
	public static void main(String[] args) {
		calender();
		
		
	}

}
