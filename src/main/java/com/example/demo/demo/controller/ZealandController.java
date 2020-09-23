package com.example.demo.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ZealandController {

    @GetMapping("/zealand")
    public String zealandMaps(){
        return "home/zealand/zealand";
    }

    @GetMapping("/furesø-map")
    public String furesøMap(){
        return "home/zealand/furesø-map";
    }
}
