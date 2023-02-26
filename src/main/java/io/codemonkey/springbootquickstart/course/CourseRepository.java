package io.codemonkey.springbootquickstart.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String>{
    public List<Course> findByName(String name);//notUsed
    public List<Course> findByDescription(String foo);//not used
    public List<Course> findByTopicId(String topicId);
}
