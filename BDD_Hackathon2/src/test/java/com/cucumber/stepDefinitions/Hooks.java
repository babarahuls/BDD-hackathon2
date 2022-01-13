package com.cucumber.stepDefinitions;


import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.cucumber.base.Testbase;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;

public class Hooks extends Testbase
{
	@After
	public void tear_Down(Scenario scenario) {
	try {
	//Screenshot taken for failed scenarios
	if (scenario.isFailed()) {
	File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	File dest = new File(" screenshots/Failed Scenarios/" + scenario.getName() + ".png");
	FileUtils.copyFile(scr, dest); System.out.println("Screenshot taken for failed scenario");
	}
	else{
	//Screenshot taken for passed scenarios
	File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); File
	dest = new File(" screenshots/Passed Scenarios/" + scenario.getName() + ".png");
	FileUtils.copyFile(scr, dest); System.out.println("Screenshot taken for passed scenario");
	}
	} catch (Exception e) {



	e.printStackTrace();
	}
	driver.quit();

	}

}
