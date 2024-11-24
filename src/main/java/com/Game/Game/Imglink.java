package com.Game.Game;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Imglink {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.opencart.com/");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//img[@title='OpenCart - Open Source Shopping Cart Solution']")).click();
		driver.findElement(By.xpath("//img[@title='PayPal']")).click();
	}

}
