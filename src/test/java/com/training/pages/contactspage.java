package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.basepage;

public class contactspage extends basepage{

	public contactspage(WebDriver driver) {
		super(driver);
		addobject("NewButton",By.xpath("//input[@name='new']"));
		addobject("LastName",By.xpath("//input[@name='name_lastcon2']"));
		addobject("AccountName",By.xpath("//input[@name='con4']"));
		addobject("saveButton",By.xpath("//input[@name='save']"));
		addobject("createnewview",By.xpath("//a[text()='Create New View']"));
		addobject("viewname",By.xpath("//input[@id='fname']"));
		addobject("viewuniquename",By.xpath("//input[@id='devname']"));
		addobject("RecentlyCreatedDropdown",By.xpath("//select[@id='hotlist_mode']"));
		addobject("contactdropdown",By.xpath("//select[@name='fcf']"));
		addobject("firstcontact",By.xpath("//*[@id=\"bodyCell\"]/div[3]/div[1]/div/div[2]/table/tbody/tr[2]/th/a"));
		addobject("cancelButton",By.xpath("//input[@name='cancel']"));
		addobject("saveandNewButton",By.xpath("//input[@name='save_new']"));
	}

}
