package com.avianca.tests.stepdefinitions;

import com.avianca.automation.steps.AviancaPageSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RetoAviancaStepDefinitions {
    @Steps
    AviancaPageSteps aviancaPageSteps;

    @Given("^user enters the page to book a flight with avianca$")
    public void userEntersThePageToBookAFlightWithAvianca() {
        aviancaPageSteps.openBrowser();

    }

    @When("^the data requested on the page is recorded$")
    public void theDataRequestedOnThePageIsRecorded() throws InterruptedException {
        aviancaPageSteps.fillFieldInAviancaPages();

    }

    @Then("^the flight reservation was made successfully\\.$")
    public void theFlightReservationWasMadeSuccessfully() {

    }

}
