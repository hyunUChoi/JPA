package com.example.jpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JpaController {

    @RequestMapping("/list")
    public String list() {
        return "list";
    }
}
