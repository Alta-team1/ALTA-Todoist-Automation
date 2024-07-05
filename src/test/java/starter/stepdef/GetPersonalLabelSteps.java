package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.todoist.TodoisAPI;

public class GetPersonalLabelSteps {
    @Steps
    TodoisAPI todoisAPI;

    @Given("Get personal label with id {string}")
    public void getPersonalLabelWithId(String id) {
        todoisAPI.getSingleLabel(id);
    }

    @When("Send request get personal label")
    public void sendRequestGetPersonalLabel() {

        SerenityRest.when().get(TodoisAPI.SINGLE_LABEL);
    }


}
