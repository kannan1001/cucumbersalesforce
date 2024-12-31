package com.training.steps;

import java.lang.reflect.Constructor;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.training.base.basepage;
import com.training.base.basetest;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class step extends basetest{
	
	basepage page;
	Class<?> classname;
	Constructor<?> constructor;
	private String capturespagetitle;
	private String elementtext;
	SoftAssert softAssert = new SoftAssert();
	
	@Given("User launches the application")
	public void user_launches_the_application() {
	    driver = launchapplication();
	}
	
	
	@Given("User is on {string}")
	//create new Instance for page
	public void user_is_on(String pagename) {
		String packagename = "com.training.pages";
		String fullpagepath = packagename+"."+pagename;
	   try {
		classname = Class.forName(fullpagepath);
		constructor = classname.getDeclaredConstructor(WebDriver.class);
		page = (basepage) constructor.newInstance(driver);
		
	//	page = (basepage) Class.forName(fullpagepath).getDeclaredConstructor(WebDriver.class).newInstance(driver);
	   }
	catch (Exception e) {
		
		e.printStackTrace();
	}
		
	}
	@Then("User Waits and enters the text in textbox {string} {string}")
	public void user_waits_and_enters_the_text_in_textbox(String elementname, String value) {
	   page.waitandenterintotextbox(elementname,value);
	}
	@Then("User enters the text in textbox {string} {string}")
	public void user_enters_the_text_in_textbox(String elementname, String value) {
	   page.enterintotextbox(elementname, value);
	}
	@Then("User clicks on Button {string}")
	public void user_clicks_on_button(String elementname) {
	    page.clickonbutton(elementname);
	}
	
	@Then("User waits and clicks on Button {string}")
	public void user_waits_and_clicks_on_button(String elementname) throws InterruptedException {
		Thread.sleep(3000);
	    page.waitandclickonbutton(elementname);
	}
	@Then("User clicks on {string}")
	public void user_clicks_on(String elementname) {
	    page.clickonelement(elementname);
	}

	
	@Then("User switches to iFrame {string}")
	public void user_switches_to_i_frame(String elementname ) {
		page.switchtoiFrameusingelement(elementname);
	}

	
	@Then("User clears and enters the text in textbox {string} {string}")
	public void user_clears_and_enters_the_text_in_textbox(String elementname, String value) {
	    page.clearandenterintotextbox(elementname,value);
	}
	@Then("User is on defaultpage")
	public void user_is_on_defaultpage() {
	   page.switchtodefaultpage();
	}
	
	@Then("User waits and clicks on {string}")
	public void user_waits_and_clicks_on(String elementname) {
	    page.waitandclickonelement(elementname);
	}

	@Then("User clicks on and sends file location {string} {string}")
	public void user_clicks_on_and_sends_file_location(String elementname, String value) {
		page.enterintotextbox(elementname, value);
	}

	@Then("User moves to and clicks on {string}")
	public void user_moves_to_and_clicks_on(String elementname) {
	    page.waitandmovetoelementandclick(elementname);
	}

	@Then("User waits and switches to iFrame {string}")
	public void user_waits_and_switches_to_i_frame(String elementname) {
	    page.waitandswitchtoiFrameusingelement(elementname);
	}
	

	@Then("User crops the image {string}")
	public void user_crops_the_image(String elementname) throws InterruptedException {
		Thread.sleep(3000);
	    page.cropimage(elementname);
	}

	@Then("User selects {string} {string}")
	public void user_selects(String elementname, String option) {
	   page.userselectoption(elementname,option);
	}


	@Then("User switches between windows")
	public void user_switches_between_windows() {
	   page.getwindowhandlesandclosethewindow();
	}
	
	@Then("User waits")
	public void user_waits() throws InterruptedException {
	    Thread.sleep(3000);
	}
	
	@Then("User accepts the alert")
	public void user_accepts_the_alert() {
	    page.acceptthealert();
	}

	@Then("User gets page title")
	public void user_gets_page_title() {
		capturespagetitle = page.getpagetitle();
	 
	}
	
	@Then("User verifies whether this page title and previous page title are same")
	public void user_verifies_whether_this_page_title_and_previous_page_title_are_same() {
		String currentpagetitle = page.getpagetitle();
		System.out.println("First page title: " + capturespagetitle );
		System.out.println("Second page title: "+currentpagetitle);
	    Assert.assertEquals(capturespagetitle, currentpagetitle);
	    
	}
	
	@Then("User gets text from {string}")
	public void user_gets_text_from(String elementname) {
		elementtext = page.gettext(elementname);
	}
	@Then("User verifies whether this text and previous text are same {string}")
	public void user_verifies_whether_this_text_and_previous_text_are_same(String currentelementname) {
		String currentelementtext = page.gettext(currentelementname);
	 // Assert.assertEquals(currentelementtext,elementtext);
	    softAssert.assertEquals(currentelementtext, elementtext,"Both text are not same");
	}






	@Then("User closes the browser")
	public void user_closes_the_browser() throws InterruptedException {
	    closedriver();
	}


}
