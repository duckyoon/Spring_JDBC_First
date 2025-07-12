package com.junes.springboot.learn_jpa_and_hibernate.course;

import com.junes.springboot.learn_jpa_and_hibernate.course.jdbc.CourseJdbcRepository;
import com.junes.springboot.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    // jdbc Repository 사용
    // @Autowired
    // private CourseJdbcRepository repository;

    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn JPA!", "Junes"));
        repository.insert(new Course(2, "Helleo JPA!", "kkkk"));
        repository.insert(new Course(3, "aaa", "bbb"));
        repository.deleteById(1);

        System.out.println(repository.findById(2));
        System.out.println(repository.findById(3));
    }
}

