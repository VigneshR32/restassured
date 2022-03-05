package com.vicky.apiutills;

import io.restassured.response.Response;

public interface RequestHandler {

    public Response getResponse(String request);
}
