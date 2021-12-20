package com.test.ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LoginTesting 
{
	public static ExtentReports extent;
	public static ExtentSparkReporter htmlReporter;
	public void loginTes() 
	{
	 extent = new ExtentReports();
	htmlReporter=new ExtentSparkReporter("Extentreports/Regressionreports.html");
	}
}