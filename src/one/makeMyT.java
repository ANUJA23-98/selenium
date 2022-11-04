package one;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class makeMyT 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation support\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
       driver.get("https://www.makemytrip.com/");
       //driver.findElement(By.xpath("(//*[@ class='lbl_input latoBold  appendBottom5'])[1]"));
       Actions act=new Actions(driver); 
       WebElement mouseover= driver.findElementByXPath("(//*[@ class='lbl_input latoBold  appendBottom5'])[1]");
       act.click(mouseover).build().perform();
       
       Actions act1=new Actions(driver); 
       WebElement mouseover1= driver.findElementByXPath("//*[@class='font14 appendBottom5 blackText']");
       act1.click(mouseover1).build().perform();
       
       Actions act2=new Actions(driver); 
       WebElement mouseover2=driver.findElementByXPath("(//*[@ class='lbl_input latoBold  appendBottom5'])[2]");
       act2.click(mouseover2).build().perform();
       
      Actions act3=new Actions(driver); 
      WebElement mouseover3=driver.findElementByXPath("(//*[@class='font14 appendBottom5 blackText'])[3]");
       act3.click(mouseover3).build().perform();
      
       // WebElement search=driver.findElementByTagName("p");
       //search.sendKeys(Keys.ARROW_DOWN);
       //search.sendKeys(Keys.ARROW_DOWN);
       //search.sendKeys(Keys.ARROW_DOWN);
       //search.sendKeys(Keys.ENTER);
      // act.doubleClick(search).build().perform();    
       //act.contextClick(search).build().perform();
       //driver.findElementByXPath("(//*[@type='text'])[2]");
       //driver.findElementByXPath("//*[@class='font14 appendBottom5 blackText']");
}
}