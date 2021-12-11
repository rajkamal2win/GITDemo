	package stepDefinitions;
	
	import org.junit.runner.RunWith;
	
	import io.cucumber.java.en.And;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import io.cucumber.junit.Cucumber;
	
@RunWith(Cucumber.class)
public class StepDefinition {

    @Given("^User is on Netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
    	System.out.println("GITDemo");
    	System.out.println("A");
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
    	System.out.println("GitTest");
    	System.out.println("B");   
    }
    
    @When("User login into application with {string} and {string}")
    public void user_login_into_application_with_and(String string, String string2) {
        System.out.println("GIT develop branch");
    	System.out.println(string);
        System.out.println(string2);
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	 System.out.println("GIT merge into master branch");
    	System.out.println("C");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	System.out.println("D");
    }

}
