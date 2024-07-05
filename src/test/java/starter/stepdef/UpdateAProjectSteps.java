package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.todoist.TodoisAPI;
import starter.todoist.TodoisResponses;
import starter.utils.Constants;

import java.io.File;

public class UpdateAProjectSteps {
    @Steps
    TodoisAPI todoisAPI;

    @Given("Update a project with json file {string} and id {string}")
    public void updateAProjectWithJsonFileAndId(String jsonFile, String id) {
        File file = new File(Constants.REQ_BODY + jsonFile);
        todoisAPI.updateAProject(file,id);
    }

    @When("Send request update a project")
    public void sendRequestUpdateAProject() {
        SerenityRest.when().post(TodoisAPI.GET_PROJECT);
    }
}
