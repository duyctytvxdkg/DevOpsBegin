package example;		


import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;	


public class NewTest {		
	    private WebDriver driver;		
		@Test				
		public void testEasy() {	
			driver.get("http://demo.guru99.com/test/guru99home/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 	
			
			
		}	
		@BeforeTest
		public void beforeTest() {	
			
			 String os  = System.getProperty("os.name");
			 System.out.println(os);
			 
			 if(os.toString().contains("Windows"))
			 {
				 System.setProperty("webdriver.chrome.driver", "D://Pho mat/DevOps/Software/chromedriver_win32/chromedriver.exe");
				 driver = new ChromeDriver();
			 }
			 else
			 {
				 
				 ChromeOptions ChromeOptions = new ChromeOptions();
				 ChromeOptions.addArguments("--headless", "window-size=1024,768", "--no-sandbox");
				 //System.setProperty("webdriver.chrome.driver", "/home/duynn/Downloads/chromedriver");
				 System.out.println( System.getProperty("webdriver.chrome.driver").toString());
				 driver = new ChromeDriver();
				 //donothing just install chrome driver on jenkin
			 }
			 
			 
			
			//**************************************************************
			//System.setProperty("webdriver.gecko.driver","D://Pho mat/DevOps/Software/geckodriver-v0.20.1-win64/geckodriver.exe"); 
			//driver = new FirefoxDriver();
			
			//**************************************************************
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}	
