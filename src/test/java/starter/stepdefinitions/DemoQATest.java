package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.implementation.Implementation;
import net.thucydides.core.annotations.Steps;

public class DemoQATest {

        @Steps
        StepImplementations stepImplementation;

        @Given("User Navigates to {string}")
        public void userNavigateTo(String url){
            stepImplementation.launchURL(url);
    }
    @Given("User Clicks on {string}")
    public void userClicks(String element) throws InterruptedException {

            stepImplementation.userClickAction(element);
    }

    @And("User Enters {string} in {string}")
    public void userEnter(String value ,String element) throws InterruptedException {
            stepImplementation.userTypeAction(value,element);
    }

    @Then("Verify that New Window is opened correctly")
    public void verifyNewWindow(){
            stepImplementation.verifyNewWindow();
    }

    @Given("User Clicks on Banner")
    public void userClickBanner() throws InterruptedException {
            stepImplementation.userClickAction("Banner");
    }


}
