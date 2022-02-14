package com.addreportsunifyusagesummary.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class Base
{
	public Properties prop;
	public static WebDriver driver;
	
	
	public Base()
	{
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream("C:\\Users\\funak\\AutomationTester\\AddReportsUnifyUsageSummaryAdEx\\target\\config.properties");
			prop.load(ip);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}	
			

	public void initialization() throws Throwable {
		String browsewName=prop.getProperty("browser");
		if(browsewName.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\funak\\AutomationTester\\AddReportsUnifyUsageSummary\\target\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browsewName.equals("firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(3000);

	}




}


