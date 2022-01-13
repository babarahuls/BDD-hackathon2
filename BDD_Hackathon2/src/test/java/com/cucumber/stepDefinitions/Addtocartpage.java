package com.cucumber.stepDefinitions;

import java.util.ArrayList;

import com.cucumber.base.Testbase;
import com.cucumber.pages.Addtocartdata;
import com.cucumber.pages.Logindata;
import com.cucumber.util.ReadExcel;

import io.cucumber.java.en.Then;

public class Addtocartpage 
{
	
	Logindata ld;
	Testbase base;
	Addtocartdata acd;
	ReadExcel rd;
	
	
	@Then("^Select any toy and click on add to cart$")
	public void select_any_toy_and_click_on_add_to_cart() throws Throwable
	{
		//Browser launch
		// base = new Testbase();
		    base.initialization();
		    ld=new Logindata();
		    rd=new ReadExcel();
		    
		    //Login
		    ld.SignUpClick();
				ArrayList<String> testdata=rd.getData("user1");
				ld.loginDetails(testdata.get(1), testdata.get(2));
		   // ld.login();
				ld.clickSignInBtn();
				
				//Add product to cart
				ld.mouseOverBabiesAndKidsAndChooseRemoteControlToys();
			
				acd= new Addtocartdata();
				acd.addItemToCart();
		   // base.Close();
	
	}

}
