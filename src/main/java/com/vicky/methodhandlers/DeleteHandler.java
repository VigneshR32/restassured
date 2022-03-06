package com.vicky.methodhandlers;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class DeleteHandler implements RequestHandler{

    private String url;

    public DeleteHandler(String url){
        this.url=url;
    }
    @Override
    public Response getResponse(String request) {
        RequestSpecification requestSpecification = given().header("Content-type","application-json");
        return given().spec(requestSpecification).get(url);
    }
}
