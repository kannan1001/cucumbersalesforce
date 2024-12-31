package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.basepage;

public class alltabspage extends basepage{

	public alltabspage(WebDriver driver) {
		super(driver);
		addobject("customizemytab",By.xpath("//input[@name='customize']"));
		addobject("selectedtabs",By.xpath("//select[@id='duel_select_1']"));
		addobject("RemoveButton",By.xpath("//img[@class='leftArrowIcon']"));
		addobject("saveButton",By.xpath("//input[@name='save']"));
	}

}
