package one;   //wrong pro *

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMy 
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
       
       //Actions act2=new Actions(driver); 
      // WebElement mouseover2=driver.findElementByXPath("(//*[@ class='lbl_input latoBold  appendBottom5'])[2]");
      // act2.click(mouseover2).build().perform();
       
       Thread.sleep(5000);
       
      
      // driver.findElementById("toCity").sendKeys("Bangkok");
       
     //  Thread.sleep(5000);
       Actions act3=new Actions(driver); 
     // WebElement find=
    		 
    	       
    		 

      WebElement find = driver.findElementByXPath("//*[@id='toCity']");
      find.sendKeys("Bangkok");
	//driver.findElementByXPath("//*[@id='toCity']").sendKeys("Bangkok");
      //act3.click(find).sendKeys(Keys.ENTER).build().perform();
     
      
      //Thread.sleep(5000);

      
       find.sendKeys(Keys.ARROW_DOWN);
       //Thread.sleep(10000);
       find.sendKeys(Keys.ARROW_DOWN);
       
     // find.sendKeys(Keys.ENTER);
     act3.click(find).build().perform();
         
}
}