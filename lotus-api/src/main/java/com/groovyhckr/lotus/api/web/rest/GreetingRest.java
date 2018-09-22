package com.groovyhckr.lotus.api.web.rest;

import com.groovyhckr.lotus.core.model.Greeting;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingRest {

    @GetMapping("/greeting")
    public ResponseEntity greeting() {
        return ResponseEntity.ok(new Greeting("greeting!"));
    }

}
