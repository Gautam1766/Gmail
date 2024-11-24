package PageObject;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Num_OTP {

	
	WebDriver Mdriver;
	
	public Num_OTP(WebDriver dd) 
	{
		Mdriver=dd;
		PageFactory.initElements(Mdriver, this);
	}
	
	@FindBy(id="phoneNumberId") WebElement VM;
	
	public void verify_Moblie(String moblie_num)
	
	{
		Scanner sc=new Scanner(System.in);
		VM.sendKeys(moblie_num);
	}
	@FindBy (xpath="//span[text()='Next']") WebElement N5;
	
	public void Nx5() 
	{
		N5.click();
	}
}
