package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.basepage;

public class leadspage extends basepage{

	public leadspage(WebDriver driver) {
		super(driver);
		addobject("view",By.xpath("//select[@id='fcf']"));
		addobject("NewButton",By.xpath("//input[@name='new']"));
		addobject("Gobutton",By.xpath("(//input[@name='go'])[1]"));
		addobject("lastName",By.xpath("//input[@id='name_lastlea2']"));
		addobject("companyName",By.xpath("//input[@name='lea3']"));
		addobject("saveButton",By.xpath("//input[@name='save']"));
	}

}
