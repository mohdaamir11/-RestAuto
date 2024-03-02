package com.qa.client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient  {

	
	//1. GET method
	public void get(String url) throws ClientProtocolException, IOException {
	
	CloseableHttpClient httpclient=	HttpClients.createDefault();
	HttpGet httpget = new HttpGet(url); // http get request

	CloseableHttpResponse httpres = httpclient.execute(httpget);  // hit the GET URL
	
	// a. STATUS CODE
    int statuscode =	httpres.getStatusLine().getStatusCode();
    System.out.println("status code is === " + statuscode);
     
    String responseString = EntityUtils.toString(httpres.getEntity(),"UTF-8");
     
    // b. JSON STRING
    JSONObject responsejsonobj = new JSONObject(responseString);
    System.out.println("response Json from API " + responsejsonobj);
    
    
    //c. ALL headers we are getting
   Header[] headersArray = httpres.getAllHeaders();
   HashMap<String, String> allheaders = new HashMap<String,String>();
   for(Header header: headersArray)
   {
	   allheaders.put(header.getName(), header.getValue());
   }
   System.out.println("headers array ==>" + allheaders);
   
	}
}
