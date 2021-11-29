package com.pak.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Te {
	
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\AVITA\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.switchTo().frame("singleframe");
		
		WebElement singleframe = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		
		singleframe.sendKeys("Single Frame");
		
		driver.switchTo().defaultContent();
		
		WebElement multiframe = driver.findElement(By.xpath("(//a[text()='Iframe with in an Iframe']"));
		
		multiframe.click();
		
		WebElement outer_Frame = driver.findElement(By.xpath("(//iframe[@src='MultipleFrames.html']"));
		
	    driver.switchTo().frame(outer_Frame);
	    
	    WebElement inner_frame = driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])[1]"));
	    
	    driver.switchTo().frame(inner_frame);
	    
	    driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("MultipleFrames");
	    
	    driver.switchTo().defaultContent();
	    
	    driver.findElement(By.xpath("//a[text()='Video']")).click();
	}  
}	    
	    
		
		
		
		
		
		

	


