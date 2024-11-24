package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Pass12 {
	
	WebDriver CCdriver;
	
	public Create_Pass12(WebDriver ld) 
	{
		CCdriver=ld;
		PageFactory.initElements(CCdriver, this);
	}
	@FindBy(xpath="//input[@aria-label='Password']") WebElement p1;
	
	public void create_pass12(String passw) 
	{
		p1.sendKeys(passw);
	}
    @FindBy(xpath="//input[@aria-label='Confirm']") WebElement p2;

    public void confirm_pass(String PassWord) 
    {
	p2.sendKeys(PassWord);
    }
    @FindBy(xpath="//input[@aria-labelledby='selectionc3']") WebElement chek;

    public void checkbox() 
    {
	chek.click();
    }
    @FindBy(xpath="//span[text()='Next']") WebElement N4;

    public void Nx4() 
    {
	N4.click();
    }

}
