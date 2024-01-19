package com.mms.test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestDelete {
	
	@Test
	public void delete() {
		WebDriver driverDelete;
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driverDelete = new ChromeDriver();
		driverDelete.navigate().to("http://localhost:4200/");
		driverDelete.findElement(By.name("id")).sendKeys("701");


		driverDelete.findElement(By.name("delete")).click();
		System.out.println(driverDelete.getTitle());
	}
	

	public static void main(String[] args) {

		TestDelete obj = new TestDelete();
		obj.delete();
		
	}

}
