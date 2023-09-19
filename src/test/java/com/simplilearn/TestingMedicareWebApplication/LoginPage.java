package com.simplilearn.TestingMedicareWebApplication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	
	
	public void loginpage() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("http://localhost:8080/medicare/home");
		Thread.sleep(2000);
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("username")).sendKeys("sri@example.com");
		driver.findElement(By.id("password")).sendKeys("aha@12345");
		driver.findElement(By.xpath("(//input[@value='Login'])[1]")).click();
		driver.quit();
	}
	

}
