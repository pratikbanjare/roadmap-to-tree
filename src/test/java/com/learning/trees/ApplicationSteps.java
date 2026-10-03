package com.learning.trees;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApplicationSteps {
    private String applicationName;

    @When("the application starts")
    public void theApplicationStarts() {
        applicationName = App.NAME;
    }

    @Then("its name is {string}")
    public void itsNameIs(String expectedName) {
        assertEquals(expectedName, applicationName);
    }
}
