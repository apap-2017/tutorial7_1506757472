package com.example.tutorial7.consumer.dao;

import java.util.List;

import com.example.tutorial7.consumer.model.StudentModel;

public interface StudentDAO {
	StudentModel selectStudent (String npm);
	List<StudentModel> selectAllStudents ();
}
