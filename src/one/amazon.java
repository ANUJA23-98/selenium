package one;

import org.openqa.selenium.chrome.ChromeDriver;

public class amazon
{
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation support\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.findElementByXPath("//span[@class='nav-line-2 ']").click();
	driver.findElementByXPath("//input[@type='email']").sendKeys("anuja@gmail.com");
	driver.findElementByXPath("//input[@id='continue']").click();
	driver.findElementByXPath("//input[@type='password']").sendKeys("52565854");
	driver.findElementByXPath("//input[@type='submit']").click();
	driver.findElementByLinkText("Forgot Password").click();
}
}