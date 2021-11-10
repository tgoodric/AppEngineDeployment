package com.revature.controllers;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.revature.models.CompareRequest;
import com.revature.services.RequestService;
import io.javalin.http.Handler;

public class RequestController {
    Gson gson = new Gson();
    RequestService rs = new RequestService();

    public Handler verifyHandler = (ctx) -> {
        String body = ctx.body();
        CompareRequest request = null;
        try{
            request = gson.fromJson(body, CompareRequest.class);
        }
        catch (JsonSyntaxException e){
            ctx.status(400);
        }
    };

}
