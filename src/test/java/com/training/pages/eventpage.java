package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.basepage;

public class eventpage extends basepage{

	public eventpage(WebDriver driver) {
		super(driver);
		addobject("subject",By.id("evt5"));
		addobject("Endtime",By.name("EndDateTime_time"));
		addobject("9.00p.mEndtime",By.xpath("//div[@id='timePickerItem_42']"));
		addobject("7.00p.mEndtime",By.xpath("//div[@id='timePickerItem_38']"));
		addobject("saveButton",By.xpath("//input[@name='save']"));
		addobject("RecurrenceCheckBox",By.xpath("//input[@id='IsRecurrence']"));
		addobject("WeeklyRadioButton",By.xpath("//input[@id='rectypeftw']"));
		addobject("RecurrenceEndDate",By.id("RecurrenceEndDateOnly"));
		addobject("RecurrenceEndDateToday",By.xpath("//a[@class='calToday']"));
		addobject("body",By.tagName("body"));
		addobject("monthviewicon",By.xpath("//img[@class='monthViewIcon']"));
		
	}

}
