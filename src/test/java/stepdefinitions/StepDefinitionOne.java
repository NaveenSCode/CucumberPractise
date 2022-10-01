package stepdefinitions;

import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefinitionOne {

	@Given("^User is on Netbanking landing page$")
	public void user_is_on_Netbanking_landing_page() {
		System.out.println(" inside @Given");
	}
	
	@When("^User log in to application with username and password$")
	public void user_log_in_to_application_with_username_and_password() {
		System.out.println(" inside @When");
	}
	
	@Then("^Home page is populated$")
	public void home_page_is_populated() {
		System.out.println(" inside @Then");
	}
	
	@And("^Cards are displayed$")
	public void cards_are_displayed() {
		System.out.println(" inside @And");
	}
}
