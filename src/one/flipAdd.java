package one;

import org.openqa.selenium.chrome.ChromeDriver;

public class flipAdd
{
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation support\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElementByXPath("//input[@class='_2IX_2- VJZDxU']").sendKeys("anuja@gmail.com");
        driver.findElementByXPath("//input[@type='password']").sendKeys("52565854");
        driver.findElementByXPath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']").click();	
	    driver.findElementByLinkText("Forgot?").click();	
	    }
}