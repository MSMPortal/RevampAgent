package com.addreportsunifyusagesummary.pom;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.addreportsunifyusagesummary.base.Base;
import com.addreportsunifyusagesummary.utility.UtilityFile;
	
public class AddReportsUnifyUsageSummaryAdmissionExecutive extends Base
{
	WebDriver driver;
	Actions a;
	JavascriptExecutor exi;
	WebDriverWait wait;
	public AddReportsUnifyUsageSummaryAdmissionExecutive(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//p[text()='Reports']")
	WebElement reports;
	@FindBy(xpath ="(//span[text()='Unify Usage Summary'])[1]")
	WebElement UnifyUsage;
	@FindBy(xpath ="//*[@name='report']//div[@class='mat-select-value']")
	WebElement report;
	@FindBy(xpath ="//*[@name='PartnerType']//div[@class='mat-select-value']")
	WebElement partnertype;
	@FindBy(xpath = "//input[@aria-label='dropdown search']")
	WebElement dropdownsearch;
	@FindBy(xpath ="(//span[@class='mat-option-text'])[2]")
	WebElement gmoselect;
	@FindBy(xpath ="(//span[@class='mat-option-text'])[3]")
	WebElement abcodoselect;
	@FindBy(xpath ="(//span[@class='mat-option-text'])[1]")
	WebElement allselect;
	@FindBy(xpath = "//input[@placeholder='From Date']")
	WebElement fromdate;
	@FindBy(xpath = "//input[@placeholder='To Date']")
	WebElement todate;
	@FindBy(xpath = "//span[text()='Get']")
	WebElement gettab;
	
	
	public void AddReportsUnifyUsageSummaryFields()
	{
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		a = new Actions(driver);
		wait = new WebDriverWait(driver, 40);
		exi = (JavascriptExecutor) driver;
		try 
		{
			String dexpected="Dashboard";
			String dactual=driver.findElement(By.xpath("//p[text()='Dashboard']")).getText();
			Assert.assertEquals(dactual, dexpected);	
			System.out.println("Enter In Dashboard Page");
			UtilityFile.screenShot(driver);
			
			Thread.sleep(3000);
			reports.click();
			Thread.sleep(2000);
			UtilityFile.screenShot(driver);
			exi.executeScript("arguments[0].scrollIntoView();",UnifyUsage);
			Thread.sleep(2000);
			UnifyUsage.click();
			Thread.sleep(2000);
			UtilityFile.screenShot(driver);
			
			String kexpected="Unify Usage Summary";
			String kactual=driver.findElement(By.xpath("(//span[text()='Unify Usage Summary'])[2]")).getText();
			Assert.assertEquals(kactual, kexpected);
			System.out.println("Enter In Unify Usage Summary Page");
			
			report.click();
			Thread.sleep(2000);
			UtilityFile.screenShot(driver);
			dropdownsearch.sendKeys("Applications punched by Admission executives");
			Thread.sleep(2000);
			gmoselect.click();
			Thread.sleep(2000);
			UtilityFile.screenShot(driver);
			
			partnertype.click();
			Thread.sleep(2000);
			UtilityFile.screenShot(driver);
			gmoselect.click();
			Thread.sleep(2000);
			UtilityFile.screenShot(driver);
			gettab.click();
			Thread.sleep(2000);
			UtilityFile.screenShot(driver);
			
			partnertype.click();
			Thread.sleep(2000);
			UtilityFile.screenShot(driver);
			abcodoselect.click();
			Thread.sleep(2000);
			UtilityFile.screenShot(driver);
			gettab.click();
			Thread.sleep(2000);
			UtilityFile.screenShot(driver);
			
			partnertype.click();
			Thread.sleep(2000);
			UtilityFile.screenShot(driver);
			allselect.click();
			Thread.sleep(2000);
			UtilityFile.screenShot(driver);
			gettab.click();
			Thread.sleep(2000);
			UtilityFile.screenShot(driver);
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public void QuitBrowser()
	{
		driver.quit();
	}
}
