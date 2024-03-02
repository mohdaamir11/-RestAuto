package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {

	public Properties prop;
	
	
	public void TestBase() {
		
		try {
		    prop = new Properties();
		    FileInputStream inpfile=new FileInputStream(System.getProperty("/RestAuto/src/main/java/com/qa/config/config.properties"));
		    prop.load(inpfile);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
