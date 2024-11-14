package com.delapi.microserviceapp.controller;

import com.delapi.microserviceapp.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @PostMapping("/user")
    public Response createUser(@RequestBody User user) {
        // Create a simple response message
        String message = "Welcome, " + user.getName() + "! You are " + user.getAge() + " years old.";
        return new Response(message);
    }

    // Response class to hold the JSON response
    public static class Response {
        private String message;

        public Response(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}
