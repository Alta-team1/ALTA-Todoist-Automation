package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.todoist.TodoisAPI;
import starter.todoist.TodoisResponses;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;

public class GetAllCollaboratorsSteps {
    @Steps
    TodoisAPI todoisAPI;
    @Given("Get all collaborators with valid id {string}")
    public void getAllCollaboratorsWithValidId(String id) {
        todoisAPI.getAllCollaborators(id);
    }

    @When("Send request get all collaborators")
    public void sendRequestGetAllCollaborators() {
        SerenityRest.when().get(TodoisAPI.GET_ALL_COLLABORATOR);
    }

    @And("Response body name should be {string} email should be {string}")
    public void responseBodyNameShouldBeEmailShouldBe(String name, String email) {
        SerenityRest.and()
                .body(TodoisResponses.NAMA,equalTo(name))
                .body(TodoisResponses.EMAIL,equalTo(email));
    }

    @Given("Get all collaborators with valid id {string} and invalid parameter")
    public void getAllCollaboratorsWithValidIdAndInvalidParameter(String id) {
        todoisAPI.getAllCollaborators(id);
    }

    @When("Send request get all collaborators invalid parameter")
    public void sendRequestGetAllCollaboratorsInvalidParameter() {
        SerenityRest.when().get(TodoisAPI.GET_ALL_COLLABORATOR+ "sd");
    }
}
