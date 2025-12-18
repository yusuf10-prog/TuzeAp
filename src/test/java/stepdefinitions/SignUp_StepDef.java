package stepdefinitions;

import base_url.BaseUrl;
import enums.Endpoints;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.testng.Assert;
import pojos.Sign_Up_POJO;
import utilities.ApiUtils;


import static datas.BodyData.validSignUpBody;
import static io.restassured.RestAssured.given;

public class SignUp_StepDef extends BaseUrl {

    private Sign_Up_POJO expectedBody;

    private Response response;

    @Given("Base Url is set for the Sign Up endpoint")
    public void baseUrlIsSetForTheSignUpEndpoint() {
    }

    @And("Request body is prepared with valid user data")
    public void requestBodyIsPreparedWithValidUserData() {
        expectedBody = validSignUpBody();
    }

    @And("User sends POST request")
    public void userSendsPOSTRequest() {
        response = ApiUtils.post(spec, expectedBody, Endpoints.SIGN_UP_EMAIL.getPath());
        response.prettyPrint();
}

    @Then("Response status code should be {int}")
    public void responseStatusCodeShouldBe(int statusCode) {
        Assert.assertEquals(response.statusCode(), statusCode);
    }
}
