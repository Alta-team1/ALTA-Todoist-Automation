package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.todoist.TodoisAPI;
import starter.todoist.TodoisResponses;
import starter.utils.Constants;

import java.io.File;

import static org.hamcrest.Matchers.*;

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
    @And("Response body id should be {string}")
    public void responseBodyIdShouldBe(String id) {
        SerenityRest.and().body(TodoisResponses.ID,equalTo(id));
    }
    @When("Send request get all project invalid")
    public void sendRequestGetAllProjectInvalid() {
        SerenityRest.when().get("https://api.todoist.com/rest/v2/projectsdf");
    }
    @Given("Get all project with invalid parameter")
    public void getAllProjectWithInvalidParameter() {
        todoisAPI.getAllProject();
    }


    @And("Response body error should be {string}")
    public void responseBodyErrorShouldBe(String error) {
        SerenityRest.and().body(TodoisResponses.ERROR,equalTo(error));
    }

    @Given("Get all project with invalid token")
    public void getAllProjectWithInvalidToken() {
        SerenityRest.given()
                .header("Authorization", "Bearer kasjd");
    }

    @And("Response body error should be Forbidden")
    public void responseBodyErrorShouldBeForbidden() {
        SerenityRest.and().body(equalTo("Forbidden"));
    }
}
