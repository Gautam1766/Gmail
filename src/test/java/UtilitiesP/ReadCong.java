package UtilitiesP;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadCong {
	
	Properties p;
	String path="C:\\Users\\pc\\eclipse-workspace\\Game\\Configuration\\Config.properties";
	FileInputStream fn;
	public ReadCong() 
	{
		p=new Properties();
		
		try {
			fn = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			p.load(fn);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public String getUrl() 
		{
			String s1=p.getProperty("url");
			if(s1!=null) 
			{
				return s1;
			}
			else 
			{
				throw new RuntimeException("Url is not Found");
			}
		}
		public String getBro() 
		{
			String s1=p.getProperty("browser");
			if(s1!=null) 
			{
				return s1;
			}
			else 
			{
				throw new RuntimeException("Browser is not Found");
			}
		}
	
}
