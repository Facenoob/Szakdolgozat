package hu.polnikadam.szakdolgozat.repository;

import hu.polnikadam.szakdolgozat.entitiy.course.Course;

public interface CourseRepository extends BaseRepository<Course,Long>{
	Course getCourseBycourseName(String username);
}
