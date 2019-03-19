package com.hudong.service;


import com.hudong.mapper.StudentInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StudentService {

    @Autowired
    private StudentInfoMapper studentInfoMapper;

    public Map<String,Object> password(String username, String password1, String password2, String password3){
        Map<String,Object> map = new HashMap<>();
        int password = studentInfoMapper.password(username, password2);
        if(password < 1){
            map.put("status",0);
        }else{
            map.put("status",1);
        }
        return map;
    }

    public Map<String,Object> update(String username,String sex,String role,String classname,String department){
        Map<String,Object> map = new HashMap<>();
        int result = studentInfoMapper.update(username,sex,role,classname,department);
        if(result < 1){
            map.put("status",0);
        }else {
            map.put("status",1);
        }
        return map;
    }
}
