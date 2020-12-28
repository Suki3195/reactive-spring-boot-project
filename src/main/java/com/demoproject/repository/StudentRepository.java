package com.demoproject.repository;

import com.demoproject.domain.Student;
import io.r2dbc.spi.ConnectionFactory;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@EnableR2dbcRepositories
public interface StudentRepository extends R2dbcRepository<Student,Integer>
        {

//            private ConnectionFactory connectionFactory;
//
//StudentRepository(ConnectionFactory connectionFactory){
//    this.connectionFactory=connectionFactory;
//}

@Query("{ Select * from Student where name = :name }")
   public  Flux< Student> findByName( String name);

    @Query("{ Select * from Student where id = :id }")
    Mono<Student> findByStudentId( int id);

//    Mono<Employee> employeeMono = client.get()
//            .uri("/employees/{id}", "1")
//            .retrieve()
//            .bodyToMono(Employee.class);
//
//employeeMono.subscribe(System.out::println);
//
//



//    @Query("SELECT * FROM people WHERE name = $1")






}
