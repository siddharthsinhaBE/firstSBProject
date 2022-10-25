package com.siddharth.personal.demopersonal.Service;

import com.siddharth.personal.demopersonal.Entity.Student;
import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}