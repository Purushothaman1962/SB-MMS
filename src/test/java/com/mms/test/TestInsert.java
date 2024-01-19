package com.mms.test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestInsert {

	
	@Test
	public void insert() {
		WebDriver driverInsert;
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driverInsert = new ChromeDriver();
		driverInsert.navigate().to("http://localhost:4200/");
		driverInsert.findElement(By.name("id")).sendKeys("701");
		driverInsert.findElement(By.name("name")).sendKeys("Ravanan");
		driverInsert.findElement(By.name("type")).sendKeys("Action");
		driverInsert.findElement(By.name("language")).sendKeys("Tamil");
		driverInsert.findElement(By.name("duration")).sendKeys("3hrs");


		driverInsert.findElement(By.name("insert")).click();
		System.out.println(driverInsert.getTitle());
		
	//	driverInsert.quit();
		
	}
	
	public static void main(String[] args) {

		TestInsert obj = new TestInsert();
		obj.insert();

	}

}




