package com.Game.Game;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo111 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/");
		//driver.findElement(By.cssSelector("img[ title=PayPal]")).click();
		
		driver.findElement(By.cssSelector("img.img-responsive")).click();

	}

}
