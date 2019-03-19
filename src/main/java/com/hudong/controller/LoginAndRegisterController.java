package com.hudong.controller;

import com.hudong.service.LoginAndRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class LoginAndRegisterController {

    @Autowired
    private LoginAndRegisterService loginAndRegisterService;

//    @RequestMapping("")
//    public String login(){
//        return "login";
//    }

    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @RequestMapping("/register_success")
    public String register_success(){
        return "register_success";
    }

    @RequestMapping(value = "/login/submit" ,method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> loginSubmit(@RequestParam("username") String username,
                                          @RequestParam("password") String password,
                                          @RequestParam("flag") String flag){
        return loginAndRegisterService.loginSubmit(username,password,flag);
    }

    @RequestMapping(value = "/register/submit" ,method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object>  registerSubmit(@RequestParam("username") String username,
                                              @RequestParam("password1") String password1,
                                              @RequestParam("password2") String password2,
                                              @RequestParam("classname") String classname,
                                              @RequestParam("role") String role,
                                              @RequestParam("sex") String sex,
                                              @RequestParam("department") String department,
                                              @RequestParam("title") String title){
        return loginAndRegisterService.registerSubmit(username,password1,password2,classname,role,sex,department,title);
    }

}
