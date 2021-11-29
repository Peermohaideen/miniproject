package com.pak.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_handling {
     
	public static void main(String[] args) throws AWTException {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\AVITA\\eclipse-workspace\\Selenium\\Driver\\chromedriver1.exe");
        
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://www.amazon.in/");
        
        WebElement Amazon_Pay = driver.findElement(By.xpath("//a[text()='Amazon Pay']"));
        
        Actions ac =new Actions(driver);
        
        ac.moveToElement(Amazon_Pay).build().perform();
        
        ac.contextClick(Amazon_Pay).build().perform();
        
        Robot r = new Robot();
        
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        
        WebElement Mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
        
        ac.contextClick(Mobiles).build().perform();
        
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        
        WebElement Best_Sellers = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
        ac.contextClick(Best_Sellers).build().perform();
        
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        
        WebElement Electronics = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
        ac.contextClick(Electronics).build().perform();
        
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        
        Set<String> all_window_Id = driver.getWindowHandles();
        
        for(String id: all_window_Id) {
        	
        	String title = driver.switchTo().window(id).getTitle();
        	
        	System.out.println(title);
        }
        
        String actual_Title="Amazon.in Bestsellers: The most popular items on Amazon";
        
        for(String id: all_window_Id) {
        	
        	if (driver.switchTo().window(id).getTitle().equals(actual_Title)) {
        		
        		continue;
        		
        	}
        	
        	else {
        		
        		driver.close();
        	}
        	}
         }
       }       

