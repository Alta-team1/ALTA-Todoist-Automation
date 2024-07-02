package starter.todoist;

import net.serenitybdd.rest.SerenityRest;
import starter.utils.Constants;
import net.thucydides.core.annotations.Step;

public class TodoisAPI {
    public  static String ALL_PROJECT = Constants.BASE_URL + "/rest/v2/projects";
    public  static String ALL_SECTION = Constants.BASE_URL + "/rest/v2/sections?id={id}";

    @Step ("Get All Project")
    public void getAllProject (){
        SerenityRest.given().header("Authorization", "Bearer 57e368f4bd3f67568f2eb2b002104f6887390d9b");
    }
    @Step("Get All Section")
        public void getAllSection(int id) {
        SerenityRest.given().pathParam("id", id).header("Authorization", "Bearer 57e368f4bd3f67568f2eb2b002104f6887390d9b");
    }

}
