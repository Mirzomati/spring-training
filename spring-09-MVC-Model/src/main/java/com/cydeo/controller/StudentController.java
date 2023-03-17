package com.cydeo.controller;

import com.cydeo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {

    @RequestMapping({"/welcome", "/student"})
    public String homePage(Model model){

        model.addAttribute("name", "Cydeo");
        model.addAttribute("course", "MVC");

        String subject = "Spring Boot";
        model.addAttribute("subject", subject);

        int sudentId = new Random().nextInt();
        model.addAttribute("studentId", sudentId);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(23);
        numbers.add(422);
        numbers.add(724);
        numbers.add(82);

        model.addAttribute("numbers", numbers);

        LocalDate dt = LocalDate.now();
        model.addAttribute("dt", dt);

        Student student = new Student(1, "Mike", "Smith");
        model.addAttribute("student", student);


        return "student/welcome";
    }
}
