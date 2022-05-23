package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student Foo = new Student(
                    1L,
                    "Foo",
                    LocalDate.of(1998, Month.JANUARY, 19),
                    "foo@email.com"
            );

            Student Bar = new Student(
                    "Bar",
                    LocalDate.of(2000, Month.MARCH, 3),
                    "bar@email.com"
            );

            repository.saveAll(List.of(Foo, Bar));
        };
    }
}
