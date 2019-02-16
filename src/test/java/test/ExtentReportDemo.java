package test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;

public class ExtentReportDemo {
    public static void main(String[] args) {
        ExtentHtmlReporter extentHtmlReporter = new ExtentHtmlReporter("extentReports.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(extentHtmlReporter);
        ExtentTest test = extent.createTest("MyFirstTest");
        test.log(Status.INFO,"Starting the test");
        System.setProperty("webdriver.chrome.driver","/Users/monilj/Documents/SeleniumFromScratch/src/test/resourecs/chromedriver");
        WebDriver webDriver = new ChromeDriver();

        GoogleSearchPage gp = new GoogleSearchPage(webDriver);

        webDriver.get("https://www.google.com/");
        gp.enterTxt("selenium");
        gp.clickSearchButton();
        test.pass("test completed and passed");
        webDriver.close();
        extent.flush();
    }



}
