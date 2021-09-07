package Function2;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Locators.loc;
@Listeners(Listeners1.class)
public class func {
	static ExtentReports report1;
	@Test
	
	public  void sample() {
		
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priteeshrikri.bidwa\\eclipse-workspace\\chromedriver.exe");
		
		WebDriver w;
		w= new ChromeDriver();

		w.get("https://ksrtc.in/oprs-web/login/show.do");
		
		ExtentReports extent = new ExtentReports("C:\\Users\\priteeshrikri.bidwa\\eclipse-workspace\\KSRTC1\\KsrtcReport\\new.html",true);

		 

        
        ExtentTest test = extent.startTest("My First Test", "Sample description");



        test.log(LogStatus.INFO, "This step shows usage of log(logStatus, details)");



        // report with snapshot
        String img = test.addScreenCapture("C:\\Users\\priteeshrikri.bidwa\\OneDrive - HCL Technologies Ltd\\Desktop\\ReportsE\\log.png");
        test.log(LogStatus.INFO, "Image", "Image example: " + img);
        
        test.log(LogStatus.PASS,"Test passed");
        test.log(LogStatus.FAIL,"Test failed");
        // end test
        extent.endTest(test);

        // calling flush writes everything to the log file
        extent.flush();
        
		
		PageFactory.initElements(w, loc.class);
		
		loc.email.sendKeys("pritsbidwai@gmail.com");
		loc.Pass.sendKeys("Pritee@123");
		loc.submit.click();
		
		
		
	//Locators.email(w).sendKeys("pritsbidwai@gmail.com");
	//	Locators.Pass(w).sendKeys("Pritee@123");
		
		//Locators.submit(w).click();
		
	}

}
