package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.todoist.TodoisAPI;
import starter.todoist.TodoisResponses;
import starter.utils.Constants;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;

public class CreateProjectSteps {
    @Steps
    TodoisAPI todoisAPI;
    @Given("Create new project with file json {string}")
    public void createNewProjectWithFileJson(String fileName) {
        File jsonFile = new File(Constants.REQ_BODY + fileName);
        todoisAPI.createNewProject(jsonFile);
    }

    @When("Send request create new project")
    public void sendRequestCreateNewProject() {
        SerenityRest.when().post(TodoisAPI.CREATE_NEW_PROJECT);
    }

    @And("Response body name should be {string}")
    public void responseBodyNameShouldBe(String name) {
        SerenityRest.and().body(TodoisResponses.NAMEPROJECT,equalTo(name));
    }
}
