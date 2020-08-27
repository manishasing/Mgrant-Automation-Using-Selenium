package com.Mgrant.MainPage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	protected static WebDriver driver;
	
	@BeforeTest
	public void setUp() throws Exception {
		
		File src=new File("./Configuration/Config.property");
		
		FileInputStream fis=new FileInputStream(src);
		
		Properties pro=new Properties();
		
		pro.load(fis);
		
		Reporter.log("===Property file loaded Successfully===");
		
		String chromepath=pro.getProperty("ChromeDriver");
		
		Reporter.log("===Browser Session Started===");
		
		System.setProperty("webdriver.chrome.driver",chromepath);
		
		driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String url=pro.getProperty("URL");

		driver.get(url);
//		Reporter.log("===Application Started===");
		System.out.println("Application Started");
		

	}
	
	

}
