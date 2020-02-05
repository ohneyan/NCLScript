/*
 * Written By: Jorge Suarez | Github: ohneyan
 * Scenario Selected: 1
 * Scenario Description: Guest explores Ports of Departure
 * */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nclTool
{
	public static void main(String[] args)
	{
	
		//Open the Chrome Browser Driver and create the Driver object
		System.setProperty("webdriver.chrome.driver", "C:\\IDEs & Frameworks\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		//Boolean for Image validation
		Boolean imgPresent = driver.findElements(By.xpath("//*[@id=\'IPEinvL850\']/img")).size() > 0;
		
		//Open Chrome driver for NCL.com
		driver.get("http://ncl.com");
		
		//Check for popup image
		if(imgPresent == true)
		{
			driver.findElement(By.xpath("//*[@id=\'IPEinvL850\']/map/area[1]")).click();
		}

		//This will click on the ports link 
		By.className("linkItem");
		driver.findElement(By.linkText("Ports")).click();
		
		//sleep to allow page to load
		try
		{
			Thread.sleep(11000);
		} catch (InterruptedException e)
		{
			Thread.currentThread().interrupt();
		}
		
		//checks for popup image
		if(imgPresent == true)
		{
			driver.findElement(By.xpath("//*[@id=\'IPEinvL850\']/map/area[1]")).click();
		}
		
		//Search for Honolulu port
		driver.findElement(By.xpath("//*[@id=\'searchbar\']")).sendKeys("Honolulu");
		
		//If there is a port present after entering port name, click it
		driver.findElement(By.xpath("//*[@id=\'searchArea\']/div[2]/ul/li[2]/a")).click();
	}
}
