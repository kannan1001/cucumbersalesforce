package com.training.base;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basepage {

	WebDriver driver;
	HashMap<String,By> objectRepo = new HashMap<String , By>();
	Actions action;
	WebDriverWait wait;
	public basepage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void addobject(String element , By by) {
		objectRepo.put(element, by);
	}
	
	public WebElement getelement(String element) {
		By by  = objectRepo.get(element);
		WebElement webelement = driver.findElement(by);
		return webelement;
	}

	public void enterintotextbox(String elementname ,String value) {
		WebElement webelement = getelement(elementname);
		webelement.sendKeys(value);
	}

	private void waitforelement(WebElement webelement) {
		wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.elementToBeClickable(webelement));
		
	}

	public void waitandenterintotextbox(String elementname, String value) {
		WebElement webelement = getelement(elementname);
		waitforelement(webelement);
		webelement.sendKeys(value);
		
	}

	public void clickonbutton(String elementname) {
		WebElement webelement = getelement(elementname);
		webelement.click();
	}

	public void waitandclickonbutton(String elementname) {
		WebElement webelement = getelement(elementname);
		waitforelement(webelement);
		webelement.click();
		
	}

	public void clickonelement(String elementname) {
		WebElement webelement = getelement(elementname);
		webelement.click();
	}
	
	public void switchtoiFrameusingelement(String elementname) {
		WebElement webelement = getelement(elementname);
		
		driver.switchTo().frame(webelement);
	}

	public void clearandenterintotextbox(String elementname, String value) {
		WebElement webelement = getelement(elementname);
		webelement.clear();
		webelement.sendKeys(value);
		
	}

	public void switchtodefaultpage() {
		driver.switchTo().defaultContent();
		
	}

	public void waitandclickonelement(String elementname) {
		WebElement webelement = getelement(elementname);
		waitforelement(webelement);
		webelement.click();
	}

	public void waitandmovetoelementandclick(String elementname) {
		WebElement webelement = getelement(elementname);
		waitforelement(webelement);
		action =  new Actions(driver);
		action.moveToElement(webelement).click().build().perform();
	}

	public void waitandswitchtoiFrameusingelement(String elementname) {
		WebElement webelement = getelement(elementname);
		waitforelement(webelement);
		driver.switchTo().frame(webelement);
		
	}

	public void cropimage(String elementname) {
		
		WebElement webelement = getelement(elementname);
		action =  new Actions(driver);
		action.clickAndHold(webelement).moveByOffset(274, 274).release().build().perform();
		
		
	}

	public void userselectoption(String elementname, String option) {
		WebElement webelement = getelement(elementname);
		Select select = new Select(webelement);
		select.selectByVisibleText(option);
		
	}

	public void getwindowhandlesandclosethewindow() {
		Set<String> allwindowhandles = driver.getWindowHandles();
		
		Iterator<String> iterator = allwindowhandles.iterator();
		
		String parentWindowhandle = iterator.next();
		String childWindowhandle = iterator.next();
		
		driver.switchTo().window(childWindowhandle);
		System.out.println("Title of page:" + driver.getTitle());
		
		driver.close();
		driver.switchTo().window(parentWindowhandle);
		
	}

	public void dismissesthealert() {
		driver.switchTo().alert().dismiss();
		
	}

	public void acceptthealert() {
		driver.switchTo().alert().accept();
		
	}

	public String getpagetitle() {
		String pagetitle = driver.getTitle();
		return pagetitle;
	}

	public String gettext(String elementname) {
		WebElement webelement = getelement(elementname);
		return webelement.getText();
	}
}
