package com.addreportsunifyusagesummary.endtoendtest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.addreportsunifyusagesummary.base.Base;
import com.addreportsunifyusagesummary.pom.AddReportsUnifyUsageSummaryAdmissionExecutive;
import com.addreportsunifyusagesummary.pom.LogInPage;


@Listeners(com.addreportsunifyusagesummary.itestlistener.list.class)
public class EndToEndTest extends Base 
{
	@Test(priority = 0, groups = { "smoke" },alwaysRun = true)
	public void AdExInitializBrowser() 
	{
		try 
		{
			System.out.println("Admission Executive User Browser initialization");
			Base basefirst = new Base();
			basefirst.initialization();
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority = 1, groups = { "smoke" })
	public void AdExlogin()
	{
		try 
		{
			System.out.println("Admission Executive User Login");
			LogInPage logmsm = new LogInPage(driver);
			logmsm.Logdata(prop.getProperty("email"), prop.getProperty("pass"));
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority = 2, groups = { "smoke" })
	public void AdExAddReportsUnifyUsageSummaryAgents() 
	{
		try 
		{
			AddReportsUnifyUsageSummaryAdmissionExecutive addadex=new AddReportsUnifyUsageSummaryAdmissionExecutive(driver);
			addadex.AddReportsUnifyUsageSummaryFields();
			addadex.QuitBrowser();
			
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();
		}
	}	
	
	@Test(priority = 3, groups = { "regration" },alwaysRun = true)
	public void MarManInitializBrowser() 
	{
		try 
		{
			System.out.println("Marketing Manager User Browser initialization");
			Base basemar = new Base();
			basemar.initialization();
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority = 4, groups = { "regration" })
	public void MarManlogin()
	{
		try 
		{
			System.out.println("Marketing Manager User Login");
			LogInPage logmar = new LogInPage(driver);
			logmar.Logdata(prop.getProperty("em"), prop.getProperty("ps"));
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority = 5, groups = { "regration" })
	public void MarManAddReportsUnifyUsageSummaryAgents() 
	{
		try 
		{
			AddReportsUnifyUsageSummaryAdmissionExecutive addrmar=new AddReportsUnifyUsageSummaryAdmissionExecutive(driver);
			addrmar.AddReportsUnifyUsageSummaryFields();
			addrmar.QuitBrowser();
			
		} 
		catch (Throwable e) 
		{
			e.printStackTrace();
		}
	}	
}