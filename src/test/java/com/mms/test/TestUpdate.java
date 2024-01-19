package com.mms.test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestUpdate {
	
	@Test
	public void update() {
		WebDriver driverUpdate;
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driverUpdate = new ChromeDriver();
		driverUpdate.navigate().to("http://localhost:4200/");
		driverUpdate.findElement(By.name("id")).sendKeys("901");
		driverUpdate.findElement(By.name("name")).sendKeys("Ravanan");
		driverUpdate.findElement(By.name("type")).sendKeys("Action");
		driverUpdate.findElement(By.name("language")).sendKeys("Tamil");
		driverUpdate.findElement(By.name("duration")).sendKeys("3hrs");


		driverUpdate.findElement(By.name("update")).click();
		System.out.println(driverUpdate.getTitle());
		
	//	driverUpdate.quit();
	}
	
	public static void main(String[] args) {

		TestUpdate obj = new TestUpdate();
		obj.update();
		
	}

}
