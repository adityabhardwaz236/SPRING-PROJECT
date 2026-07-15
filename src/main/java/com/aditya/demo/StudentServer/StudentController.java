package com.aditya.demo.StudentServer;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<?> addStudent(@RequestBody Student student) {

        Student savedStudent = studentService.studentValidate(student);

        if (savedStudent == null) {
            return ResponseEntity
                    .badRequest()
                    .body("Invalid student details");
        }

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(savedStudent);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable Long id) {

        Student student = studentService.getStudentById(id);

        if (student == null) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Student not found");
        }

        return ResponseEntity.ok(student);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id) {

        Student student = studentService.getStudentById(id);

        if (student == null) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Student not found");
        }

        studentService.deleteStudent(id);
        return ResponseEntity.ok("Student deleted successfully");
    }
}