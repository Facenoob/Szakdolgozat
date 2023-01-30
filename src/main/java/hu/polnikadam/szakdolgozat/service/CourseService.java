package hu.polnikadam.szakdolgozat.service;

import hu.polnikadam.szakdolgozat.converter.CourseConverter;
import hu.polnikadam.szakdolgozat.dto.CourseDto;
import hu.polnikadam.szakdolgozat.entitiy.course.Course;
import hu.polnikadam.szakdolgozat.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	@Autowired
	private CourseRepository courseRepository;
	@Autowired
	private CourseConverter courseConverter;

	public CourseDto addCourse(Course course){
		Course savedCourse = courseRepository.save(course);
		return courseConverter.entityToDto(savedCourse);
	}
	public CourseDto getCourseById(Long id) {
		return courseConverter.entityToDto(courseRepository.findById(id).get());
	}
	public CourseDto getCourseByUsername(String courseName) {
		return courseConverter.entityToDto(courseRepository.getCourseBycourseName(courseName));
	}
	public CourseDto updateCourse(Long id, CourseDto courseDto) {
		Course updateCourse = courseRepository.findById(id).get();
		courseConverter.updateEntity(updateCourse,courseDto);
		Course savedCourse = courseRepository.save(updateCourse);
		return courseConverter.entityToDto(savedCourse);
	}
	public Long deleteCourse(Long id) {
		Course course = courseRepository.findById(id).get();
		course.setRoom(null);
		return courseRepository.save(course).getId();
	}
}
