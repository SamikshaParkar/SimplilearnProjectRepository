package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	

	@Given("The user launches the application")

	

	public void The_user_launches_the_application()

	{

		System.out.println("Opening The Browser");

	}

	

	@When("Enters the valid UserID and Password")

	public void Enters_the_valid_UserID_and_Password()

	{

		System.out.println("Enter the user id and password");

	}
	@Then("Clicks on Submit button")
	
	public void click_On_Submit()

	{

		System.out.println("click on submit button");

	}

	@Then("Check if the user is in Home Page")
	
	public void verify_Visibility_HomePage()

	{

		System.out.println("user logins correctly");

	}
	@And("Check the Home Page Title")
	public void verify_HomePage_Title()

	{

		System.out.println("Page title is displayed");

	}
}
