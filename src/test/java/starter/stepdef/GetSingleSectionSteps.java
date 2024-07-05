package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.todoist.TodoisAPI;
import starter.todoist.TodoisResponses;
import static org.hamcrest.Matchers.equalTo;

public class GetSingleSectionSteps {
    @Steps
    TodoisAPI todoisAPI;

    @Given("Get single section with parameter {string}")
    public void getSingleSectionWithParameter(String id) {
        todoisAPI.getSingleSection(id);
    }

    @When("Send request get single user")
    public void sendRequestGetSingleUser() {
        SerenityRest.when().get(TodoisAPI.SINGLE_SECTION);
    }

    @And("Validate response single response body {string}")
    public void validateResponseSingleResponseBody(String projectId) {
        SerenityRest.and().body(TodoisResponses.IDE, equalTo(projectId));
    }

    @And("Validate response error body Invalid argument value")
    public void validateResponseErrorBodyInvalidArgumentValue() {
        SerenityRest.and().body(equalTo("Invalid argument value"));
    }

    @And("Validate response error body Section not found")
    public void validateResponseErrorBodySectionNotFound() {
        SerenityRest.and().body(equalTo("Section not found"));
    }
}
