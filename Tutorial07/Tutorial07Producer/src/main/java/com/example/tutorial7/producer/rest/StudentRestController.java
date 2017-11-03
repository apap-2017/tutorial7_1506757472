package com.example.tutorial7.producer.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.tutorial7.producer.model.CourseModel;
import com.example.tutorial7.producer.model.StudentModel;
import com.example.tutorial7.producer.service.StudentService;

@RestController
@RequestMapping("/rest")
public class StudentRestController {
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/student/view/{npm}")
	public StudentModel viewStudent (@PathVariable(value = "npm") String npm) {
		StudentModel student = studentService.selectStudent(npm);
		
		return student;
	}
	
	@RequestMapping("/student/viewall")
	public List<StudentModel> viewAllStudent () {
		List<StudentModel> students = studentService.selectAllStudents();
		
		return students;
	}
	
	@RequestMapping("/course/view/{id_course}")
	public CourseModel viewCourse (@PathVariable(value = "id_course") String id_course) {
		CourseModel course = studentService.selectCourse(id_course);
		
		return course;
	}
	
	@RequestMapping("/course/viewall")
	public List<CourseModel> viewAllCourses () {
		List<CourseModel> courses = studentService.selectAllCourses();
		
		return courses;
	}
}
