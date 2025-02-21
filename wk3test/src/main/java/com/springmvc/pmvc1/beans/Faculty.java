package com.springmvc.pmvc1.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "faculty")
public class Faculty {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    private String name;
	    private String email;
	    private String pass;
	    private String mob;

	    @OneToMany(mappedBy = "faculty")
	    private List<Assignment> assignments;
}