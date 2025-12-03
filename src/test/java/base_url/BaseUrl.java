package base_url;

import com.sun.net.httpserver.Request;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import utilities.ConfigReader;

import java.lang.module.Configuration;

public class BaseUrl {

    public static RequestSpecification spec;

    static {
        spec = new RequestSpecBuilder()
                .setBaseUri(ConfigReader.getProperty("base_url"))
                .setContentType(ContentType.JSON)
                .addHeader("Content-Type", "application/json")
                .setAccept(ContentType.JSON)
                .build();
    }
}
