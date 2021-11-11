package com.revature;

import com.revature.controllers.RequestController;
import io.javalin.Javalin;

public class Launcher {

    public static void main(String[] args) {
        RequestController ctrl = new RequestController();
        //prefill with some test data
        Javalin app = Javalin.create(
                config -> {
                    config.enableCorsForAllOrigins();
                }
        ).start(8090);

        app.post("/confirm", ctrl.verifyHandler);
        app.post("/add", ctrl.addHandler);
        app.get("/", ctrl.getHandler);
    }

    //
}
