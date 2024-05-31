package com.laptrinhjava.ASM3.controller;

import com.laptrinhjava.ASM3.models.Course;
import com.laptrinhjava.ASM3.models.Registration;
import com.laptrinhjava.ASM3.service.CourseService;
import com.laptrinhjava.ASM3.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @Autowired
    private RegistrationService registrationService;


    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("course", new Course());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("course") Course newCourse) {
        courseService.add(newCourse);
        return "redirect:/home";
    }

    @GetMapping("/register")
    public String registerForm(Model model) {
        model.addAttribute("registration", new Registration());
        model.addAttribute("courses", courseService.getAll());
        return "register";
    }

    @PostMapping("/register")
    public String register(Registration registration) {
        registrationService.register(registration);
        return "redirect:/home";
    }
}
