package com.pak.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Action {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\AVITA\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("http://automationpractice.com/index.php?");
        
        WebElement Dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
        
        Actions ac = new Actions(driver);
        
        ac.moveToElement(Dresses).build().perform();
        
        WebElement Summer_Dresses = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a"));
        
        ac.click(Summer_Dresses).build().perform();
        
        
	}       

}
