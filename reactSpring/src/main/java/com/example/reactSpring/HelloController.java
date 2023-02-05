package com.example.reactSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String apiHello() {
        System.out.println("api~~~");
        return "Hello :)";
    }
}
