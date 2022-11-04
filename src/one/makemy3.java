package one;       //wrong pro *

import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.remote.server.handler.interactions.MouseDown;

public class makemy3 
{
	//private static final String MouseDown = null;

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation support\\chromedriver.exe");
		Thread.sleep(5000);
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
       find.sendKeys(Keys.ENTER);
       //act3.click(find).build().perform(); 
       
       //act3.moveToElement(find);
      // Thread.sleep(5000);
       //act3.moveToElement().perform();
       
      // Actions act2=new Actions(driver); 
       //WebElement mouseover2= (WebElement) driver.getMouse();
       
       
       
	 //find.sendKeys(Keys.ARROW_DOWN);
	   //find.sendKeys(Keys.ARROW_DOWN);
//find.sendKeys(Keys.ENTER);

}
}