package com.fy.service;

import com.fy.entity.Student;

import java.util.List;

/**
 * @Author : FuYu
 * @Despriotion :
 */
public interface StudentService {
    /**
     * 查询全部用户
     *
     * @return
     */
    List<Student> findAll();
}
