package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class def {

    @Given("^landing dubai$")
    public void landing_dubai() throws Throwable {
        System.out.println("landing_dubai");
    }

    @When("^going to burj khalifa$")
    public void going_to_burj_khalifa() throws Throwable {
    	 System.out.println("going_to_burj_khalifa");
    }

    @Then("^buying iphone$")
    public void buying_iphone() throws Throwable {
    	 System.out.println("buying_iphone");
    }

    @And("^Back to india$")
    public void back_to_india() throws Throwable {
    	 System.out.println("back_to_india");
    }

}