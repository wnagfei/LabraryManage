package com.hudong.controller;

import com.hudong.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("")
public class IndexController {

    @Autowired
    private TeacherService teacherService;

    @RequestMapping("/top")
    public String top(){
        return "top";
    }

    @RequestMapping("/password")
    public String password(){
        return "password";
    }

}
