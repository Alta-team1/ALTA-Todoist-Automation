package starter.todoist;

import io.cucumber.java.eo.Se;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import starter.utils.Constants;
import net.thucydides.core.annotations.Step;

import java.io.File;

public class TodoisAPI {
    public static String ALL_PROJECT = Constants.BASE_URL + "/rest/v2/projects";
    public static String CREATE_NEW_PROJECT = Constants.BASE_URL + "/rest/v2/projects";
    public static String GET_PROJECT = Constants.BASE_URL + "/rest/v2/projects/{id_project}";
    public static String UPDATE_PROJECT = Constants.BASE_URL + "/rest/v2/projects/{id_project}";
    public static String DELETE_PROJECT = Constants.BASE_URL + "/rest/v2/projects/{id_project}";
    public static String GET_ALL_COLLABORATOR = Constants.BASE_URL + "/rest/v2/projects/{id_project}/collaborators";
    public static String ALL_SECTION = Constants.BASE_URL + "/rest/v2/sections?id={id}";

    @Step ("Get All Project")
    public void getAllProject (){
        SerenityRest.given()
                .header("Authorization", "Bearer 57e368f4bd3f67568f2eb2b002104f6887390d9b");
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
    public void updateAProject(File json, String id){
        SerenityRest.given()
                .body(ContentType.JSON)
                .body(json)
                .pathParam("id_project", id)
                .header("Authorization", "Bearer 57e368f4bd3f67568f2eb2b002104f6887390d9b");
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
        public void getAllSection(int id) {
        SerenityRest.given().pathParam("id", id);
    }

}
