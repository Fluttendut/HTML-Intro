package com.example.htmlintro.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class htmlcontroller {

    @GetMapping("/")
    public String index() {return "index";}

    @GetMapping("/boxes")
    public String boxes(){return "boxes";}

}
