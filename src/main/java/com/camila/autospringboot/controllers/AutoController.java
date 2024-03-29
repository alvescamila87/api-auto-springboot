package com.camila.autospringboot.controllers;

import com.camila.autospringboot.domain.Auto;
import com.camila.autospringboot.services.AutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/autos")
public class AutoController {

    private AutoService autoService;

    public AutoController(AutoService service) {
        this.autoService = service;
    }

    @GetMapping("")
    public ResponseEntity<List<Auto>> getAllAuto() {
        List<Auto> autos = this.autoService.getAutoForSale();
        return ResponseEntity.ok().body(autos);
    }
}
