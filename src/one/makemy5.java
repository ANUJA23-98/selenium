package one;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class makemy5
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation support\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
       driver.get("https://www.makemytrip.com/");

       Actions act=new Actions(driver); 
       WebElement mouseover= driver.findElementByXPath("(//*[@ class='lbl_input latoBold  appendBottom5'])[1]");
       act.click(mouseover).build().perform();  
       
       Actions act1=new Actions(driver); 
       WebElement mouseover1= driver.findElementByXPath("//*[@class='font14 appendBottom5 blackText']");
       act1.click(mouseover1).build().perform();
       
       Thread.sleep(5000);
       
       Actions act3=new Actions(driver); 
       WebElement find = driver.findElementByXPath("(//*[@type='text'])[3]");
       find.sendKeys("Bangkok mueang");
       
       Thread.sleep(5000);
       find.sendKeys(Keys.ARROW_DOWN);
       
       Thread.sleep(5000);
       find.sendKeys(Keys.ARROW_DOWN);
       
       Thread.sleep(5000);
       find.sendKeys(Keys.ENTER);
       
       Thread.sleep(5000);
       act3.click(find).build().perform();
}
}