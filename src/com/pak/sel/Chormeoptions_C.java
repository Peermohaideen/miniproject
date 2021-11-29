package com.pak.sel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chormeoptions_C {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chorme,driver","C:\\Users\\AVITA\\eclipse-workspace\\Selenium\\Driver\\chromedriver1.exe");
		
		ChromeOptions ch= new ChromeOptions();
		
		ch.addArguments("incognito");
		
		WebDriver driver=new ChromeDriver(ch);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("6380084494");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("14-05-1999");
		
		driver.findElement(By.xpath("//button[@value='1']")).click();
	    
		//takescreenshot
		
		Thread.sleep(30000);
		
		TakesScreenshot ts =(TakesScreenshot) driver;  //Narrowing Type Casting
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\AVITA\\eclipse-workspace\\Selenium\\Screenshots\\123.png");
		
		FileUtils.copyFile(source, destination);
		
		
		
		
		
		
	}

}
