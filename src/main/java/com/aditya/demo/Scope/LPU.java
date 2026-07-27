package com.aditya.demo.Scope;

import com.aditya.demo.StudentServer.Entity.Student;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class LPU {
    LPU(){
        System.out.println("LPU rank 1");
    }
    public void addmission(Student student){
        System.out.println("Addmission");
    }
    public void exam(){
        System.out.println("Exam");
    }
    public void prepClasses(Student student){
        System.out.println("prepClassse");
    }
}