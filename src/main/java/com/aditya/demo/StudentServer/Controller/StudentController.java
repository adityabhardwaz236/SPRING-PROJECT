package com.aditya.demo.StudentServer.Controller;

import com.aditya.demo.StudentServer.DTO.CreateStudentRequestDTO;
import com.aditya.demo.StudentServer.DTO.CreateStudentResponseDTO;
import com.aditya.demo.StudentServer.DTO.UpdateStudentRequestDTO;
import com.aditya.demo.StudentServer.DTO.UpdateStudentResponseDTO;
import com.aditya.demo.StudentServer.Entity.Student;
import com.aditya.demo.StudentServer.Service.StudentService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:3000")
@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> storeStudent(
            @Valid @RequestBody CreateStudentRequestDTO requestDTO) {

        CreateStudentResponseDTO result =
                studentService.studentValidate(requestDTO);

        if (result == null) {
            return ResponseEntity
                    .badRequest()
                    .body("Invalid student input");
        }

        return ResponseEntity
                .status(201)
                .body(result);
    }

    @GetMapping("/getStudent/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable int id) {

        try {
            Student student = studentService.getStudentById(id);
            return ResponseEntity.ok(student);

        } catch (Exception exception) {
            return ResponseEntity
                    .status(404)
                    .body("Student not found with ID: " + id);
        }
    }

    @PutMapping("/updateStudent/{id}")
    public ResponseEntity<?> updateStudent(
            @PathVariable int id,
            @Valid @RequestBody UpdateStudentRequestDTO requestDTO) {

        Student result =
                studentService.studentUpdate(id, requestDTO);

        if (result == null) {
            return ResponseEntity
                    .status(404)
                    .body("Student not found with ID: " + id);
        }

        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable int id) {

        Student deletedStudent = studentService.deleteStudent(id);

        if (deletedStudent == null) {
            return ResponseEntity
                    .status(404)
                    .body("Student not found with ID: " + id);
        }

        return ResponseEntity.ok("Student deleted successfully");
    }
}