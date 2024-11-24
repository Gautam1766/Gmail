package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SUpage2 {
	
public WebDriver ldriver;
	
	public SUpage2(WebDriver dc) 
	{
		ldriver=dc;
		PageFactory.initElements(ldriver, this);
	}
	
	
@FindBy(xpath="//input[@aria-label='Username']") WebElement UN;

//@FindBy(name ="Username") WebElement UN;
	
	public void usern(String user_name) 
	{
		UN.sendKeys(user_name);
	}
	@FindBy(xpath="//span[text()='Next']") WebElement N3;
	
	public void Nx3() 
	{
		N3.click();
	}

	

}
