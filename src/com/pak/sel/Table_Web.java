package com.pak.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Web {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\AVITA\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("http://www.leafground.com/pages/table.html");
        
        System.out.println("-------------Header Datas----------------------");
        
        List<WebElement> header_Data = driver.findElements(By.xpath("//table/tbody/tr/th"));
        
        for(WebElement header : header_Data) {
        	
            String text = header.getText();	
            
            System.out.println(text);
        }
        
        System.out.println("---------------All Datas-------------------");
        
        List<WebElement> all_data = driver.findElements(By.xpath("//table/tbody/tr/td"));
        
        for(WebElement WebElement : all_data) {
        	
        	String text = WebElement.getText();
        	
        	System.out.println(text);
        }
        
        System.out.println("---------------Row Datas-------------------");
        
        List<WebElement> row_Data = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
        
        for(WebElement row : row_Data) {
        	
        	String text = row.getText();
        	
        	System.out.println(text);
        	
        }
        
        System.out.println("---------------Column Datas------------------");
        
        List<WebElement> column_Data = driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
        
        for(WebElement column : column_Data) {
        	
        	String text = column.getText();
        	
        	System.out.println(text);
        }
        
        System.out.println("-------------Particular Data------------------");
        
        WebElement particular = driver.findElement(By.xpath("//table/tbody/tr[5]/td[6]"));
        
        System.out.println(particular.getText());
    }
}
