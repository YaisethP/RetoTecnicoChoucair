package co.com.choucair.retotecnico.stepdefinitions;

import co.com.choucair.retotecnico.tasks.LoginOnDemo;
import co.com.choucair.retotecnico.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class RetoTecnicoStepDefinition {
    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^than Yaiseth wants to registration in the Automation Demo Site page$")
    public void thanYaisethWantsToRegistrationInTheAutomationDemoSitePage() {
        OnStage.theActorCalled("Yaiseth").attemptsTo(OpenUp.demoPage());

    }

    @When("^fills in all requested fields$")
    public void fillsInAllRequestedFields() {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginOnDemo.useDemoPage());
    }

    @Then("^complete all the field$")
    public void completeAllTheField() {
    }
}
