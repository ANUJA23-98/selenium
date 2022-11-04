package Flipkart.copy;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch 
{
	public static void main(String[] args)
	{
		
	System.setProperty("webdriver.chrome.driver", "E:\\Automation support\\chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//app open
	driver.get("https://www.flipkart.com/");
		//driver.close();
		
	// absolute x path: it has dome drowback if element get updated or deleted x path get disturb and its too long to 
	//driver.findElementByXPath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input").sendKeys("anuja@gmail.com");
	                            //↑ single forward slash defines it started from root node 

	//by using relative x path : enter mail ID
	driver.findElementByXPath("//input[@class='_2IX_2- VJZDxU']").sendKeys("anuja@gmail.com");             //autocomplete='off'
	                         //↑ double forward slash defines it started from current node
	
	//enter pass
    driver.findElementByXPath("//input[@class='_2IX_2- _3mctLh VJZDxU']").sendKeys("1234");
	
 //  login
	//driver.findElementByXPath("// button[@class='_2KpZ6l _2HKlqd _3AWRsL']").click();
	
    driver.findElementByXPath("//span[text()='Forgot?']").click();	}

}
