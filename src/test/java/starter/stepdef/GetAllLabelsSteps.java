package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.todoist.TodoisAPI;

public class GetAllLabelsSteps {
    @Steps
    TodoisAPI todoisAPI;



    @Given("Get all personal labels with parameter")
    public void getAllPersonalLabelsWithParameter() {
        todoisAPI.getAllPersonalLabels();
    }




    @When("Send request get all personal labels")
    public void sendRequestGetAllPersonalLabels() {
        SerenityRest.when().get(TodoisAPI.ALL_PERSONAL_LABELS);
    }

    @And("Validate response body id {string}")
    public void validateResponseBodyId(String arg0) {
    }


    @When("Send request get all personal labels error")
    public void sendRequestGetAllPersonalLabelsError() {
        SerenityRest.when().get(TodoisAPI.ALL_PERSONAL_LABELS_ERROR);
    }

    @When("Send request get all personal labels error with special character")
    public void sendRequestGetAllPersonalLabelsErrorWithSpecialCharacter() {
        SerenityRest.when().get(TodoisAPI.ALL_PERSONAL_LABELS_ERROR_SPECIAL_CHARACTER);
    }
}
