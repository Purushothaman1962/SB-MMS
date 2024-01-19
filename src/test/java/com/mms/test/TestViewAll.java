package com.mms.test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestViewAll {
	
	@Test
	public void viewAll() {
		WebDriver driverViewAll;
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driverViewAll = new ChromeDriver();
		driverViewAll.navigate().to("http://localhost:4200/");
		
		driverViewAll.findElement(By.name("next")).click();
		System.out.println(driverViewAll.getTitle());
	}
	

	public static void main(String[] args) {

		TestViewAll obj = new TestViewAll();
		obj.viewAll();
		
	}
	
}
