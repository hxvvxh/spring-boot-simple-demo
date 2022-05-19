package com.hp.simple.demo.service;

import com.hp.simple.demo.dao.entity.Student;

/**
 * @author hp
 * @version 1.0
 * @date 2022/5/19 20:39
 */
public interface StudentService {

    boolean create(Student student);

    boolean update(Student student);

    boolean delete(Long id);

    boolean getById(Long id);
}
