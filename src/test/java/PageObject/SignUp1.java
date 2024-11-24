package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp1 {
	
public WebDriver LD;
	
	public SignUp1(WebDriver CD) 
	{
		LD=CD;
		PageFactory.initElements(LD, this);
		
	}
	@FindBy(xpath="//span[text()='Create account']") WebElement CA;

	public void CreateA() 
	{
		CA.click();
	}
	@FindBy (xpath="//span[text()='For my personal use']") WebElement PL;
	public void PU() 
	{
		PL.click();
	}
	@FindBy(id="firstName") WebElement FN;
	
	public void First_Name(String  Firstname) 
	{
		FN.sendKeys(Firstname);
	}
	@FindBy(id="lastName") WebElement LN;
	
	public void Last_Name(String  Lastname) 
	{
		LN.sendKeys(Lastname);
	}
	@FindBy(xpath="//span[text()='Next']") WebElement N1;
	
	public void Nx() 
	{
		N1.click();
	}
}
