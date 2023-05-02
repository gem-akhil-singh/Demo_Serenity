package starter.stepdefinitions;

import net.thucydides.core.annotations.Step;

public class StepImplementations {


    StepCodeImplementations stepCodeIm;

    @Step("Launch URL")
    public void launchURL(String url) {
        stepCodeIm.launchURL(url);
    }

    @Step("User Perform Click")
    public void userClickAction(String element) throws InterruptedException {
        stepCodeIm.userClickAction(element);

    }

    @Step("User types")
    public void userTypeAction(String value,String element) throws InterruptedException {
        stepCodeIm.userEnters(value,element);
    }

    @Step("User Switched to New Window")
    public void verifyNewWindow() {
        stepCodeIm.verifyNewWindow();

    }

    @Step("User Searches in the google search bar")
    public void userSearchesSearch(String search) {
        stepCodeIm.searchQuery(search);
    }
}
