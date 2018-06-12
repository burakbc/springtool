package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {

	public static void main (String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Burak Çelik\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");
		
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"lst-ib\"]"));
		element1.click();
		
		element1.sendKeys("ntv");
		
		try {
	        TimeUnit.MILLISECONDS.sleep(2000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"sbtc\"]/div[2]/div[2]/div[1]/div/ul/li[11]/div/span[1]/span/input"));
		element2.click();
		
		WebElement element3 = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/h3/a"));
		element3.click(); 
		
		 try {
		        TimeUnit.MILLISECONDS.sleep(4000);
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		 
		driver.close();
	}
	
}
