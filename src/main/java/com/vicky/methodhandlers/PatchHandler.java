package com.vicky.methodhandlers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
import static io.restassured.config.EncoderConfig.encoderConfig;

public class PatchHandler implements RequestHandler{

    public PatchHandler(String url) {
        this.url = url;
    }

    private String url;

    @Override
    public Response getResponse(String request) {
        RequestSpecification requestSpecification = given().config(RestAssured.config().encoderConfig(encoderConfig().encodeContentTypeAs("application-json", ContentType.TEXT))).body(request);
        return given().spec(requestSpecification).patch(url);
    }
}
