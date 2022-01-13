package com.cucumber.pages;



import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.base.Testbase;
import com.cucumber.util.Testutil;

public class Logindata extends Testbase
{

	//Page Factory - Object Repository

	@FindBy(xpath="//span[text()='Hello, Sign in']")
	WebElement myAcc;

    @FindBy(xpath="//span[text()='Sign in']")
	WebElement SignInClick;
	
	//@FindBy(xpath="//*[@id=\"nav-link-accountList-nav-line-1\"]")
	//WebElement AccountBtn;

	//@FindBy(xpath="//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")
	//WebElement email;

	@FindBy(xpath="//input[@name='email']")
	WebElement email;
   // WebElement email=driver.findElement(By.cssSelector("#ap_email"));

	@FindBy(xpath="//input[@id='ap_password']")
	WebElement Password;

	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement signInBtn;

	@FindBy(xpath="//input[@id='continue']")
	WebElement continueBtn;


	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchbar;

	@FindBy(xpath="//i[@class='hm-icon nav-sprite']")
	WebElement All;

	@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[30]/a")
	WebElement signout;

	@FindBy(xpath="//*[@id=\'adSkin\']/a")
	WebElement verify;



	//Parameterised Constructor

	public Logindata() 
	{
		PageFactory.initElements(driver, this);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);

	}

	
	  public void SignUpClick() { // SignIn Click Action
	  
	  //Mouseover action 
		  Actions act = new Actions(driver);
	  act.moveToElement(myAcc).build().perform();
	  
	  SignInClick.click();
	  
	  }
	 
	
	//public void SignUpClick()
	//{
		//AccountBtn.click();
	//}

	/*
	 * public void login() { email.clear(); email.sendKeys("tryyuu");
	 * Password.sendKeys("hfhfghgh"); }
	 */


	public void loginDetails(String uname , String upass) 
	{
		//Thread.sleep(2000);
		email.clear();
	email.click();
		email.sendKeys("uname");

		continueBtn.click(); 
		//Thread.sleep(2000); 
		Password.click();
		Password.sendKeys(upass); 
	}


	public void clickSignInBtn() 
	{ 
		//loginbutton click action

		signInBtn.click();

	}

	public void mouseOverBabiesAndKidsAndChooseRemoteControlToys()
	{

		// Baby & Toddler Toys
		searchbar.sendKeys("Baby Toys For Boys");
		searchbar.sendKeys(Keys.ENTER);
		boolean search = verify.isDisplayed();
		Assert.assertTrue(search);
		System.out.println("product page  is Verified");

	}



	//	public void Logout()
	//{
	//All.click();
	//signout.click();
	//}



}
