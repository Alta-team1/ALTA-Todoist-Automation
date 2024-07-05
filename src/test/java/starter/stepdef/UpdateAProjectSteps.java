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

public class UpdateAProjectSteps {
    @Steps
    TodoisAPI todoisAPI;

    @Given("Update a project with json file {string} and id {string}")
    public void updateAProjectWithJsonFileAndId(String fileName, String id) {
        File jsonFile = new File(Constants.REQ_BODY+fileName);
        todoisAPI.updateAProject(id, jsonFile);
    }

    @When("Send request update a project")
    public void sendRequestUpdateAProject() {
        SerenityRest.when().post(TodoisAPI.UPDATE_PROJECT);

    }

}
