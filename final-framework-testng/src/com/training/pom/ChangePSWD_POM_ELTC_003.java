package com.training.pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ChangePSWD_POM_ELTC_003 {
 
private WebDriver driver; 
	
	public ChangePSWD_POM_ELTC_003(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	@FindBy(xpath="/html/body/main/section/div/div/div[2]/div/div[2]/div/div[2]/div/ul/li[4]/a")
	private WebElement editProfile; 
	public void clickEditProfile() {
		this.editProfile.click();
	}
	@FindBy(id="profile_password0")
	private WebElement existingpassword;
	public void sendExistingPassword(String password0) {
		this.existingpassword.clear();
		this.existingpassword.sendKeys(password0);
	}
	
	@FindBy(id="password1")
	private WebElement newpassword;
	public void sendNewPassword(String password1) {
		this.newpassword.clear();
		this.newpassword.sendKeys(password1);
	}
	
	@FindBy(id="profile_password2")
	private WebElement confirmpassword;
	public void sendConfirmPassword(String password2) {
		this.confirmpassword.clear();
		this.confirmpassword.sendKeys(password2);
	}
	
	@FindBy(id="profile_apply_change")
	private WebElement saveBtn; 
	public void clickSaveBtn() {
		saveBtn.click();
	}
	
}
