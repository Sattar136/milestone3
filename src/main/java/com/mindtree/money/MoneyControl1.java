package com.mindtree.money;

//import java.util.List;

//import java.sql.Driver;
//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MoneyControl1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.moneycontrol.com");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.manage().window().fullscreen();
		
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		WebElement element= (WebElement) driver.findElements(By.linkText("Personal Finance"));
		action.moveToElement(element).build().perform();
		
		/*WebDriverWait Wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Income Tax Calculator")));
		WebElement element2=driver.findElement(By.linkText("Income Tax Calculator"));*/
		WebElement element2=driver.findElement(By.linkText("Income Tax calculator"));
		action.moveToElement(element2);
		action.click().build().perform();
		
		
		

	}

}
