package ProjectNew;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class website 
{
	
	public static void main(String[] args) 
		{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation support\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			
		driver.get("https://www.flipkart.com/");    
}
}