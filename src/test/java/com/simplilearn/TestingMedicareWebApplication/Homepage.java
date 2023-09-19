package com.simplilearn.TestingMedicareWebApplication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Homepage {
	
	
	public void homepage() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("http://localhost:8080/medicare/home");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Antipyretics")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]")).getText());
		driver.quit();
		
		
	}
	
	
	
}

