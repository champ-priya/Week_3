package com.springmvc.pmvc1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springmvc.pmvc1.beans.Assignment;
import com.springmvc.pmvc1.beans.Faculty;

@Repository
public interface AssignmentRepo extends JpaRepository<Assignment, Long> {
    List<Assignment> findByFaculty(Faculty faculty);
}
