package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.todoist.TodoisAPI;
import static org.hamcrest.Matchers.equalTo;

public class DeleteSectionSteps {
    @Steps
    TodoisAPI todoisAPI;

    @Given("Delete section with id {string}")
    public void deleteSectionWithId(String id) {
        todoisAPI.deleteSection(id);
    }

    @When("Send request delete section")
    public void sendRequestDeleteSection() {
        SerenityRest.when().delete(TodoisAPI.DELETE_SECTION);
    }

    @And("Validate response error body section_id is invalid")
    public void validateResponseErrorBodySection_idIsInvalid() {
        SerenityRest.and().body(equalTo("section_id is invalid"));
    }
}
