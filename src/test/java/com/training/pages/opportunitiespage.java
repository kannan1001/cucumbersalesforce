package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.basepage;

public class opportunitiespage extends basepage{

	public opportunitiespage(WebDriver driver) {
		super(driver);
		addobject("viewdropdown",By.xpath("//select[@id='fcf']"));
		addobject("NewButton",By.xpath("//input[@name='new']"));
		addobject("OpportunityName",By.id("opp3"));
		addobject("AccountName",By.id("opp4"));
		addobject("closeDate",By.xpath("//input[@id='opp9']"));
		addobject("today",By.xpath("//a[text()='Today']"));
		addobject("stage",By.xpath("//select[@id='opp11']"));
		addobject("probability",By.xpath("//input[@id='opp12']"));
		addobject("LeadSource",By.id("opp6"));
		addobject("PrimaryCampaignSource",By.id("opp17"));
		addobject("saveButton",By.xpath("//input[@name='save']"));
		addobject("anywhereonpage",By.xpath("//html"));
		addobject("opportunitypipeline",By.xpath("//a[text()='Opportunity Pipeline']"));
		addobject("stuckOpportunities",By.xpath("//a[text()='Stuck Opportunities']"));
		addobject("Interval",By.xpath("//select[@name='quarter_q']"));
		addobject("Include",By.xpath("//select[@id='open']"));
		addobject("RunReportButton",By.xpath("//input[@value='Run Report']"));
	}

}
