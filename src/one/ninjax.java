package one;

import org.openqa.selenium.chrome.ChromeDriver;

public class ninjax 
{
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation support\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");	
	driver.findElementByXPath("//input[@name='email']").sendKeys("anuja12589@gmail.com");
	driver.findElementByXPath("//input[@type='password']").sendKeys("123456");
	driver.findElementByXPath("//input[@type='submit']").click();}
}
