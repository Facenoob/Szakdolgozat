package hu.polnikadam.szakdolgozat.converter;

import hu.polnikadam.szakdolgozat.dto.CourseDto;
import hu.polnikadam.szakdolgozat.entitiy.course.Course;
import org.springframework.stereotype.Component;

@Component
public class CourseConverter {
	public CourseDto entityToDto(Course course){
		CourseDto courseDto= new CourseDto();
		courseDto.setCourseName(course.getCourseName());
		courseDto.setBuilding(course.getBuilding());
		courseDto.setRoom(course.getRoom());
		courseDto.setCredit(course.getCredit());
		courseDto.setFrom(course.getFrom());
		courseDto.setTo(course.getTo());
		courseDto.setTeacher(course.getTeacher());
		courseDto.setDesctiption(course.getDesctiption());
		return courseDto;
	}
	public Course dtoToEntity(CourseDto courseDto){
		Course course= new Course();
		course.setCourseName(courseDto.getCourseName());
		course.setBuilding(courseDto.getBuilding());
		course.setRoom(courseDto.getRoom());
		course.setCredit(courseDto.getCredit());
		course.setFrom(courseDto.getFrom());
		course.setTo(courseDto.getTo());
		course.setTeacher(courseDto.getTeacher());
		course.setDesctiption(courseDto.getDesctiption());
		return course;
	}
	public Course updateEntity(Course course,CourseDto courseDto){
		course.setCourseName(courseDto.getCourseName());
		course.setBuilding(courseDto.getBuilding());
		course.setRoom(courseDto.getRoom());
		course.setCredit(courseDto.getCredit());
		course.setFrom(courseDto.getFrom());
		course.setTo(courseDto.getTo());
		course.setTeacher(courseDto.getTeacher());
		course.setDesctiption(courseDto.getDesctiption());
		return course;
	}
}
