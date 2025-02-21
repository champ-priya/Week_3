package com.springmvc.pmvc1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import com.springmvc.pmvc1.beans.Faculty; // Ensure you import the Faculty entity

@Repository
public interface FacultyRepo extends JpaRepository<Faculty, Long> {
    Optional<Faculty> findByEmailAndPass(String email, String pass);
}
