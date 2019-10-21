package com.fy.service.impl;

import com.fy.dao.StudentDao;
import com.fy.entity.Student;
import com.fy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : FuYu
 * @Despriotion :
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    public StudentDao studentDao;

    /**
     * 查询全部用户
     * @return
     */
    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }
}
