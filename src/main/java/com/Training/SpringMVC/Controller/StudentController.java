package com.Training.SpringMVC.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Training.SpringMVC.Model.Student;
import com.Training.SpringMVC.Repository.StudentRepo;

@Controller
public class StudentController {
	@Autowired
	StudentRepo repo;

	@RequestMapping("/addStudent")
	public ModelAndView addStudent(Student student) {

		repo.save(student);
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "Successfully inserted");
		mv.setViewName("Register");
		return mv;
	}
	
	@RequestMapping("/getStudent")
	public ModelAndView getStudent(@RequestParam int id)
	{
		ModelAndView mv = new ModelAndView();
		Student s=repo.findById(id).orElse(new Student());
		System.out.println(s.getCity());
		mv.addObject("student",s);
		mv.setViewName("ShowStudent");
		return mv;
		
	}
	@RequestMapping("/getCity")
	public ModelAndView getCity(@RequestParam String city)
	{
		ModelAndView mv = new ModelAndView();
		List<Student> s=repo.findByCity(city);
		
		mv.addObject("student",s);
		mv.setViewName("ShowStudent");
		return mv;
		
	}
	
}
