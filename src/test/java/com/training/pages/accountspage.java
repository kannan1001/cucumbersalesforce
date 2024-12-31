package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.basepage;

public class accountspage extends basepage{

	public accountspage(WebDriver driver) {
		super(driver);
		addobject("New",By.xpath("//input[@value=' New ']"));
		addobject("AccountName",By.xpath("//input[@id='acc2']"));
		addobject("type",By.xpath("//select[@id='acc6']"));
		addobject("customerpriority",By.xpath("//select[@id='00Naj000006YSck']"));
		addobject("save",By.name("save"));
		addobject("saveandnew",By.xpath("//input[@value='Save & New']"));
		addobject("createnewlink",By.xpath("//a[contains(text(),'Create New View')]"));
		addobject("viewname",By.xpath("//input[@id='fname']"));
		addobject("viewuniquename",By.xpath("//input[@id='devname']"));
		addobject("viewnamedropdown",By.name("fcf"));
		addobject("Editlink",By.xpath("//a[text()='Edit']"));
		addobject("FieldFirstDropDown",By.xpath("//select[@id='fcol1']"));
		addobject("operatorFirstDropDown",By.xpath("//select[@id='fop1']"));
		addobject("valueFirstDropDown",By.xpath("//input[@id='fval1']"));
		addobject("AvailableFields",By.xpath("//select[@id='colselector_select_0']"));
		addobject("Addbutton",By.xpath("(//img[@class='rightArrowIcon'])[1]"));
		addobject("MergeAccounts",By.xpath("//a[text()='Merge Accounts']"));
		addobject("mergeaccounttextbox",By.xpath("//input[@id='srch']"));
		addobject("findAccounts",By.name("srchbutton"));
		addobject("firstcheckbox",By.xpath("//*[@id=\"cid0\"]"));
		addobject("secondcheckbox",By.xpath("//*[@id=\"cid1\"]"));
		addobject("NextButton",By.xpath("//input[@value=' Next ']"));
		addobject("MergeButton",By.xpath("//input[@value=' Merge ']"));
		addobject("Accountswithactivitygreaterthan30",By.xpath("//a[text()='Accounts with last activity > 30 days']"));
		addobject("dateField",By.xpath("//input[@name='dateColumn']"));
		addobject("createdDate",By.xpath("//div[text()='Created Date']"));
		addobject("FromDateicon",By.xpath("//img[@id='ext-gen152']"));
		addobject("todayButtonfromdate",By.xpath("//button[text()='Today']"));
		addobject("toDatetext",By.xpath("//*[@id=\"ext-comp-1045\"]"));
		addobject("toDateicon",By.xpath("//*[@id=\"ext-gen154\"]"));
		addobject("todayButtontodate",By.xpath("(//button[text()='Today'])[2]"));
		addobject("saveButton",By.xpath("//*[@id=\"ext-gen49\"]"));
		addobject("ReportName",By.xpath("//*[@id=\"saveReportDlg_reportNameField\"]"));
		addobject("ReportUniqueName",By.xpath("//*[@id=\"saveReportDlg_DeveloperName\"]"));
		addobject("saveandRunReport",By.xpath("//button[text()='Save and Run Report']"));
	}

}
