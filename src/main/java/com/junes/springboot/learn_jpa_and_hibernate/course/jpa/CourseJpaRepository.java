package com.junes.springboot.learn_jpa_and_hibernate.course.jpa;

import com.junes.springboot.learn_jpa_and_hibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {

//    @Autowired 도 대신 사용 가능
    @PersistenceContext // Autowired 대신 EntityManager를 스프링에서 의존성 주입할 때 사용하는 어노테이션
    private EntityManager entityManager;

    public void insert(Course course){
        entityManager.merge(course);
    }

    public Course findById(long id) {
        return entityManager.find(Course.class, id);
    }

    public void deleteById(long id){
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }

}

