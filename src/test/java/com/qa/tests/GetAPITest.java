package com.qa.tests;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.client.RestClient;

public class GetAPITest extends TestBase {

	 
	String serviceUrl;
	String apiUrl;
	String url;
	TestBase testbase = new TestBase();
	
	@BeforeTest
	public void setup() {
	testbase = new TestBase();
    String serviceUrl = prop.getProperty("URL");
    String apiUrl = prop.getProperty("serviceURL");
    
    String url = serviceUrl+apiUrl; 
    
   
	}
	
	@Test
	public void getTest() throws ClientProtocolException, IOException {
		 RestClient restclt = new RestClient();
		    restclt.get(url);

	}
			
}
