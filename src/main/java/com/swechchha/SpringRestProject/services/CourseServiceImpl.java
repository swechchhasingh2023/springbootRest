package com.swechchha.SpringRestProject.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.swechchha.SpringRestProject.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	List<Course> list;
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(1, "Java Core Course", "this course contain basics"));
		list.add(new Course(2, "Spring Boot Course", "REST api using Spring Boot"));
	}

	@Override
	public List<Course> getCourses() {
	
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		Course c = null;
		for(Course course : list) {
			if(course.getId()== courseId) {
				c= course;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

	 @Override
	    public Course updateCourse(Long courseId, Course course) {
	        for (int i = 0; i < list.size(); i++) {
	            Course c = list.get(i);
	            if (c.getId() == courseId) {
	                course.setId(courseId); // ensure id consistency
	                list.set(i, course);
	                return course;
	            }
	        }
	        return null;
	    }

	    @Override
	    public void deleteCourse(Long courseId) {
	        list.removeIf(c -> c.getId() == courseId);
	    }
	
	

}
