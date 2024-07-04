package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.todoist.TodoisAPI;
import starter.todoist.TodoisResponses;

import static org.hamcrest.Matchers.equalTo;

public class ResponsesSteps {
    @Steps
    TodoisAPI todoisAPI;

    @Then("Status code should be {int}")
    public void statusCodeShouldBe(int statusCode) {
        SerenityRest.then().statusCode(statusCode);
    }
    @And("Validate response error body {string}")
    public void validateResponseErrorBody(String error) {
        SerenityRest.and().body(TodoisResponses.ERROR, equalTo(error));
    }
}
