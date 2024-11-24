package TestCaseFile;

import org.testng.annotations.Test;


import PageObject.Create_Pass12;
import PageObject.Num_OTP;
import PageObject.SUpage2;
import PageObject.SignUp1;
import PageObject.SignUp3;

public class Testcls extends BaseCls {
	
	@Test
public	void OpenBrowser() 
	{
		driver.get(url2);
		SignUp1 sg=new SignUp1(driver);
		sg.CreateA();
		sg.PU();
		sg.First_Name("John");
		sg.Last_Name("Willson");
		sg.Nx();
	}
	 @Test
public	void test2() 
		{	

		SignUp3 l1=new SignUp3(driver);
		l1.month1("May");
		l1.Date("12");
		l1.YR("2000");
		l1.Gen("Male");
		l1.Nx1();
		SUpage2 sg1=new SUpage2(driver);
		sg1.usern("Will302878982");
		sg1.Nx3();
		
	}
	@Test
	void test3()  
	{    
		Create_Pass12 cp1=new Create_Pass12(driver);
		cp1.create_pass12("Jhon@1234");
		cp1.confirm_pass("Jhon@1234");
		cp1.checkbox();
		cp1.Nx4();
		Num_OTP m1=new Num_OTP(driver);
		m1.verify_Moblie("9026566656");
		m1.Nx5();
	}
//	void test4() 
//	{
//		Num_OTP m1=new Num_OTP(driver);
//		m1.verify_Moblie("9026566656");
//		m1.Nx5();
//	}
	

}


