package com.digitalinnovation.MpersonaAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/people")
public class PersonaController {
    @GetMapping
    public String getBook(){
        return "Api Test";
    }
    
}
    