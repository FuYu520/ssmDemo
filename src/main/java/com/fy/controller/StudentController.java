package com.fy.controller;

import com.fy.entity.Student;
import com.fy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : FuYu
 * @Despriotion :
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    public StudentService studentService;

    /**
     * 查询全部用户
     * @return
     */
    @RequestMapping("/all")
    @ResponseBody
    public List<Student> findAll()
    {
        List<Student> all = studentService.findAll();
        /*System.out.println("ss");
        List<Student> all = new ArrayList<>();
        all.add(new Student(1,"小黑",18));
        all.add(new Student(2,"小白",19));
        all.add(new Student(3,"小黄",20));
        all.add(new Student(4,"小绿",21));*/
        return all;
    }

}
