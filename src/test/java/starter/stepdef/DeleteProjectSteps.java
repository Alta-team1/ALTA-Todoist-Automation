package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.todoist.TodoisAPI;
import static org.hamcrest.Matchers.equalTo;

public class DeleteProjectSteps {
    @Steps
    TodoisAPI todoisAPI;
    @Given("Delete a project with valid id {string}")
    public void deleteAProjectWithValidId(String id) {
        todoisAPI.deleteAProject(id);
    }

    @When("Send request delete a project")
    public void sendRequestDeleteAProject() {
        SerenityRest.when().delete(TodoisAPI.DELETE_PROJECT);
    }

    @Given("Delete a project with invalid id {string}")
    public void deleteAProjectWithInvalidId(String id) {
        todoisAPI.deleteAProject(id);
    }

    @And("Response body error should be Invalid Argument Value")
    public void responseBodyErrorShouldBeInvalidArgumentValue() {
        SerenityRest.and().body(equalTo("Invalid argument value"));
    }
}
