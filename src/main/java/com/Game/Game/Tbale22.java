package com.Game.Game;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tbale22 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/pc/Desktop/Table2.html");
		
		WebElement e1=driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]"));
		System.out.println(e1.getText());

	}

}
