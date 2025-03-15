package stepDefination;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ProductSearchVerified extends Base {
	@And("the customer Searching Product in the search field")
	public void the_customer_searching_product_in_the_search_field() {
		page.locator("//input[@class='search-input']").fill("Magic Pen Set");
		click("//i[@class='ti ti-search']");
	}

	@Then("the customer find the seraching product..")
	public void the_customer_find_the_seraching_product() {
		click("//a[normalize-space()='Magic Pen Set']");
		System.out.println("Product Search Successful");

	}

}
