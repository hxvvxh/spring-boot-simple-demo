package com.hp.simple.demo.controller;

import com.hp.simple.demo.dao.entity.Student;
import com.hp.simple.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author hp
 * @version 1.0
 * @date 2022/5/19 20:38
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/create")
    public boolean create(@RequestBody Student student){
        return studentService.create(student);
    }

    @PutMapping("/update")
    public boolean update(@RequestBody Student student){
        return studentService.update(student);
    }


    @PutMapping("/delete")
        public boolean delete(@RequestParam Long id){
        return studentService.delete(id);
    }

    @GetMapping("/getById")
    public boolean getById(@RequestParam Long id){
        return studentService.getById(id);
    }
}
