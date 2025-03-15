package stepDefination;

import static org.testng.Assert.assertEquals;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HeaderSectionVerified extends Base {
	
	@Given("Firstly I Checked Hotline Information")
	public void firstly_i_checked_hotline_information() {
		String myactualval= "01648811536";
		String myexpextedtualval="01648811536";
		assertEquals(myactualval,myexpextedtualval);
		
	}

	@Then("Secoundly I check Email Information")
	public void secoundly_i_check_email_information() {
		
		String myactual= "info@dailyneedbd.com";
		String myexpextedtual="info@dailyneedbd.com";
		assertEquals(myactual,myexpextedtual);
		System.out.println("Header Section verified");

	    
	}

}
