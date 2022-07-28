package com.mindtree.milestone3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class milestone3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/");
		System.out.println(driver.getTitle());
		 
	     driver.findElement(By.xpath("//a[@href='/hovers']")).click();
	   
	    System.out.println("name:user1");
	    
	    driver.get("http://the-internet.herokuapp.com/");
	    driver.findElement(By.xpath("//a[@href='/checkboxes']")).click();
	    driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
	    
	    driver.get("http://the-internet.herokuapp.com/");
	    driver.findElement(By.xpath("//a[@href='/inputs']")).click();
	    driver.findElement(By.xpath("//input[@type='number']")).sendKeys("4");
	    
	    driver.get("http://the-internet.herokuapp.com/");
	    driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
	    driver.findElement(By.xpath("//option[@value='2']")).click();
	    
	    driver.get("http://the-internet.herokuapp.com/");
	    driver.findElement(By.xpath("//a[@href='/key presses']")).click();
	    driver.findElement(By.xpath("//input[@id='target']")).sendKeys("WIN");
	    
	    
	    
	    
	    
	    
	    
	    
	    
	   
	    

	}

}
