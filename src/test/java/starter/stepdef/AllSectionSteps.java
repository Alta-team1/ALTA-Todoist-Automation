package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.todoist.TodoisAPI;
import java.io.File;

public class AllSectionSteps {
    @Steps
    TodoisAPI todoisAPI;

    @Given("Get all section with parameter {int}")
    public void getAllSectionWithParameter(int id) {
        todoisAPI.getAllSection(id);
        SerenityRest.given().header("Authorization", "Bearer 7f1a376ed34de7f1f3e89025397cdbb5b7320104");
    }

    @When("Send request get all section")
    public void sendRequestGetAllSection() {
        SerenityRest.when().get(TodoisAPI.ALL_SECTION);
    }

}
