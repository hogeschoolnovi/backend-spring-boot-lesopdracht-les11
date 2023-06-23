package com.example.les11model.controller;

import com.example.les11model.model.Student;
import com.example.les11model.repository.StudentRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    private StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping
    public ResponseEntity<List<Student>> getStudents(){
        return ResponseEntity.ok(studentRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<?> postStudent(@RequestBody Student student){
        studentRepository.save(student);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/fullname")
    public ResponseEntity<List<Student>> getStudentBySubstring(@RequestParam(name="query") String substring){
        List<Student> studentList = studentRepository.findByFullNameContainingIgnoreCase(substring);
        if(!studentList.isEmpty()){
            return  ResponseEntity.ok(studentList);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
