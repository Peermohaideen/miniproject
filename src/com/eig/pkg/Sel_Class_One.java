package com.eig.pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_Class_One {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AVITA\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		
		email.sendKeys("6380084494");
		
		WebElement pass = driver.findElement(By.name("pass"));
		
		pass.sendKeys("1999");
		
		//pass.clear();
		
		boolean dis = email.isDisplayed();
		
		System.out.println("Is Displaced or not: " +dis);      //Concordination
		
		boolean en = email.isEnabled();
		
		System.out.println("Is Enabled or not:" +en);
		
		boolean sel = email.isSelected();
		
		System.out.println("Is Selected or not:" +sel);
		
		driver.findElement(By.name("login")).click();
		
		
		
		
		
	}

}
