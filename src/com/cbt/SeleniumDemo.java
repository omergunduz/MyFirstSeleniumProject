package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/omerfarukgunduz/Documents/selenium dependencies/drivers/chromedriver" ); 
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.twitter.com");
		
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://www.instagram.com");
		
		WebDriver driver3 = new ChromeDriver();
		driver3.get("https://www.reddit.com");
		
		WebDriver driver4 = new ChromeDriver();
		driver4.get("https://www.eksisozluk.com");
	}

}