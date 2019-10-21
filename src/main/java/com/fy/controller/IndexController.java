package com.fy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author : FuYu
 * @Despriotion :
 */
@Controller
public class IndexController {

    /**
     * 查询全部用户
     * @return
     */
    @RequestMapping()
    public String index()
    {
        return "index";
    }
}
