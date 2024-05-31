package com.laptrinhjava.ASM3.controller;


import com.laptrinhjava.ASM3.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/test")
    public String test() {
        return "home";
    }

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("listcourse", courseService.getAll());
        return "home";
    }
    @GetMapping("/upcoming")
    public String upcomingCourses(Model model) {
        model.addAttribute("listcourse", courseService.getUpcomingCourses());
        return "upcoming";
    }
}
