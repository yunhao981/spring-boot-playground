package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Foo",
                        LocalDate.of(1998, Month.JANUARY, 19),
                        "Bar@email.com",
                        24
                )
        );
    }
}
