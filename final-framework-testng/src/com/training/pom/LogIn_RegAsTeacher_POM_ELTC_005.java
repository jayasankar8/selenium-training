package com.training.pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LogIn_RegAsTeacher_POM_ELTC_005 {
 
private WebDriver driver; 
	
	public LogIn_RegAsTeacher_POM_ELTC_005(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	@FindBy(id="form-login_submitAuth") 
	private WebElement loginBtn; 
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	
	@FindBy(xpath="/html/body/main/section/div/div/div/section/section/div[1]/div/div[2]/div[2]/ul/li[2]/a")
	private WebElement addUser;   
	public void addUser2() {
		this.addUser.click();
	}
	
	@FindBy(id="firstname")
	private WebElement firstName;
	public void sendFirstName(String firstName) {
		this.firstName.clear();
		this.firstName.sendKeys(firstName);
	}
	
	@FindBy(id="lastname")
	private WebElement lastName;
	public void sendLastName(String lastName) {
		this.lastName.clear();
		this.lastName.sendKeys(lastName);
	}
	
	@FindBy(id="email")
	private WebElement email;
	public void sendemail(String email) {
		this.email.clear();
		this.email.sendKeys(email);
	}
	
	@FindBy(id="phone")
	private WebElement phone;
	public void sendphone(String phone) {
		this.phone.clear();
		this.phone.sendKeys(phone);
	}
	
	@FindBy(id="username")
	private WebElement username1;
	public void sendusername(String username1) {
		this.username1.clear();
		this.username1.sendKeys(username1);
	}
	
	@FindBy(id="password")
	private WebElement password1;
	public void sendPassword1(String password1) {
		this.password1.clear();
		this.password1.sendKeys("password[password]");
	}
	
	@FindBy(xpath="//*[@data-id='status_select']")
	private WebElement select2;
	@FindBy(xpath="//span[contains(text(),'Trainer')]")
	private WebElement profile;
	public void sendProfile() {
		Actions action1 = new Actions(this.driver);
		action1.moveToElement(select2).click().build().perform();
		//action1.sendKeys("Trainer").build().perform();
		action1.moveToElement(profile).click().build().perform();
	}
		
	@FindBy(xpath="//*[@data-id='user_add_language']")
	private WebElement languageid;
	
	@FindBy(xpath="//span[contains(text(),'English')]")
	private WebElement language;
	public void sendLanguage() {
		driver.findElement(By.xpath("//*[contains(text(),'Language')]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions actionlang = new Actions(this.driver);
		actionlang.moveToElement(languageid).click().build().perform();
		actionlang.moveToElement(language).click().build().perform();
	}
	
	@FindBy(id="qf_151e84")
	private WebElement active; 
	public void selectAccount() {
		this.active.click();
	}
	
	@FindBy(name="submit")
	private WebElement submit; 
	public void submit() {
		this.submit.click();
	} 
}
