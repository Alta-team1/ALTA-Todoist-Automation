package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.todoist.TodoisAPI;
import starter.utils.Constants;

import java.io.File;

public class ResponsesSteps {
    @Steps
    TodoisAPI todoisAPI;

    @Then("Status code should be {int}")
    public void statusCodeShouldBe(int statusCode) {
        SerenityRest.then().statusCode(statusCode);
    }

    @And("Validate json schema {string}")
    public void validateJsonSchema(String fileName) {
        File jsonFile = new File(Constants.JSON_SCHEMA + fileName);
        todoisAPI.createNewProject(jsonFile);
    }
}
