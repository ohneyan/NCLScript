/*
 * Written By: Jorge Suarez | Github: ohneyan
 * Scenario Selected: 1
 * Scenario Description: Guest explores Ports of Departure
 * */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1Methods
{
	public WebDriver driver;
	
	//This method sets up the WebDriver at the file location entered, and directs us to the URL entered
	public void setupDriver(String fileLocation, String url) 
	{
		System.setProperty("webdriver.chrome.driver", fileLocation);
		driver = new ChromeDriver();
		driver.get(url);	
	}
	
	//This method searches for the image pop up that randomly appears on the page
	//If the image pop up is present, then the method will close it to continue
	public void popupCheck()
	{
		if(driver.findElements(By.xpath("//*[@id=\'IPEinvL850\']")).size() > 0)
		{
			driver.findElement(By.xpath("//*[@id=\'IPEinvL850\']/map/area[1]")).click();
		}
	}
	
	//This method clicks on the port link on the Homepage
	public void clickPortLink()
	{
		By.className("linkItem");
		driver.findElement(By.linkText("Ports")).click();
	}
	
	//This method types the port name onto the search bar
	public void searchPort(String port)
	{
		driver.findElement(By.xpath("//*[@id=\'searchbar\']")).sendKeys(port);
	}
	
	//This method clicks on the port available after port has been searched
	public void clickOnPort() 
	{
		driver.findElement(By.xpath("//*[@id=\'searchArea\']/div[2]/ul/li[2]/a")).click();
	}
	
	//This method allows the page to be delayed to load all page components
	public void delayPageLoad()
	{
		try
		{
			Thread.sleep(11000);
		} catch (InterruptedException e)
		{
			Thread.currentThread().interrupt();
		}
	}
}