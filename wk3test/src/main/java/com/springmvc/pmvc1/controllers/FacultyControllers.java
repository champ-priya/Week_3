package com.springmvc.pmvc1.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.pmvc1.beans.Assignment;
import com.springmvc.pmvc1.beans.Faculty;
import com.springmvc.pmvc1.service.FacultyService;

@Controller
@RequestMapping("/faculty")
public class FacultyControllers {
    @Autowired
    private FacultyService facultyService;

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam String email, @RequestParam String pass, Model model, HttpSession session) {
        Faculty faculty = facultyService.login(email, pass);
        if (faculty != null) {
            session.setAttribute("faculty", faculty);
            List<Assignment> assignments = facultyService.getAssignedCourses(faculty);
            model.addAttribute("assignments", assignments);
            return "faculty-dashboard";
        }
        model.addAttribute("error", "Invalid email or password");
        return "login";
    }
}

