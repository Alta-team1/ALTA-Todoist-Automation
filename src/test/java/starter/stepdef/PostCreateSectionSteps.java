package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.todoist.TodoisAPI;
import starter.todoist.TodoisResponses;
import starter.utils.Constants;
import static org.hamcrest.Matchers.equalTo;
import java.io.File;

public class PostCreateSectionSteps {
    @Steps
    TodoisAPI todoisAPI;

        @Given("Post create a new section with file json {string}")
        public void postCreateANewSectionWithFileJson(String fileName) {
        File fileJson = new File(Constants.REQ_BODY + fileName);
        todoisAPI.postCreateSection(fileJson);
        }


        @When("Send request post create section")
        public void sendRequestPostCreateSection () {
            SerenityRest.when().post(TodoisAPI.CREATE_SECTION);

        }


    @And("Validate response body name should be {string}")
    public void validateResponseBodyNameShouldBe(String name) {
            SerenityRest.and().body(TodoisResponses.SECTION_NAME, equalTo(name));
    }

    @And("Validate response body label {string}")
    public void validateResponseBodyLabel(String name) {
            SerenityRest.and().body(TodoisResponses.LABEL_NAME, equalTo(name));
    }

    @And("Validate response error body Name is required")
    public void validateResponseErrorBodyNameIsRequired() {
            SerenityRest.and().body(equalTo("Name is required"));
    }

    @And("Validate response error body project_id is invalid")
    public void validateResponseErrorBodyProject_idIsInvalid() {
        SerenityRest.and().body(equalTo("project_id is invalid"));
    }
}
