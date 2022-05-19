package com.hp.simple.demo.service.impl;

import com.hp.simple.demo.dao.entity.Student;
import com.hp.simple.demo.dao.mapper.StudentDao;
import com.hp.simple.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author hp
 * @version 1.0
 * @date 2022/5/19 20:39
 */
@Component
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;
    @Override
    public boolean create(Student student) {
        return studentDao.create(student);
    }

    @Override
    public boolean update(Student student) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public boolean getById(Long id) {
        return false;
    }
}
