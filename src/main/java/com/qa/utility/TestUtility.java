package com.qa.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.beust.jcommander.converters.FileConverter;
import com.qa.testbase.TestBase;

public class TestUtility extends TestBase {

	public static long pageloadTime = 60;
	public static long implicitTime = 60;


	public void swithToframe() {

		driver.switchTo().frame("mainpanel");
	}

}
