package com.aditya.demo.StudentServer;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student studentValidate(Student student) {

        if (student == null ||
                student.getName() == null ||
                student.getName().isBlank() ||
                student.getAge() < 0 ||
                student.getDepartment() == null ||
                student.getDepartment().isBlank()) {

            return null;
        }

        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
        Optional<Student> student = studentRepository.findById(id);
        return student.orElse(null);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}