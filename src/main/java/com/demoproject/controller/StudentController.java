package com.demoproject.controller;

import com.demoproject.domain.Student;
import com.demoproject.repository.StudentRepository;
import com.demoproject.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/students")
public class StudentController {

    private  StudentRepository studentRepository;
    private StudentService studentService;

    @GetMapping("/{id}")
    private Mono<Student> findByStudentId(@PathVariable int id) {

        return studentService.findByStudentId(id);
    }
    @GetMapping("/{name}")
    private Flux<Student> findByName(@PathVariable String name) {
        return studentService.findByName(name);
    }

    @GetMapping
    private Flux<Student> findAllStudents() {
        return
                studentService.findAllStudents();
    }
}
