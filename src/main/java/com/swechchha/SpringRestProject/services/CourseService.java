package com.swechchha.SpringRestProject.services;

import java.util.List;

import com.swechchha.SpringRestProject.entities.Course;

public interface CourseService {
	public List<Course> getCourses();
	public Course getCourse(long courseId);
	public Course addCourse(Course course);
	public Course updateCourse(Course course);
	public void deleteCourse(long parseLong);
	
	
	
//	public Course updateCourse(Long courseId, Course course);
//	public void deleteCourse(Long courseId);
}
