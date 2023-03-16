package com.cydeo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CoolController {

    @RequestMapping("/cool")
    public String cool(){
        return "cool.html";
    }

}
