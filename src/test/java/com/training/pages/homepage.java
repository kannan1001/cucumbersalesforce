package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.basepage;

public class homepage extends basepage {

	public homepage(WebDriver driver) {
		super(driver);
		addobject("usermenubutton",By.id("userNavButton"));
		addobject("My Profile",By.xpath("//a[text()= 'My Profile']"));
		addobject("Logout",By.xpath("//a[text() = 'Logout']"));
		addobject("My Settings",By.xpath("//a[@title='My Settings']"));
		addobject("DeveloperConsole", By.xpath("//a[text()='Developer Console']"));
		addobject("Logout",By.xpath("//a[@title='Logout']"));
		addobject("Accountstab",By.id("Account_Tab"));
		addobject("opportunitiestab",By.xpath("(//a[text()='Opportunities'])[1]"));
		addobject("LeadsTab",By.xpath("//a[text()='Leads']"));
		addobject("contactsTab",By.xpath("(//a[text()='Contacts'])[1]"));
		addobject("FirstLastName",By.xpath("//h1[@class='currentStatusUserName']"));
		addobject("Hometab",By.xpath("//a[@title='Home Tab']"));
		addobject("plusicon",By.xpath("//img[@class='allTabsArrow']"));
		addobject("currentdatelink",By.xpath("//span[@class='pageDescription']//a"));
		addobject("8.00p.mlink",By.xpath("//a[normalize-space()='8:00 PM']"));
		addobject("4.00p.mlink",By.xpath("//a[normalize-space()='4:00 PM']"));

		
		
	}

}
