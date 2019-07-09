package lk.ac.pdn.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.pdn.model.Course;
import lk.ac.pdn.service.CourseService;

@RestController
public class CourseController {

<<<<<<< HEAD
	@Autowired //wire an instance automatcally by 
	//because service has @ annotation 
=======
	@Autowired //wire an instance automatically by spring
	//because server has @service annotation
>>>>>>> c6b71a4a17e4f13434e911741b8e3adbd1b96a20
	private CourseService courseService;
	
	@Value("${welcome.message}")
	private String welcomeMessage;
	
	@GetMapping("/")
    public String index() {
        return welcomeMessage;
    }
	
	@GetMapping(value="/courses")
    public Set<Course> courses() {
        return courseService.getCourses();
    }
	
	@RequestMapping(value="/course/{id}", method =RequestMethod.GET)
    public Course courseByPath(@PathVariable("id") String id) {
        return courseService.getCourseById(id);
    }
	
	//@GetMapping(value="/course")
	@RequestMapping(value="/course", method = RequestMethod.GET)
    public Course courseByParam(@RequestParam("id") String courseId) {
        return courseService.getCourseById(courseId);
    }
	
	@DeleteMapping(value="/course/{id}")
    public Set<Course> delete(@PathVariable("") String id) {
        return courseService.deleteCourse(id);
    }

}
