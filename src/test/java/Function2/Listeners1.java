package Function2;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners1 extends func implements  ITestListener {

public void onTestStart(ITestResult result) {
        
        
    }

 

    public void onTestSuccess(ITestResult result) {
        System.out.println("success" +result.getName()); 
        
    }

 

    public void onTestFailure(ITestResult result) {
    	System.out.println("Failure" +result.getName()); 
        
    }

 

    public void onTestSkipped(ITestResult result) {
    	System.out.println("Skipped" +result.getName());
        
    }

 

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    	System.out.println("FailedButWithinSuccessPercentage" +result.getName());
    }

 

    public void onStart(ITestContext context) {
    	
        
    }

 

    public void onFinish(ITestContext context) {
    	
        
    }

 

            
    }



