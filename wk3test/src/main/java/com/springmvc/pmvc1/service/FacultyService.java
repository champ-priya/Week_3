package com.springmvc.pmvc1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.pmvc1.beans.Assignment;
import com.springmvc.pmvc1.beans.Faculty;
import com.springmvc.pmvc1.dao.AssignmentRepo;
import com.springmvc.pmvc1.dao.FacultyRepo;

@Service
public class FacultyService {
    @Autowired
    private FacultyRepo facultyRepo;

    @Autowired
    private AssignmentRepo assignmentRepo;

    public Faculty login(String email, String pass) {
        return facultyRepo.findByEmailAndPass(email, pass).orElse(null);
    }

    public List<Assignment> getAssignedCourses(Faculty faculty) {
        return assignmentRepo.findByFaculty(faculty);
    }
}

