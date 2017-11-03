package com.example.tutorial7.consumer.dao;

import java.util.List;

import com.example.tutorial7.consumer.model.CourseModel;

public interface CourseDAO {
	CourseModel selectCourse (String id_course);
	List<CourseModel> selectAllCourses ();
}
