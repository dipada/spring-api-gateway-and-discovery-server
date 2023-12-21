package com.dipada.firstservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/firstservice")
public class Controller {
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the first service";
    }
}
