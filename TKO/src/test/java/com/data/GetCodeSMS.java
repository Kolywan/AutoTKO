package com.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.main.appmanager.ApplicationManager;

public class GetCodeSMS {
	public static ApplicationManager app;
	
	public GetCodeSMS() {
		app = new ApplicationManager();
	}

	private String result;



	
public String smsCode() {

	Random random = new Random();
	int n = random.nextInt(9999999) + 5000000; 
	
String phone 	= "996" + n;

String phone6	=	 phone.substring(0, 6);
	
	// System.out.println(phone6); 

				try {

			        URL url = new URL("https://rgs-uremont-api.uremont.dev/customer/profile/force-registration/");
			        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			        conn.setDoOutput(true);
			        conn.setRequestMethod("POST");
			        conn.setRequestProperty("Content-Type", "application/json");
			        String input = "{\"phone\": \""+phone+"\", \"name\": \""+phone6+"*****\"}";
			        
			     //    System.out.println(input); 
			        OutputStream os = conn.getOutputStream();
			        os.write(input.getBytes());
			        os.flush();  
			        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
			        String output;
			      //  System.out.println("Output from Server .... \n");
			        
			       while ((output = br.readLine()) != null) {
			    	   result=output;
			           // System.out.println(output);
			        }
			        
			     // System.out.println(result);
			        conn.disconnect();		        
			        JsonObject jsonObject = new JsonParser().parse(result).getAsJsonObject();
        result=jsonObject.get("code").getAsString();
			   	       	System.out.println(result);

			      } catch (MalformedURLException e) {

			        e.printStackTrace();

			      } catch (IOException e) {

			        e.printStackTrace();

			     }
				
				return result;
			
	 }
	
	

}
