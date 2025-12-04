package utilities;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class ApiUtils {

    public static Response post(RequestSpecification spec, Object body, String endpoint){
        return given(spec)
                .body(body)
                .when()
                .post(endpoint);
    }
}
