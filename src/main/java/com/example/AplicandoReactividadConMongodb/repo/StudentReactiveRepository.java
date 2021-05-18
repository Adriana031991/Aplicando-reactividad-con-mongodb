package com.example.AplicandoReactividadConMongodb.repo;

import com.example.AplicandoReactividadConMongodb.objeto.Student;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface StudentReactiveRepository extends ReactiveCrudRepository<Student,String> {
}