package com.qa.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static Properties prop;
	public FileInputStream fis;
	public static WebDriver driver;
	public static CommomUtility oCommon=new CommomUtility();
	public static Constants oConstant=new Constants();
	
	public TestBase() {
		 prop=new Properties();
		 try {
			 System.out.println(System.getProperty("user.dir"));
			fis=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/properties/test/config.properties");
			prop.load(fis);
			System.getProperties().putAll(prop);
		 } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void initilization() {
		String browser=System.getProperty("browser");
		System.out.println("browser name is: "+browser);
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("safari")) {
			driver=new SafariDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(System.getProperty("url"));
		System.out.println("Browser launched");
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	
	
	
}
