package com.example.tutorial7.consumer.service;

import java.util.List;

import com.example.tutorial7.consumer.model.CourseModel;
import com.example.tutorial7.consumer.model.StudentModel;

public interface StudentService {
	StudentModel selectStudent(String npm);
	
	List<StudentModel> selectAllStudents();

    void addStudent (StudentModel student);

    void deleteStudent (String npm);
    
    void updateStudent (StudentModel student);
    
	CourseModel selectCourse(String id_course);
	
	List<CourseModel> selectAllCourses ();
}
