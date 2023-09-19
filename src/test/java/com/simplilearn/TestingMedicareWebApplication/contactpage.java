package com.simplilearn.TestingMedicareWebApplication;



import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class contactpage {
	
	public void contacts() throws InterruptedException {

	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("http://localhost:8080/medicare/");
	Thread.sleep(2500);
	driver.findElement(By.linkText("Contact")).click();
	System.out.println(driver.findElement(By.xpath("(//p[normalize-space()='This is an contact us page'])[1]")).getText());
	driver.quit();
	}
	
}

