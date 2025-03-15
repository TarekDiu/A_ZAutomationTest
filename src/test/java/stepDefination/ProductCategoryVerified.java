package stepDefination;

import base.Base;
import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;

public class ProductCategoryVerified extends Base{
	
	@And("the customer chose prodect section in Category section")
	public void the_customer_chose_prodect_section_in_category_section() {
	    click("//div[@class='card-body']//a[contains(text(),'ম্যাজিক বুক')]");
	}

	@Then("the customer go the product section and buy the product")
	public void the_customer_go_the_product_section_and_buy_the_product() {
		
		click("//div[@class='row main-product-row']//div[1]//div[1]//div[1]//div[2]//button[1]");
		
		System.out.println("product Search Verified Successfully");
	    
	}
	
	
}
