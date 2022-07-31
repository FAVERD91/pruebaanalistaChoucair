package co.com.choucair.certification.pruebaanalista.stepdefinitions;

import co.com.choucair.certification.pruebaanalista.tasks.JoinToday;
import co.com.choucair.certification.pruebaanalista.tasks.OpenUp;
import co.com.choucair.certification.pruebaanalista.userinterface.JoinTodayPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Register_userStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^user in the home page$")
    public void userInTheHomePage() {
        OnStage.theActorCalled("Faver").wasAbleTo(OpenUp.thePage(),(JoinToday.onthePage()));
    }


    @When("^user create an account filling all fileds$")
    public void userCreateAnAccountFillingAllFileds() {

    }

    @Then("^user sees its username$")
    public void userSeesItsUsername() {

    }
}
