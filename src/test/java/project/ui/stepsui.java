package project.ui;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepsui {
	
	@Given("^launch the url$")
	public void launch_the_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		uiclass PK = new uiclass();
		
		PK.Testing();

	}

	@When("^search item value$")
	public void search_item_value() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hello world2");

	}

	@Then("^search result should be displayed$")
	public void search_result_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hello world3");
	    
	}




	

}
