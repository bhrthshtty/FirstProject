package com.Infosys.MyMaven.MyMavenProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * Hello world!
 *
 */

public class BaseFile {

	public static String browser = null;
	public static String user_id = null;
	public static String password = null;
	public static String url = null;
	public static String path = null;
	static Properties properties=null;
	static FileInputStream fileInputStreamofConfigFile;
	static {
		// initian of log 4j.
		System.out.println("Log4J initiation and screenshot capture function in the BaseFile constructor");

		try {
			//Step1 -> Read the path
			
			// System.getProperty("user.dir") ='C:\\Users\\Bharathi\\MyMaven_TestNG_Bharathi\\MyMavenProject'
			path = System.getProperty("user.dir") + "/"
					+ "";
			System.out.println(path);
			
			// Step2-> convert the property file at given path into file input stream
			fileInputStreamofConfigFile = new FileInputStream(path);
			
			//Step 3-> Create property file object and load property file by using fileInputStream created in step 2.
		    properties = new Properties();
			properties.load(fileInputStreamofConfigFile);
			
			//Step 4-> Read different properties of .properties file and use it in different methods as per need.
			browser = properties.getProperty("browser");
			user_id = properties.getProperty("user_id");
			password = properties.getProperty("password");
			url = properties.getProperty("url");

		} catch (FileNotFoundException e) {//Exception may occur while creating the input file stream object
			System.out.println("File not found");
			e.printStackTrace();
		} catch (IOException e) {//Exception may occur while loading the .properties file 
			System.out.println("Unable to load the property file");
			e.printStackTrace();
		}
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Executing Regression Suite in the beforeSuite() with browser: " + browser);
		System.out.println("Opening the URL in the beforeSuite() : " + url);

	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Opening the chrome browser in the beforeClass()");

	}

	@BeforeTest
	public void beforeTest() {
		System.out.println(
				"Reading  common test data before execution of all test classes under test in the beforeTest()");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Reading test data before test case in the beforeMethod()");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Reading test data before test case in the afterMethod()");
		System.out.println("Entering user id in afterMethod()" + user_id);
		System.out.println("Entering the password in afterMethod()" + password);
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Updating test results and logs in the reports and log4j file  afterTest()");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Closing the browser  in afterClass()");
	}

	@AfterSuite

	public void afterSuite() {
		System.out.println("Flushing the cache in the afterSuite()");
	}

}
