package starter.stepdef;

import com.vladsch.flexmark.ext.toc.internal.TocFormatOptions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.todoist.TodoisAPI;
import starter.utils.Constants;

import java.io.File;

public class UpdatePersonalLabel {
    @Steps
    TodoisAPI todoisAPI;

    @Given("Update user with valid parameter id and valid json {string}")
    public void updateUserWithValidParameterIdAndValidJson(String fileName) {
        File jsonFile = new File(Constants.REQ_BODY+fileName);
        todoisAPI.postUpdateLabel(jsonFile);
    }

    @When("Send request put update user")
    public void sendRequestPutUpdateUser() {
        SerenityRest.post(TodoisAPI.UPDATE_LABEL);
    }
}
