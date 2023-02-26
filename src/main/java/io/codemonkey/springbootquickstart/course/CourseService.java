package io.codemonkey.springbootquickstart.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service //Business Service , singleton
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(String topicId) {
        return courseRepository.findByTopicId(topicId);
        /*List<Course> courses = new ArrayList<>();
        courseRepository.findAll().forEach(courses::add);
        return courses;*/
    }

    public Course getCourse(String id) {
        return courseRepository.findOne(id);
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Course newCourse) {
        courseRepository.save(newCourse);
    }

    public void deleteCourse(String id) {
        courseRepository.delete(id);
    }
}
