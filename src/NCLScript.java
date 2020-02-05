/*
 * Written By: Jorge Suarez | Github: ohneyan
 * Scenario Selected: 1
 * Scenario Description: Guest explores Ports of Departure
 * */

public class NCLScript
{ 
	public static void main(String[] args)
	{	
		//Local Variables
		String fileLocation = "C:\\IDEs & Frameworks\\Selenium\\ChromeDriver\\chromedriver.exe";
		String url = "http://ncl.com";
		String port = "Honolulu";
		
		//Creating object for Methods class
		Scenario1Methods methods = new Scenario1Methods();
		
		//Methods for Script
		methods.setupDriver(fileLocation, url);
		methods.popupCheck();
		methods.clickPortLink();
		methods.delayPageLoad();
		methods.popupCheck();
		methods.searchPort(port);
		methods.clickOnPort();	
	}
}