package com.fy.dao;

import com.fy.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author : FuYu
 * @Despriotion :
 */
//@Repository
public interface StudentDao {

    /**
     *  查询全部
     * @return
     */
    List<Student> findAll();

}
