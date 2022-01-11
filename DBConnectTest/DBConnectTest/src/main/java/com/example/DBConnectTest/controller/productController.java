package com.example.DBConnectTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class productController {
    @RequestMapping(value = "/product")
    public String sayHello(Model model){
        return "helloPage";
    }
}
