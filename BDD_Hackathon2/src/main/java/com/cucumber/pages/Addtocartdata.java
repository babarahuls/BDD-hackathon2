package com.cucumber.pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cucumber.base.Testbase;

public class Addtocartdata extends Testbase
{
	//@FindBy(xpath="//span[text()='Einstein Box Gift Set for Babies, Newborns and Infants of Age 1-3-6-9-12 Months | High Contrast Gift Set with Set of Rattles+ High Contrast Books+ High Contrast Flashcards| for Baby Boys & Girls']")
	//WebElement selectToy;
	
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/span/a/div/img")
	WebElement selectToy;

	@FindBy(xpath="//button[@type='button']")
	WebElement mouseOverOnItem;

	//@FindBy(xpath="//input[@name='submit.add-to-cart']")
	//WebElement addToCart;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement addToCart;

	@FindBy(xpath="//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']")
	WebElement successMsg;
	
	public Addtocartdata() 
	{
	PageFactory.initElements(driver, this);
	}
	
	public void addItemToCart() { //addTocart action
		selectToy.click();

		String winHandleBefore = driver.getWindowHandle();

		// Perform the click operation that opens new window

		// Switch to new window opened
		for(String winHandle : driver.getWindowHandles()){
		driver.switchTo().window(winHandle);
		}
		addToCart.click();

		//Assert.assertTrue(successMsg.isDisplayed());
		Assert.assertTrue(successMsg.isDisplayed());
		System.out.println(successMsg.isDisplayed());


		}
		
}
