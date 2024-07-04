package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.todoist.TodoisAPI;
import starter.todoist.TodoisResponses;
import starter.utils.Constants;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class CreatePersonalLabel {
    @Steps
    TodoisAPI todoisAPI;

    @Given("Create new labels with file json {string}")
    public void createNewLabelsWithFileJson(String fileName) {
        File fileJson = new File(Constants.REQ_BODY+fileName);
        todoisAPI.posycreatelabel(fileJson);
    }

    @When("Send request post create labels")
    public void sendRequestPostCreateLabels() {
        SerenityRest.when().post(TodoisAPI.CREATE_LABEL);
    }

    @And("Validate error response body {string}")
    public void validateErrorResponseBody(String error) {
        SerenityRest.and().body(TodoisResponses.NAME, equalTo(error));
    }

    @And("Validate error message Label name is required for creation")
    public void validateErrorMessageLabelNameIsRequiredForCreation() {
        SerenityRest.and().body(equalTo("Label name is required for creation"));
    }
}
