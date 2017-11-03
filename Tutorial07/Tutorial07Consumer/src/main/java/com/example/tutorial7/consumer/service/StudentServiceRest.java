package com.example.tutorial7.consumer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.tutorial7.consumer.dao.CourseDAO;
import com.example.tutorial7.consumer.dao.StudentDAO;
import com.example.tutorial7.consumer.model.CourseModel;
import com.example.tutorial7.consumer.model.StudentModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Primary
public class StudentServiceRest implements StudentService {
	@Autowired
	private StudentDAO studentDAO;

	@Autowired
	private CourseDAO courseDAO;

	@Override
	public StudentModel selectStudent(String npm) {
		log.info("REST - Select Student With NPM {}", npm);
		return studentDAO.selectStudent(npm);
	}

	@Override
	public List<StudentModel> selectAllStudents() {
		log.info("REST - Select All Students");
		return studentDAO.selectAllStudents();
	}

	@Override
	public void addStudent(StudentModel student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudent(String npm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudent(StudentModel student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CourseModel selectCourse(String id_course) {
		log.info("REST - Select Course {}", id_course);
		return courseDAO.selectCourse(id_course);
	}

	@Override
	public List<CourseModel> selectAllCourses() {
		log.info("REST - Select All Courses");
		return courseDAO.selectAllCourses();
	}

}
