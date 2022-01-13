package com.cucumber.pages;

import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;



import com.cucumber.base.Testbase;
import com.cucumber.util.Testutil;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class Csvdata extends Testbase
{
	// Provide test data CSV file path.
	String CSV_PATH = "G:\\Excel\\New folder\\Read.csv";
	private CSVReader csvReader;
	String[] csvCell;



	public Csvdata() {
	PageFactory.initElements(driver, this);
	driver.get(prop.getProperty("url2"));
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);

}



	public void dataRead_CSV() throws CsvValidationException, IOException {
	// Create an object of CSVReader
	csvReader = new CSVReader(new FileReader(CSV_PATH));



	// You can use while loop like below,
	// It will executed until the last line in CSV used.
	while ((csvCell = csvReader.readNext()) != null) {
	String TestName = csvCell[0];
	driver.findElement(By.xpath("//*[@id=\'s\']")).sendKeys(TestName);
	driver.findElement(By.xpath("//*[@id=\'searchsubmit\']")).click();



	}



	}
	

}
