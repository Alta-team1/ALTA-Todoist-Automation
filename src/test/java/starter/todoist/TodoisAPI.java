package starter.todoist;

import net.serenitybdd.rest.SerenityRest;
import starter.utils.Constants;
import net.thucydides.core.annotations.Step;

public class TodoisAPI {
    public  static String ALL_SECTION = Constants.BASE_URL + "/rest/v2/sections?id={id}";

    @Step("Get All Section")
        public void getAllSection(int id) {
        SerenityRest.given().pathParam("id", id);
    }

}
