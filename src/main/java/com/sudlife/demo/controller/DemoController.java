package com.sudlife.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("message", "Hello World");
        return "index";
    }
}
