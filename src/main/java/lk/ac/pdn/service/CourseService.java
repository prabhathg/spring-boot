package lk.ac.pdn.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import lk.ac.pdn.model.Course;

@Service
public class CourseService {
	
	public static Set<Course> courses = new HashSet<Course>();
	
	static {
		Course c1 = new Course("CS100", "Foundation Course", 2);
		Course c2 = new Course("CS101", "Computer Applications", 2);
		Course c3 = new Course("CS102", "Programming", 2);
		Course c4 = new Course("CS105", "Programming Lab", 2);
		Course c5 = new Course("CS203", "DBMS", 2);
		
		c3.addPrerequisit(c2);
		c4.addPrerequisit(c3);
		c5.addPrerequisit(c4);
		
		courses.addAll(Arrays.asList(c1, c2, c3, c4, c5));
	}
	
	public Set<Course> getCourses() {
		return courses;
	}
	
	public Course getCourseById(String id) {
		
		Course matchingObject = courses.stream().
				filter(p -> p.getId().equalsIgnoreCase(id)).
				findAny().orElse(null);
		
		return matchingObject;
	}
	
	public void addCourse(String id, String title, int credits) {
		courses.add(new Course(id, title, credits));
	}
	
	public void addCourse(Course c) {
		courses.add(c);
	}
	
	public Set<Course> deleteCourse(String id) {
		courses.remove(new Course(id));
		return courses;
	}
	
	public Set<Course> modifyCourse(String id, String title) {
		Course c = getCourseById(id);
		
		if(c != null) {
			c.setTitle(title);
			courses.add(c);
			
			
			
		}
		return courses;

	}
}
