package com.camila.autospringboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auto")
public class AutoController {

    @GetMapping
    public String getAllAuto() {
        return "All cars";
    }
}
