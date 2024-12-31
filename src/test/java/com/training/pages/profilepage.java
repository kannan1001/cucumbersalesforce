package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.basepage;

public class profilepage extends basepage{

	public profilepage(WebDriver driver) {
		super(driver);
		addobject("editprofilebutton",By.xpath("//img[@title = 'Edit Profile']"));
		addobject("contactiframe",By.id("contactInfoContentId"));
		addobject("abouttab",By.xpath("//a[contains(text(),'About')]"));
		addobject("lastName",By.id("lastName"));
		addobject("saveAll",By.xpath("//input[@value = 'Save All']"));
		addobject("post",By.xpath("//span[text()='Post']"));
		addobject("postiFrame",By.xpath("//iframe[@title='Rich Text Editor, publisherRichTextEditor']"));
		addobject("posttextbox",By.xpath("//body[@role='textbox']"));
		addobject("share",By.id("publishersharebutton"));
		addobject("FileLink",By.xpath("//span[text()='File']"));
		addobject("uploadFromComputer",By.id("chatterUploadFileAction"));
		addobject("chooseFile",By.xpath("//input[@id='chatterFile']"));
		addobject("update",By.xpath("//a[text()='Update']"));
		addobject("uploadPhotoiFrame",By.xpath("//iFrame[@id='uploadPhotoContentId']"));
		addobject("choosefileforphoto",By.xpath("//input[@class='fileInput']"));
		addobject("save",By.xpath("//input[@id='j_id0:uploadFileForm:uploadBtn']"));
		addobject("img_crop",By.xpath("//div[@class='imgCrop_dragArea']"));
		addobject("cropsavebutton",By.xpath("//input[@class = 'btn saveButton']"));
		addobject("usernameintopleft",By.xpath("//span[@id='tailBreadcrumbNode']"));
	}

}
