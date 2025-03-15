package stepDefination;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CustomerRegistrationVerified extends Base {
	
	@Given("Firstly Cutomer go the website link")
	public void firstly_cutomer_go_the_website_link() {
		page.navigate("https://dailyneed.prodevsltd.xyz");
	}

	@Then("Customer click the sign up button under the table")
	public void customer_click_the_sign_up_button_under_the_table() {
	    click("//a[contains(text(),'সাইন আপ করুন')]");
	}

	@Then("Customer put it her full name")
	public void customer_put_it_her_full_name() {
		page.locator("//input[@id='name']").fill("Hasanuzzaman");
	}

	@Then("Customer put it her personal phone number")
	public void customer_put_it_her_personal_phone_number() {
	    page.locator("//input[@id='phone']").fill("01715731507");
	}

	@Then("Customer put it her valid Email")
	public void customer_put_it_her_valid_email() {
		
		page.locator("//input[@id='email']").fill("hasan746@gmail.com");
	    
	}

	@Then("Customer put it her valid unique Password")
	public void customer_put_it_her_valid_unique_password() {
		page.locator("//input[@id='password']").fill("hasan746@");
	}
	    

	@Then("Customer click the submit button and finished her registration Process")
	public void customer_click_the_submit_button_and_finished_her_registration_process() {
	    click("//button[@class='btn w-100 sign-in-btn']");
	    System.out.println("Customer Succesfully Registration---");
	}
	

}
