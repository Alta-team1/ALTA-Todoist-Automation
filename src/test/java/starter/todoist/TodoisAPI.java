package starter.todoist;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import starter.utils.Constants;
import net.thucydides.core.annotations.Step;

import java.io.File;

public class TodoisAPI {
    public static String ALL_PROJECT = Constants.BASE_URL + "/rest/v2/projects";
    public static String ALL_SECTION = Constants.BASE_URL + "/rest/v2/sections";
    public static String ALL_ERROR_SECTION = Constants.BASE_URL + "/rest/v2/section";
    public static String ALL_ERROR_SECTION_SPECIAL_CHARACTER = Constants.BASE_URL + "/rest/v2/section!@#$";
    public static String SINGLE_SECTION = Constants.BASE_URL + "/rest/v2/sections/{id}";
    public static String CREATE_SECTION = Constants.BASE_URL + "/rest/v2/sections";
    public static String UPDATE_SECTION = Constants.BASE_URL + "/rest/v2/sections/{id}";
    public static String DELETE_SECTION = Constants.BASE_URL + "/rest/v2/sections/{id}";
    public static String ALL_PERSONAL_LABELS = Constants.BASE_URL + "/rest/v2/labels";
    public static String ALL_PERSONAL_LABELS_ERROR = Constants.BASE_URL + "/rest/v2/label";
    public static String ALL_PERSONAL_LABELS_ERROR_SPECIAL_CHARACTER = Constants.BASE_URL + "/rest/v2/label!@#$";
    public static String CREATE_LABEL = Constants.BASE_URL + "/rest/v2/labels";
    public static String SINGLE_LABEL = Constants.BASE_URL + "/rest/v2/labels/{id}";
    public static String UPDATE_LABEL = Constants.BASE_URL + "/rest/v2/labels/2173899238";
    public static String DELETE_LABEL = Constants.BASE_URL + "/rest/v2/labels/{id}";


    @Step ("Get All Project")
    public void getAllProject (){
        SerenityRest.given().header("Authorization", "Bearer 7f1a376ed34de7f1f3e89025397cdbb5b7320104");
    }
    @Step("Get All Section")
        public void getAllSection() {
        SerenityRest.given().header("Authorization", "Bearer 7f1a376ed34de7f1f3e89025397cdbb5b7320104");
    }
    @Step("Get All Section Error")
    public void getAllSectionError() {
        SerenityRest.given().header("Authorization", "Bearer 7f1a376ed34de7f1f3e89025397cdbb5b7320104");
    }
    @Step("Get Single Section")
        public void getSingleSection(String id){
        SerenityRest.given().pathParam("id", id).header("Authorization", "Bearer 7f1a376ed34de7f1f3e89025397cdbb5b7320104");
    }
    @Step("Create Section")
    public void postCreateSection(File json){
        SerenityRest.given().contentType(ContentType.JSON).body(json).header("Authorization", "Bearer 7f1a376ed34de7f1f3e89025397cdbb5b7320104");
    }
    @Step("Get all personal labels")
    public void getAllPersonalLabels(){
        SerenityRest.given().header("Authorization", "Bearer 7f1a376ed34de7f1f3e89025397cdbb5b7320104");
    }

    @Step("Createlabel")
    public void posycreatelabel(File json){
        SerenityRest.given().contentType(ContentType.JSON).body(json).header("Authorization", "Bearer 7f1a376ed34de7f1f3e89025397cdbb5b7320104");
    }
    @Step("Get Single Label")
    public void getSingleLabel(String id){
        SerenityRest.given().pathParam("id", id).header("Authorization", "Bearer 7f1a376ed34de7f1f3e89025397cdbb5b7320104");
    }
    @Step("Update Personal Label")
    public void postUpdateLabel(File json){
        SerenityRest.given().contentType(ContentType.JSON).body(json).header("Authorization", "Bearer 7f1a376ed34de7f1f3e89025397cdbb5b7320104");
    }
    @Step("Delete Label")
    public void deleteLabel(String id){
        SerenityRest.given().pathParam("id", id).header("Authorization", "Bearer 7f1a376ed34de7f1f3e89025397cdbb5b7320104");
    }
    @Step("Update Section")
    public void updateSection(String id, File json){
        SerenityRest.given().pathParam("id", id).contentType(ContentType.JSON).body(json).header("Authorization", "Bearer 7f1a376ed34de7f1f3e89025397cdbb5b7320104");
    }
    @Step("Delete Section")
    public void deleteSection(String id){
        SerenityRest.given().pathParam("id", id).header("Authorization", "Bearer 7f1a376ed34de7f1f3e89025397cdbb5b7320104");
    }

}
