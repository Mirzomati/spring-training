package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import com.cydeo.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @RequestMapping("/register")
    public String registerEm(Model model){

        List<String> states = Arrays.asList("AL","AK", "NJ", "NY", "CA", "KS", "VA");
        model.addAttribute("states", states);

        model.addAttribute("employee", new Employee());


        return "/employee/employee-register";
    }
    @PostMapping("/confirm")
    public String confirmEm(@ModelAttribute("employee") Employee employee){

        DataGenerator.addEmp(employee);


        return "redirect:/employee/register";
    }
    @RequestMapping("/conf")
    public String congPag(Model model){
        model.addAttribute("employee", DataGenerator.employees.get(0));
        return "/employee/employee-confirm";
    }

}
