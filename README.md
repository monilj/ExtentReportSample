# ExtentReportSample
Extent reports is an HTML report library i.e it is a library which helps to write a report in html format.
We can add jar to our project or we can add maven dependecy.
```
<dependency>
    <groupId>com.aventstack</groupId>
    <artifactId>extentreports</artifactId>
    <version>4.0.9</version>
</dependency>
```
Create a new class called extentReportDemo add following code to it
```
ExtentHtmlReporter extentHtmlReporter = new ExtentHtmlReporter("extentReports.html");
```
Here extentReprt.html is file name in which reports will get stored. You can give different path also.
After that we have to enable reporter 
```
ExtentReports extent = new ExtentReports();
extent.attachReporter(extentHtmlReporter);
```
We need to create extent test for that there we will another class from Extent report library called ExtentTest 
```
ExtentTest test = extent.createTest("MyFirstTest");
```
Then write your test code.

We can add logs to the test as well. For example
```
test.log(Status.INFO,"Starting the test");
test.pass("test completed and passed");
```
And at last we have to call the flush method which write all the things to report
```
extent.flush()
```
After running. Code we will get extentReports.html file generated in the project.

Some additional  reliable things about ExtentReport
* We can change theme of report for the appearance.

* We can hide/show dashboard as per user convenience.

* If we have multiple test cases we can search test case even by step.

* User can see start time (in green), end time (in red) and total time taken by test.

* There are useful filters present on top right corner which filters according to status (passed test cases,failed test cases, test cases with only info)
