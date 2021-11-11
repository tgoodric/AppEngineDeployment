package com.revature.controllers;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.revature.models.CompareRequest;
import com.revature.services.RequestService;
import io.javalin.http.Handler;

import java.util.ArrayList;
import java.util.List;

public class RequestController {


    Gson gson = new Gson();
    RequestService rs = new RequestService();

    public Handler verifyHandler = (ctx) -> {
        String body = ctx.body();
        CompareRequest request;
        try{
            request = gson.fromJson(body, CompareRequest.class);
        }
        catch (JsonSyntaxException e){
            ctx.status(400);
            return;
        }
        int status = rs.confirm(request);
        ctx.status(status);
    };

    public Handler addHandler = (ctx) -> {
        String body = ctx.body();
        CompareRequest request;
        try {
            request = gson.fromJson(body,CompareRequest.class);
            rs.addRequest(request);
        }
        catch (JsonSyntaxException e){
            ctx.status(400);
            return;
        }
        ctx.status(201);
    };
    public Handler getHandler = (ctx) ->{
        List<CompareRequest> results = rs.getAll();
        String result = gson.toJson(results);
        ctx.result(result);
        ctx.status(200);
    };
}
