package com.Game.Game;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop12 {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
		driver.findElement(By.xpath("//span[text()='For my personal use']")).click();
		driver.findElement(By.id("firstName")).sendKeys("Vinay");
		driver.findElement(By.id("lastName")).sendKeys("LKO");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		WebElement e1=driver.findElement(By.xpath(" //select[@id='month']"));
		Select sc=new Select(e1);
		sc.selectByVisibleText("May");
	}

}
