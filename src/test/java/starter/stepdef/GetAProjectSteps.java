package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.todoist.TodoisAPI;
import starter.todoist.TodoisResponses;
import static org.hamcrest.Matchers.*;
public class GetAProjectSteps {
    @Steps
    TodoisAPI todoisAPI;

    @Given("Get a project with id {string}")
    public void getAProjectWithId(String id) {
        todoisAPI.getAPorject(id);
    }

    @And("Response body name should be {string} and id {string}")
    public void responseBodyNameShouldBeAndId(String name, String id) {
        SerenityRest.and().body("id",equalTo(id));
        SerenityRest.and().body(TodoisResponses.NAME,equalTo(name));
    }

    @When("Send request get a project")
    public void sendRequestGetAProject() {
        SerenityRest.when().get(TodoisAPI.GET_PROJECT);
    }


}
