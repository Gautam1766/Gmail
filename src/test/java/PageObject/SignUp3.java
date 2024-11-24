package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUp3 {
	
WebDriver Currntdriver;
	
	
	public SignUp3(WebDriver d) 
	{
		Currntdriver=d;
		PageFactory.initElements(Currntdriver, this);
		}

	
	@FindBy(xpath="//select[@id='month']") WebElement select1;
	
	public void month1(String mon) 
	{
		
		Select sc=new Select(select1);
		sc.selectByVisibleText(mon);
	}
	@FindBy (id="day") WebElement d1;
	
	public void Date(String Days) 
	{
		d1.sendKeys(Days);
	}
@FindBy (id="year") WebElement Y1;
	
	public void YR(String Yers) 
	{
		Y1.sendKeys(Yers);
	}
	@FindBy (xpath="//select[@id='gender']") WebElement Select2;
	
	public void Gen(String gen_der) 
	{
		Select2.sendKeys(gen_der);
	}
	@FindBy(xpath="//span[text()='Next']") WebElement N2;
	public void Nx1() 
	{
		N2.click();
	}

}
