package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.todoist.TodoisAPI;

public class DeletePersonalLabelSteps {
    @Steps
    TodoisAPI todoisAPI;

    @Given("Delete personal label with id {string}")
    public void deletePersonalLabelWithId(String id) {
        todoisAPI.deleteLabel(id);

    }

    @When("Send request delete personal label")
    public void sendRequestDeletePersonalLabel() {
        SerenityRest.delete(TodoisAPI.DELETE_LABEL);
    }
}
