package example;		


import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
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
			 }
			 else
			 {
				 System.setProperty("webdriver.chrome.driver", "/var/chromedriver/chromedriver");
			 }
			 
			 driver = new ChromeDriver();
			
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