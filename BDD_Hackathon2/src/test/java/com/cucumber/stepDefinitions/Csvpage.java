package com.cucumber.stepDefinitions;

import java.io.IOException;
import java.util.ArrayList;

import com.cucumber.base.Testbase;
import com.cucumber.pages.Csvdata;
import com.cucumber.pages.Logindata;
import com.cucumber.util.Excel;
import com.cucumber.util.ReadExcel;
import com.opencsv.exceptions.CsvValidationException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Csvpage extends Testbase
{
	Testbase base;

@Then("user able to read data from csv file")
public void user_able_to_read_data_from_csv_file() throws CsvValidationException, IOException 
{
	
	//Testbase base = new Testbase();
	base.initialization();
Csvdata read = new Csvdata();

read.dataRead_CSV();
}



}
