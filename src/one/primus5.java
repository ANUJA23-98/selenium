package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class primus5
{
public static void main (String[]args) throws InterruptedException
{

	System.setProperty("webdriver.chrome.driver", "E:\\Automation support\\chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
   driver.get("http://primusbank.qedgetech.com/");
  
   Thread.sleep(5000);
   driver.findElement(By.xpath("//*[@id='txtuId']")).sendKeys("Admin"); //we can use xpath by using "find element"
   driver.findElementById("txtPword").sendKeys("Admin");                //by using general locator
   driver.findElementByXPath("//*[@id='login']").click();             //Advanced locator
   driver.findElementByXPath("(//img[@height='24'])[2]").click();   //here we used [2] to locate exact location of "branches" 
                                                                   //--> as we have more then one properties of same "height=24"
   
   Select     sel=new Select(driver.findElementByXPath("//*[@name='lst_countryS']"));
   sel.selectByVisibleText("INDIA");  //selected by visible text
   
   Select sel1=new Select(driver.findElementByName("lst_stateS"));
   sel1.selectByIndex(3);             //selected by index no
   
   Select sel2=new Select (driver.findElement(By.xpath("//*[@id='lst_cityS']")));
   sel2.selectByValue("Delhi");      //selected by value
   
   driver.findElementByName("btn_search").click();
   driver.close();                                      //current tab close
   //driver.quit();                                       // entire browser close 
   
}


}
