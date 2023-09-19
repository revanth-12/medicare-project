package com.simplilearn.TestingMedicareWebApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Registrationpage {

	
	public void navtosinguppage() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://localhost:8080/medicare/");
		Thread.sleep(2500);
		driver.findElement(By.id("signup")).click();
		Thread.sleep(1500);
		driver.findElement(By.id("firstName")).sendKeys("sri");
		driver.findElement(By.id("lastName")).sendKeys("ram");
		driver.findElement(By.id("email")).sendKeys("sriram@example.com");
		driver.findElement(By.id("contactNumber")).sendKeys("+9 4567645755");
		driver.findElement(By.id("password")).sendKeys("aha@12345");
		driver.findElement(By.id("confirmPassword")).sendKeys("aha@12345");
		driver.findElement(By.id("role1")).isSelected();
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(500);
		driver.findElement(By.id("addressLineOne")).sendKeys("120 main st");
		driver.findElement(By.id("addressLineTwo")).sendKeys("4th lane");
		driver.findElement(By.id("city")).sendKeys("marshfield");
		driver.findElement(By.id("postalCode")).sendKeys("54264");
		driver.findElement(By.id("state")).sendKeys("wisconsin");
		driver.findElement(By.id("country")).sendKeys("EU");
		driver.findElement(By.name("_eventId_confirm")).click();
		Thread.sleep(500);
		driver.findElement(By.partialLinkText("Confi")).click();
		driver.quit();
	}

}
