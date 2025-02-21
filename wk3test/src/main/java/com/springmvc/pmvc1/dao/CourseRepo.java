package com.springmvc.pmvc1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springmvc.pmvc1.beans.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Long> { }
