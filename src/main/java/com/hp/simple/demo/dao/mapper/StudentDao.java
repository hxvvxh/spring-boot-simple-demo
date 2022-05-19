package com.hp.simple.demo.dao.mapper;

import com.hp.simple.demo.dao.entity.Student;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author hp
 * @version 1.0
 * @date 2021/10/31 21:20
 */
@Mapper
public interface StudentDao {

    Boolean create(Student student);

}
