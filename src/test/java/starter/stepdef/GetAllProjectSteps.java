package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.todoist.TodoisAPI;

public class GetAllProjectSteps {
    @Steps
    TodoisAPI todoisAPI;

    @Given("Get all project with valid parameter & token")
    public void getAllProjectWithValidParameterToken() {
        todoisAPI.getAllProject();
    }
    @When("Send request get all project")
    public void sendRequestGetAllProject() {
        SerenityRest.when().get(TodoisAPI.ALL_PROJECT);

    }
    @And("Response body id should be {int}")
    public void responseBodyIdShouldBe(int arg0) {
    }
    @And("Validate json schema {string}")
    public void validateJsonSchema(String arg0) {
    }
}
