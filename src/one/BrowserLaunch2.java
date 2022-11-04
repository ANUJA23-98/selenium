package one;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch2 
{
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation support\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//web open
		driver.get("http://primusbank.qedgetech.com/");
		
		
		
	//	driver.findElementByClassName("style7").click();
		
		
		driver.findElementByName("idtxt").sendKeys("anuja@gmail.com");
		
		
		
		
		driver.findElementByName("pswdtxt").sendKeys("1234");
		
		driver.findElementByName("btnGO").click();
	}

}
