package com.comcast.contacttest;

import org.testng.annotations.Test;

public class CreateContactTest {
    @Test(groups="smoketest")
	public void CreateContact() {
    	String URL = System.getProperty("url");
    	String BROWSER = System.getProperty("browser");
		System.out.println("execute createcontact");
		
		System.out.println("URL======>"+URL);
		System.out.println("BROWSER======>"+BROWSER);
	}
    @Test
	public void CreateContactwithMobile() {
		System.out.println("execute createcontactwithMobile");
	}
}
