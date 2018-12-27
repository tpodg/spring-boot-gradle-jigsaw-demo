package com.example.demo.module.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModuleController {

    @GetMapping("/module/test")
    public String testAction() {
        return "Response from module";
    }
}
