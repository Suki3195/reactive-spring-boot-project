package com.demoproject.service;

import com.demoproject.domain.Student;
import com.demoproject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.r2dbc.core.DatabaseClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class StudentService
//        implements StudentRepository
        {
    @Autowired
    private DatabaseClient client;

    private StudentRepository studentRepository;
//    @Override
    public Flux<Student> findByName(String name) {
            Flux<Student> studentFlux = client.get()
            .uri("/employees")
            .retrieve()`
            .bodyToFlux(Student.class);

        studentFlux.subscribe(System.out::println);
        return null;
    }

//    @Override
    public Flux<Student> findAllStudents() {
        Flux<Student> studentFlux= studentRepository.findAll();

        return studentFlux;
    }

//    @Override
    public Mono<Student> findByStudentId(int id) {
        Mono<Student> studentMono = studentRepository.findByStudentId(id);
        return studentMono;
    }

}
