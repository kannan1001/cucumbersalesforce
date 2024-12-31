package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.basepage;

public class forgotpasswordpage extends basepage{

	public forgotpasswordpage(WebDriver driver) {
		super(driver);
		addobject("username",By.id("un"));
		addobject("continue",By.id("continue"));
	
	}

}
