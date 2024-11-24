package UtilitiesP;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import TestCaseFile.Testcls;

public class ExtentReport881 extends Testcls implements ITestListener{
	
	ExtentSparkReporter CreateReport;
	ExtentReports createTest;
	ExtentTest createlog;
	 void setup() 
	{
		
		CreateReport =new ExtentSparkReporter("Extent_Report12.html");
		createTest =new ExtentReports();
		createTest.attachReporter(CreateReport);
		
		createTest.setSystemInfo("Operating system", "Window");
		createTest.setSystemInfo("Browser", "Chrome");
		createTest.setSystemInfo("Browser version", "120.00.6699.227");
		createTest.setSystemInfo("User", "Shasha");
		
		CreateReport.config().setDocumentTitle("MyExtentReport");
		CreateReport.config().setReportName("New_Report21");
		CreateReport.config().setTheme(Theme.STANDARD);
		
	}
	
	public void onStart(ITestContext Result) 
	{
		setup();
		System.out.println("onStart");
	}
	public void onFinish(ITestContext Result) 
	{
	  createTest.flush();
	  System.out.println("On_Finish");
	}
	public void onTestStart(ITestResult Result) 
	{
		System.out.println("On_Test_Start");
		
	}
	public void onTestSuccess(ITestResult Result) 
	{
		createlog=createTest.createTest(Result.getName());
		createlog.log(Status.PASS,MarkupHelper.createLabel("Test Case is Pass",ExtentColor.GREY));
	}
	public void onTestFailure(ITestResult Result) 
	{
		try {
			screenshot();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String path="C:\\Users\\pc\\eclipse-workspace\\Game\\ScreenShot\\ST3.png";
		createlog=createTest.createTest(Result.getName());
		createlog.log(Status.FAIL,MarkupHelper.createLabel("Test Case is Fail",ExtentColor.GREY));
		createlog.fail("CaptureScreenshot"+createlog.addScreenCaptureFromPath(path));
	}
	public void onTestSkip(ITestResult Result) 
	{
		createlog=createTest.createTest(Result.getName());
		createlog.log(Status.SKIP,MarkupHelper.createLabel("Test Case is Skipped",ExtentColor.ORANGE));	
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) 
	{
		
	}

}
