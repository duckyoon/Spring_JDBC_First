package com.junes.springboot.learn_jpa_and_hibernate.course;

import com.junes.springboot.learn_jpa_and_hibernate.course.jdbc.CourseJdbcRepository;
import com.junes.springboot.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;
import com.junes.springboot.learn_jpa_and_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    // jdbc Repository 사용
    // @Autowired
    // private CourseJdbcRepository repository;


//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {

        // jdbc, jpa
//        repository.insert(new Course(1, "Learn JPA!", "Junes"));
//        repository.insert(new Course(2, "Helleo JPA!", "kkkk"));
//        repository.insert(new Course(3, "aaa", "bbb"));
//        repository.deleteById(1);
//
//        System.out.println(repository.findById(2));

        // SpringDataJpa
        repository.save(new Course(1, "Learn JPA!", "Junes"));
        repository.save(new Course(2, "Helleo JPA!", "kkkk"));
        repository.save(new Course(3, "aaa", "bbb"));

        // 차이점으로 타입을 붙여준다.
        repository.deleteById(1l);
        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));

        // 메서드 사용
        System.out.println(repository.findAll());
        System.out.println(repository.count());

        // 커스텀 메서드 사용
        System.out.println(repository.findByAuthor("bbb"));
        System.out.println(repository.findByName("Helleo JPA!"));
    }
}

