package com.cucumber.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.util.Testutil;

public class Testbase 
{
	public static WebDriver driver;
	public static Properties prop;

	public Testbase()
	{
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream("F:\\CUCUMBER_BDD\\BDD_Hackathon2\\src\\main\\java\\com\\cucumber\\base\\config.properties");
			prop.load(ip);
		}

		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public static void initialization()
	{
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "G:\\Driver\\chromedriver.exe");
			driver =new  ChromeDriver();	


		}
		//driver.get(prop.getProperty("url"));
		//driver.get(prop.getProperty("code"));
		//driver.get(prop.getProperty("url3"));

		//driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);

	}

	public void Close() {
		driver.quit();
	}

}


