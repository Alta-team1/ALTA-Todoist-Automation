package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.todoist.TodoisAPI;
import starter.utils.Constants;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;

public class UpdateSectionSteps {
    @Steps
    TodoisAPI todoisAPI;

    @Given("Update section with valid parameter id {string} and valid json {string}")
    public void updateSectionWithValidParameterIdAndValidJson(String id, String fileName) {
        File jsonFile = new File(Constants.REQ_BODY+fileName);
        todoisAPI.updateSection(id, jsonFile);

    }

    @When("Send request post update section")
    public void sendRequestPostUpdateSection() {
        SerenityRest.when().post(TodoisAPI.UPDATE_SECTION);
    }

    @And("Validate response body error section_id is invalid")
    public void validateResponseBodyErrorSection_idIsInvalid() {
        SerenityRest.and().body(equalTo("section_id is invalid"));
    }

    @And("Validate response body error Empty name")
    public void validateResponseBodyErrorEmptyName() {
        SerenityRest.and().body(equalTo("Empty name"));
    }
}
