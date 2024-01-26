package de.eldecker.dhbw.cucumber.stringtest;

import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

    private String _derString = null;

    @Given("der String ist {string}")
    public void givenDerStringIst(String str) {

        _derString = str;
    }

}
