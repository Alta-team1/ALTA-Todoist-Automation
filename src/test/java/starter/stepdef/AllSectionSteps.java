package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.todoist.TodoisAPI;
import starter.todoist.TodoisResponses;

import java.io.File;
import static org.hamcrest.Matchers.equalTo;

public class AllSectionSteps {
    @Steps
    TodoisAPI todoisAPI;

    @Given("Get all section with parameter")
    public void getAllSectionWithParameter() {
        todoisAPI.getAllSection();
    }

    @When("Send request get all section")
    public void sendRequestGetAllSection() {
        SerenityRest.when().get(TodoisAPI.ALL_SECTION);
    }
    @When("Send request get all section error")
    public void sendRequestGetAllSectionError() {
        SerenityRest.when().get(TodoisAPI.ALL_ERROR_SECTION);
    }

    @And("Validate response body {string}")
    public void validateResponseBody(String id) {
        SerenityRest.and().body(TodoisResponses.ID, equalTo(id));
    }



}
