package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LostRecoverPSWD_pom_ELTC_004 {
  
private WebDriver driver; 
	
	public LostRecoverPSWD_pom_ELTC_004(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/main/section/div/div/div[2]/div/div/div/ul/li/a")
	private WebElement lostpswd; 
	public void clickLostPswd() {
		this.lostpswd.click();
	}
	
	@FindBy(id="lost_password_user")
	private WebElement email;
	public void sendEmail(String email) {
		this.email.clear();
		this.email.sendKeys(email);
	}
	
	@FindBy(id="lost_password_submit")
	private WebElement lpsubmit;
	public void LastPasswordSubmit() {
		this.lpsubmit.click();
	}
	
}
