package com.Training.SpringMVC.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.Training.SpringMVC.Model.Student;



public interface StudentRepo extends CrudRepository<Student, Integer>{
	
List<Student> findByCity(String city);
}
