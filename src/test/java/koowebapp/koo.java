package koowebapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class koo {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	@BeforeTest
	public void BeT() throws InterruptedException{
		htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
	driver.get("https://www.kooapp.com/feed");
	driver.manage().window().maximize();
	}
	@Test
	public void t1() throws InterruptedException {
		test = extent.createTest("Checking the functionality of video feature");
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//h5[text()='Videos']")).click();
		 
	     
		 test.pass("user is able to click on Videos module");
	}
		@Test
		public void t2() throws InterruptedException {
			test = extent.createTest("Checking the posts of videos is showing or not");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"video-1b2ae86b-2ed7-4cef-91c8-5d8b81bf4c58\"]")).click();
			test.pass("user is able to see posts related to videos");
			
		}
			
        @Test
        public void t3() throws InterruptedException {
        	test = extent.createTest("Checking the pause function of video");
			Thread.sleep(3000);	
			driver.findElement(By.xpath("(//span[@class='MuiIconButton-label'])[1]")).click();
			test.pass("user is able to pause the  video");
     }
        @Test
        public void t4() throws InterruptedException { 
        	test = extent.createTest("Checking the zoom in function of video");
			Thread.sleep(3000);	
        	driver.findElement(By.xpath("//*[@id=\"gridParent\"]/div[2]/div[3]/button[3]/span[1]")).click();
        	test.pass("user is able to zoom the  video");
        }
        @Test
        public void t5() throws InterruptedException {
        	test = extent.createTest("Checking the zoom out function of video");
			Thread.sleep(3000);
        	Actions act = new Actions(driver);

        	WebElement ele = driver.findElement(By.xpath("//*[@id=\"video-1b2ae86b-2ed7-4cef-91c8-5d8b81bf4c58\"]/video")); 
        	act.doubleClick(ele).perform();
        	test.pass("user is able to zoom out the  video");
        }
        @Test
        public void t6() throws InterruptedException {
        	test = extent.createTest("Checking the volume function of video");
			Thread.sleep(3000);
        	driver.findElement(By.xpath("//*[@id=\"gridParent\"]/div[2]/div[3]/button[2]/span[1]")).click();
        	test.pass("user is able to mute the video");
        }
        @Test
        public void t7() throws InterruptedException {
        	test = extent.createTest("Checking the functionality of poll feature");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//h5[text()='Polls']")).click();
			test.pass("user is able to navigate to polls");
        }
        @Test
        public void t8() throws InterruptedException {
        	test = extent.createTest("Checking the functionality of cricket feature");
			Thread.sleep(3000);
        	driver.findElement(By.xpath("//h5[text()='Cricket']")).click();
        	test.pass("user is able to navigate to cricket");
        	
        }
        @Test
        public void t9() throws InterruptedException {
        	test = extent.createTest("Checking the functionality of cricket feature");
			Thread.sleep(3000);
        	driver.findElement(By.xpath("//h5[text()='New']")).click();
        	test.pass("user is able to navigate to cricket");
        }
        
       @ AfterTest
       
       public void t10() throws InterruptedException {
    	   driver.quit();
    	  extent.flush();
       
       }
       }


