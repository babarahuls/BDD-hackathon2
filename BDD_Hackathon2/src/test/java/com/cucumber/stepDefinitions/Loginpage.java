package com.cucumber.stepDefinitions;

import java.io.IOException;
import java.util.ArrayList;

import com.cucumber.base.Testbase;
import com.cucumber.pages.Logindata;
import com.cucumber.util.ReadExcel;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginpage 
{
	Logindata ld;
	Testbase base;
	ReadExcel rd;
	
		@Given("Launch the url")
	public void launch_the_url() 
		{
			//Testbase base = new Testbase();
			base.initialization();
	}

	@When("User clicks on SignIn")
	public void user_clicks_on_SignIn() {
	  ld=new Logindata();
	  ld.SignUpClick();
	}

	@Then("user enter username and password")
	public void user_enter_username_and_password() throws IOException, InterruptedException 
	{
		ld=new Logindata();
		rd = new ReadExcel();
		//ld.login();
	    // Thread.sleep(3000);
		ArrayList<String> testdata=rd.getData("user1");
		ld.loginDetails(testdata.get(1), testdata.get(2));
		//base.Close();
	}

	@When("user click on Login")
	public void user_click_on_Login() {
		ld=new Logindata();
		ld.clickSignInBtn();
	}

	@And("Mouse over on Babies and kids and click on Remote-control toys")
	public void mouse_over_on_Babies_and_kids_and_click_on_Remote_control_toys() {
		ld=new Logindata();
		ld.mouseOverBabiesAndKidsAndChooseRemoteControlToys();
		base.Close();
		
		//ld.Logout();
	}


}
