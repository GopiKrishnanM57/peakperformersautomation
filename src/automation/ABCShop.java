package automation;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ABCShop {
	
	
	  private WebDriver driver;
	  public static String baseUrl = "https://www.ecomdeveloper.com/designs/demoshop/";
	  
	  @BeforeMethod
	  public void setUp() throws Exception {
	    
		  //System.setProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		  System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32 (1)\\chromedriver.exe");
	      driver=new ChromeDriver();
	      driver.get(baseUrl);
		  driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
	        driver.manage().window().maximize();		
	  }
	  
	  @Test
	  public void testWeb() throws Exception {
	    
		 driver.findElement(By.name("search")).click();
		 
		 driver.findElement(By.name("search")).sendKeys("saree");
		 driver.findElement(By.xpath("//*[@id=\"search\"]/div")).click();
		 driver.findElement(By.xpath("//*[@id=\"mfilter-content-container\"]/div/div[4]/div[2]/div/div[1]/div/div[2]/a")).click();
		 String button =  driver.findElement(By.id("button-cart")).getAttribute("id");
		 assertEquals("button-cart",button);
         driver.findElement(By.id("button-cart")).click();
         
         driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div[2]/div/div[5]/div[1]/input")).click();
         driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div[2]/div/div[5]/div[1]/input")).sendKeys("110001");
         driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div[2]/div/div[5]/div[1]/div")).click();
         driver.findElement(By.xpath("//*[@id=\"cart\"]/div[1]/a")).click();
         driver.findElement(By.xpath("//*[@id=\"cart\"]/div[2]/div[3]/a[2]")).click();
         String name = driver.findElement(By.name("email")).getAttribute("name");
         assertEquals("email",name);
         driver.findElement(By.name("email")).click();
         driver.findElement(By.name("email")).sendKeys("xyzz@gmail.com");
         String name1 = driver.findElement(By.name("password")).getAttribute("name");
         assertEquals("password",name1);
        
         driver.findElement(By.name("password")).click();
         driver.findElement(By.name("password")).sendKeys("qwerty123@");
         
         driver.findElement(By.id("button-login")).click();
         
         driver.findElement(By.id("button-payment-address")).click();
         driver.findElement(By.id("button-shipping-address")).click();
         driver.findElement(By.id("button-shipping-method")).click();
         driver.findElement(By.name("agree")).click();
         driver.findElement(By.id("button-payment-method")).click();
         driver.findElement(By.id("button-confirm")).click();
         driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]")).click();
         driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/a[1]")).click();
         driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/a")).click(); 
         
         
	  }
	  
	  @AfterMethod
	  public void tearDown() throws Exception {
		   driver.close();
	  }

}