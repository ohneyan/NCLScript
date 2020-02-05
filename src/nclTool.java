import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class nclTool
{

	public static void main(String[] args)
	{
	
		//Open the Chrome Browser Driver and creating the Driver object
		System.setProperty("webdriver.chrome.driver", "C:\\IDEs & Frameworks\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver = new ChromeDriver(capabilities);
		*/
		
		//Boolean for Image
		Boolean imgPresent = driver.findElements(By.xpath("//*[@id=\'IPEinvL850\']/img")).size() > 0;
		
		//Open Chrome driver for NCL.com
		driver.get("http://ncl.com");
		
		//Check for popup image
		if(imgPresent == true)
		{
			driver.findElement(By.xpath("//*[@id=\'IPEinvL850\']/map/area[1]")).click();
		}

		
		
		//This will click on the ports page 
		By.className("linkItem");
		driver.findElement(By.linkText("Ports")).click();
		
		//Check for popup image
		
		//sleep for page load
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
			//This works - I just need to find a if statement to verify if its there
			driver.findElement(By.xpath("//*[@id=\'IPEinvL850\']/map/area[1]")).click();
		}
		
		//Search for Honolulu port
		driver.findElement(By.xpath("//*[@id=\'searchbar\']")).sendKeys("Honolulu");
		
		//If there is a port present after entering port name, click it
		driver.findElement(By.xpath("//*[@id=\'searchArea\']/div[2]/ul/li[2]/a")).click();
	}

}
