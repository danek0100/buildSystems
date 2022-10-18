package com.example.springinitializr.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {

    @RequestMapping("/")
    public Map<String, Object> getIndex() {
        Map<String, Object> returnval = new HashMap<>();
        returnval.put("Hello", "world");
        return returnval;
    }
}
