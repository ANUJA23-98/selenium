package Flipkart.copy;

import org.openqa.selenium.chrome.ChromeDriver;

public class flipAdd 
{
	public void main(String[] args)
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Automation support\\chromedriver.exe");
			
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.flipkart.com/");

		
		
		
		
		
		}
}