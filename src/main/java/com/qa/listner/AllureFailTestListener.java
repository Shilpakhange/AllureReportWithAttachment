package com.qa.listner;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.testbase.TestBase;

import io.qameta.allure.Attachment;

public class AllureFailTestListener extends TestBase implements ITestListener{


    @Override
    public void onTestFailure(ITestResult result) {
		System.out.println("*** Test execution " + result.getMethod().getMethodName() + " failed...");
		System.out.println(result.getMethod().getMethodName() + " failed!");

		//ITestContext context = result.getTestContext();
		//WebDriver driver = (WebDriver) context.getAttribute("driver");

		// attach screenshots to report
		saveFailureScreenShot(driver);
		
	}
	
	
	@Attachment(value = "Page screenshot", type = "image/png")
	public byte[] saveFailureScreenShot(WebDriver driver) {
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}

	public void onFinish(ITestContext context) {}
  
    public void onTestStart(ITestResult result) {   }
  
    public void onTestSuccess(ITestResult result) {   }

    public void onTestSkipped(ITestResult result) {   }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {   }

    public void onStart(ITestContext context) {   }
	
	
	
}
