package com.comcast.contacttest;

import org.testng.annotations.Test;

public class contactTest {
	
	    @Test(groups="regressiontest")
		public void CreateContact() {
			System.out.println("execute createcontact");
		}
	    @Test
		public void modifycreatecontact() {
			System.out.println("execute createcontactwithMobile");
		}
	    @Test
	  		public void deletecreatecontact() {
	  			System.out.println("execute createcontactwithMobile");
	  		}
	    
	}

