package com.training.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.training.utilities.propertiesreader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basetest {

	protected WebDriver driver;
	static propertiesreader propreader = new propertiesreader();
	String url;

	public WebDriver launchapplication() {

		if (driver == null) {
			try {
				if (propreader.getproperties("browser").equalsIgnoreCase("Chrome")) {
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
				} else if (propreader.getproperties("browser").equalsIgnoreCase("firefox")) {
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				url = propreader.getproperties("url");
				driver.get(url);
			} catch (IOException e) {

				e.printStackTrace();
			}

		}
		return driver;
	}
	
	public void closedriver() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
		driver=null;
	}

}
