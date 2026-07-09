package org.aminesidki.be01.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MainController {
    @GetMapping
    public String helloWorld(){
        return "Hello world !";
    }

    @PostMapping
    public ResponseEntity<?> helloName(@RequestBody String name){
        return ResponseEntity.ok("Hello " + name);
    }
}
