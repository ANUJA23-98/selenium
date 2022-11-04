package one;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch 
{
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation support\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//app open
		driver.get("https://www.facebook.com/");
		//driver.close();
		
		//provide mail
		driver.findElementById("email").sendKeys("anuja123@gmail.com");
		//MethodnName.ReturnType.className
		
		//provide pass
		 driver.findElementByName("pass").sendKeys("123"); //If class name have space in bet then Selenium dosn't works
		
		//click on log in
		//driver.findElementByName("login").click();
		
		 //forgot pass
		driver.findElementByLinkText("Forgotten password?").click(); 
		
		driver.findElementById("identify_email").sendKeys("anuja123@gmail.com");
		
		//To cancel 
		driver.findElementByLinkText("Cancel").click();
	}

}
