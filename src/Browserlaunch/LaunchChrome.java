package Browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

public static void main(String[] args) throws InterruptedException {
	
			System.setProperty("webdriver.chrome.driver","C:\\Users\\vishal singhal\\eclipse-workspace\\Selinium\\Project1\\Resources\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.get("https://cptahabqy.fusionapps.ocs.oc-test.com/fscmUI/faces/FuseOverview");
			driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("zfrce001_marian_zben");
		    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Welcome1");
		    driver.findElement(By.xpath("//button[@id='btnActive']")).click();;
			
			
			
		}
	}