package stepdefinitions;

import base_url.BaseUrl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import pojos.Sign_Up_POJO;

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
        response= given(spec).body(expectedBody).post("/sign-up/email");
    }
}
