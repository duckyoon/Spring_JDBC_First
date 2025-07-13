package com.junes.springboot.learn_jpa_and_hibernate.course.springdatajpa;

import com.junes.springboot.learn_jpa_and_hibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


// JpaRepository를 상속받고 있으므로 EntityManager에 연결할 필요가 없어짐.
public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

    // 임의의 메서드 작성 가능
    List<Course> findByAuthor (String author);
    List<Course> findByName (String name);
}
