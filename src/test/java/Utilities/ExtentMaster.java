package Utilities;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentMaster {
	 static ExtentReports extent;
		
		public static ExtentReports createInstance() {
			

	        	 String workingDir = System.getProperty("user.dir");
	             SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH.mm.ss");
	         	Date date = new Date();
	         	
	             String fileName = "ExtentReportResults "+formatter.format(date)+".html";
	             
			ExtentHtmlReporter htmlrepoter = new ExtentHtmlReporter(workingDir+"\\ExtentReports\\"+fileName);
			    htmlrepoter.config().setEncoding("utf-8");
		        htmlrepoter.config().setDocumentTitle("Test Results");
		        htmlrepoter.config().setReportName("Automation Results");
		        htmlrepoter.config().setTheme(Theme.STANDARD);
		        extent = new ExtentReports();
		        extent.attachReporter(htmlrepoter);
				extent.setSystemInfo("Murali Grandhi","Automation Engineer");

		      
			return extent;
			
		}

}
