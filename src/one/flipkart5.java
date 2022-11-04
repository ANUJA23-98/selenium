package one;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart5
{
public static void main(String[]args) throws Throwable
{
System.setProperty("webdriver.chrome.driver", "E:\\Automation support\\chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
   driver.get("https://www.flipkart.com/");
   
   driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();                    //for closing pop up window 
  
  // Actions act=new Actions(driver);                                                    
  // WebElement mouseover= driver.findElementByXPath("(//*[@class='eFQ30H'])[5]");       // for getting mouse point on electronics element
  // act.moveToElement(mouseover).build().perform();
   
   Actions act1=new Actions(driver);
   WebElement   search=          driver.findElementByXPath("(//*[@class='eFQ30H'])[7]");             //for getting mouse point on appliances element     
 //↑retuntype //↑variableName  //↑variable value
   act1.click(search).build().perform();
   Thread.sleep(10000);
   
   //driver.findElementByXPath("//*[@class='_3704LK']").sendKeys("Air conditioners");      // only for searching air conditioner on search button
   
   Actions act2=new Actions(driver);
   WebElement search1=driver.findElementByXPath("//*[@class='_3704LK']");                 //to get point on search button 
		   search1.sendKeys("Air conditioners");                                          //to provide 'air conditioner' name to search
		   
		   search1.sendKeys(Keys.ARROW_DOWN);                                             //to get arrow on require field
		   search1.sendKeys(Keys.ARROW_DOWN);
		   search1.sendKeys(Keys.ARROW_DOWN);
 search1.sendKeys(Keys.ENTER);
 act2.doubleClick(search1).build().perform();
}
}
