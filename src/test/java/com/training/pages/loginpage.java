package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.basepage;

public class loginpage extends basepage{

	WebDriver driver;
	public loginpage(WebDriver driver) {
		super(driver);
		addobject("username",By.id("username"));
		addobject("password",By.id("password"));
		addobject("Login",By.id("Login"));
		addobject("RememberMeCheckbox",By.id("rememberUn"));
		addobject("forgotpassword",By.xpath("//a[contains(text(),'Forgot Your Password?')]"));
	}
	
	

}
