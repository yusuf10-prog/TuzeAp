package utilities;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static base_url.BaseUrl.spec;
import static io.restassured.path.json.JsonPath.given;

public class ApiUtils {

    public static Response post(RequestSpecification spec, Object body, String endpoint){
        return given(spec).body(body).post();
    }
}
