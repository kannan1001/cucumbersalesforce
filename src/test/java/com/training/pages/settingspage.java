package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.basepage;

public class settingspage extends basepage{

	public settingspage(WebDriver driver) {
		super(driver);
		addobject("Personallink",By.id("PersonalInfo_font"));
		addobject("LoginHistory",By.id("LoginHistory_font"));
		addobject("DownloadHistory",By.xpath("//a[@href='/servlet/servlet.LoginHistory?id=005aj000009q1sT']"));
		addobject("DisplayAndLayout",By.id("DisplayAndLayout_font"));
		addobject("CustomizeMyTabs",By.id("CustomizeTabs_font"));
		addobject("CustomAppDropDown",By.xpath("//select[@id='p4']"));
		addobject("AvailableTabs",By.id("duel_select_0"));
		addobject("Add",By.xpath("//img[@alt='Add']"));
		addobject("save",By.name("save"));
		addobject("Email",By.id("EmailSetup_font"));
		addobject("MyEmailSettings",By.id("EmailSettings_font"));
		addobject("EmailName",By.name("sender_name"));
		addobject("EmailAddress",By.id("sender_email"));
		addobject("AutomaticBCCYes",By.xpath("//input[@id=\"auto_bcc1\"]"));
		addobject("CalendarandReminders",By.id("CalendarAndReminders_font"));
		addobject("ActivityReminders",By.id("Reminders_font"));
		addobject("openatestreminder",By.id("testbtn"));
		
	}

}
