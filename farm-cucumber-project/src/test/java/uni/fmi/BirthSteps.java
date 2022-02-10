package uni.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.fmi.models.CowsAllowingModel;

public class BirthSteps {

	CowsAllowingModel allowedCows;
@Given("^Cows are alowed to have a child$")
public void cowsAllowed() throws Throwable {
	allowedCows = new CowsAllowingModel();
}

@When("^Mother is over (\\d+) year age$")
public void motherIsAllowed(int arg1) throws Throwable {
    allowedCows.checkMotherAge(2);
}

@When("^Father is over (\\d+) year age$")
public void fatherIsAllowed(int arg1) throws Throwable {
	allowedCows.checkFatherAge(2);
}

@When("^Mother is pregnant over (\\d+) month$")
public void motherPregnanting(int arg1) throws Throwable {
    allowedCows.GoodPregnanting(11);
}

@Then("^Birth is successful\\.$")
public void birth_is_successful() throws Throwable {
    assertEquals("Have a child successfully", allowedCows.getMessage());
}


}
