package de.eldecker.dhbw.cucumber.stringtest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class StepDefinitions {

    private String _derString = null;


    @Given("der String ist {string}")
    public void givenDerStringIst(String str) {

        _derString = str;
    }


    /**
     * Step-Methode für Variante 1: int-Wert mit String-Länge
     * ist im Satz nicht in spezielle Zeichen gesetzt.
     */
    @Then("ist die String-Länge {int}")
    public void thenIstDieStringLaenge(int laenge) {

            assertEquals(laenge, _derString.length());
    }


    /**
     * Step-Methode für Variante 2: int-Wert mit String-Länge
     * ist im Satz in spitze Klammern gesetzt um sich klar zu
     * machen, dass es sich hierbei um eine Variable handelt.
     */
    @Then("ist die Länge des Strings <{int}>")
    public void thenIstDieLaengeDesStrings(int laenge) {

            assertEquals(laenge, _derString.length());
    }

}
