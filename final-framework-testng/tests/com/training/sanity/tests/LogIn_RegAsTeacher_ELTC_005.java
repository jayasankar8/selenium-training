package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LogIn_RegAsTeacher_POM_ELTC_005;
import com.training.pom.LoginPOM_ELTC_001;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LogIn_RegAsTeacher_ELTC_005 {
 
	private WebDriver driver;
	private String baseUrl;
	private LogIn_RegAsTeacher_POM_ELTC_005 loginPOM1;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
	driver = DriverFactory.getDriver(DriverNames.FIREFOX);
	loginPOM1 = new LogIn_RegAsTeacher_POM_ELTC_005(driver); 
	baseUrl = properties.getProperty("baseURL");
	screenShot = new ScreenShot(driver); 
	// open the browser 
	driver.get(baseUrl);
	
}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
	@Test
	public void validLoginTest() throws InterruptedException {
		loginPOM1.sendUserName("admin");
		loginPOM1.sendPassword("admin@123");
		loginPOM1.clickLoginBtn(); 
		screenShot.captureScreenShot("First");
		loginPOM1.addUser2();
		loginPOM1.sendFirstName("jaya2");
		loginPOM1.sendLastName("sankar2");
		loginPOM1.sendemail("jaya2sankar2@gmail.com");
		loginPOM1.sendphone("9934561118");
		loginPOM1.sendusername("jaya2");
		loginPOM1.sendPassword1("sankar22");
		loginPOM1.sendProfile();
		Thread.sleep(3000);
		loginPOM1.sendLanguage();
		loginPOM1.submit();
		screenShot.captureScreenShot("ELTC_005");
		} 
}
