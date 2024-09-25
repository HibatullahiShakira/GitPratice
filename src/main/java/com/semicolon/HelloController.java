package com.semicolon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

public class HelloController {

    @GetMapping("/{name}")
    public String hello(@PathVariable("name") String name) {
        return "Hello " + name;
    }

    @GetMapping("/welcome/{name}")
    public String welcome(@PathVariable("name") String name) {
        return "welcome " + name;
    }

    @GetMapping("/smart/{name}")
    public String gender(@PathVariable("name") String name) {
        return "boy " + name;
    }
}




