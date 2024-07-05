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
    public static String CREATE_NEW_PROJECT = Constants.BASE_URL + "/rest/v2/projects";
    public static String GET_PROJECT = Constants.BASE_URL + "/rest/v2/projects/{id_project}";
    public static String UPDATE_PROJECT = Constants.BASE_URL + "/rest/v2/projects/{id}";
    public static String DELETE_PROJECT = Constants.BASE_URL + "/rest/v2/projects/{id_project}";
    public static String GET_ALL_COLLABORATOR = Constants.BASE_URL + "/rest/v2/projects/{id_project}/collaborators";


    @Step ("Get All Project")
    public void getAllProject (){
        SerenityRest.given().header("Authorization", "Bearer 7f1a376ed34de7f1f3e89025397cdbb5b7320104");
    }
    @Step ("Create New Project")
    public void createNewProject(File json){
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json)
                .header("Authorization", "Bearer 57e368f4bd3f67568f2eb2b002104f6887390d9b");
    }
    @Step ("Get a Project")
    public void getAPorject(String id){
        SerenityRest.given()
                .pathParam("id_project", id)
                .header("Authorization", "Bearer 57e368f4bd3f67568f2eb2b002104f6887390d9b");
    }
    @Step ("Update a project")
    public void updateAProject(String id, File json){
        SerenityRest.given().pathParam("id", id).contentType(ContentType.JSON).body(json).header("Authorization", "Bearer 57e368f4bd3f67568f2eb2b002104f6887390d9b");

    }
    @Step ("Delete a project")
    public void deleteAProject(String id){
        SerenityRest.given()
                .pathParam("id_project", id)
                .header("Authorization", "Bearer 57e368f4bd3f67568f2eb2b002104f6887390d9b");
    }
    @Step("Get all colaborators")
    public void getAllCollaborators(String id){
        SerenityRest.given()
                .pathParam("id_project", id)
                .header("Authorization", "Bearer 57e368f4bd3f67568f2eb2b002104f6887390d9b");
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
