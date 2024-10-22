package com.idiscovery.idiscoverybackend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping("/helloworld")
    public String PrintMessage()
    {
        return "Hello World";
    }

    @GetMapping("/helloworld/{context}")
    public String PrintMessage
    ithContext(@PathVariable String context)
    {
        return "Hello World " + context;
    }
}
