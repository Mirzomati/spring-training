package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {

  // http://localhost:8080/info?make=honda
    @RequestMapping("/info")
    public String carInfo(@RequestParam String make, Model model){

        System.out.println(make);
        model.addAttribute("brand", make);

        return "car/car-info";
    }
//    http://localhost:8080/info2 KIA
    @RequestMapping("/info2")
    public String carInfo2(@RequestParam(value = "make", required = false, defaultValue = "kia") String make, Model model){

        System.out.println(make);
        model.addAttribute("brand", make);

        return "car/car-info";
    }
//http://localhost:8080/info3?make=honda&year=2012
    @RequestMapping("/info3")
    public String carInfo3(@RequestParam String make,@RequestParam int year, Model model){

        System.out.println(make);
        model.addAttribute("brand", make);
        model.addAttribute("year", year);

        return "car/car-info";
    }
@RequestMapping("/info/{make}/{year}") //localhost.8080//info/honda
    public String getCarInfo(@PathVariable String make,@PathVariable int year){

        System.out.println(make + " " + year);
        return "car/car-info";
    }


}
