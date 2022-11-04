package one;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert
{
	public static void main(String[]args) 
	{
	System.setProperty("webdriver.chrome.driver", "E:\\Automation support\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	   driver.get("https://www.rediffmailpro.com/cgi-bin/login.cgi");  //open rediffmail
	   driver.findElementByXPath("//*[@class='vmiddle'][2]").click(); //click on login we will get pop up window 
	       //--> which is not operatable by inspection so we will use "alert method" to close it 
	   
	   Alert                                alt=driver.switchTo().       alert();
	 //↑ retun type of "alert()" Method                                   //↑ Method name
	   
	String text=alt.getText();           
	   System.out.println(text);        //to get(read) pop up message (text)
	   
	   alt.accept();
	   //alt.dismiss();                   //To close the pop up
	
}
}