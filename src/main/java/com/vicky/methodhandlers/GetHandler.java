package com.vicky.methodhandlers;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class GetHandler {

    public Response getResponse(String url){
        RequestSpecification requestSpecification = given().header("Content-type","application-json");
        return given().spec(requestSpecification).get(url);
    }
}
