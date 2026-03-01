package com.student.studentapi.controller;

import com.student.studentapi.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    private final StudentService service;

    public WebController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("students", service.getAllStudents());
        return "students";
    }
}
