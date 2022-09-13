package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student jack = new Student(
                    "Jack",
                    "jack234@gmail.com",
                    LocalDate.of(2002, JANUARY, 20),
                    20
            );
            Student marie = new Student(
                    "Marie",
                    "marie856@gmail.com",
                    LocalDate.of(2000, JANUARY, 20),
                    22
            );
            repository.saveAll(
                    List.of(jack, marie)
            );
        };
    }
}
