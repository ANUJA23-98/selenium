package one;

import org.openqa.selenium.chrome.ChromeDriver;

	public class ninja 
	{
		public static void main(String[] args)
		{
			
			System.setProperty("webdriver.chrome.driver", "E:\\Automation support\\chromedriver.exe");
			
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElementByName("email").sendKeys("anuja12589@gmail.com");
		driver.findElementByName("password").sendKeys("565847");
		driver.findElementByXPath("//input[@type='submit']").click();

}
}