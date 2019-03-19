package com.hudong.service;

import com.hudong.mapper.StudentInfoMapper;
import com.hudong.mapper.TeacherInfoMapper;
import com.hudong.model.StudentInfo;
import com.hudong.model.TeacherInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Service
public class LoginAndRegisterService{

    @Autowired
    private TeacherInfoMapper teacherInfoMapper;

    @Autowired
    private StudentInfoMapper studentInfoMapper;

    public Map<String,Object> loginSubmit(String username,String password, String flag){
        Map<String,Object> map = new HashMap<>();
        if(flag.equals("学生")){
            StudentInfo studentInfo = studentInfoMapper.loginSubmit(username, password);
            if(studentInfo == null){
                map.put("status", 0);
            }else{
                map.put("status", 1);
            }
        }else{
            TeacherInfo teacherInfo = teacherInfoMapper.loginSubmit(username, password);
            if(teacherInfo == null){
                map.put("status", 0);
            }else{
                map.put("status", 1);
            }
        }
        map.put("flag", flag);
        return map;
    }

    public Map<String, Object> registerSubmit(String username,
                                               String password1,
                                               String password2,
                                               String classname,
                                               String role,
                                              String sex,
                                              String department,
                                              String title){
        Map<String, Object> map = new HashMap<>();
        if(role.equals("学生")){
            StudentInfo studentInfo = new StudentInfo();
            studentInfo.setUsername(username);
            studentInfo.setPwd(password1);
            studentInfo.setclassName(classname);
            studentInfo.setRole(role);
            studentInfo.setName("");
            studentInfo.setSex(sex);
            studentInfo.setDepartment(department);
            int result = studentInfoMapper.insert(studentInfo);
            if(result<1){
                map.put("status",0);
            }else{
                map.put("status",1);
            }
        }else{
            TeacherInfo teacherInfo = new TeacherInfo();
            teacherInfo.setUsername(username);
            teacherInfo.setPwd(password1);
            teacherInfo.setclassName(classname);
            teacherInfo.setRole(role);
            teacherInfo.setSex(sex);
            teacherInfo.setName("");
            teacherInfo.setDepartment(department);
            teacherInfo.setTitle(title);
            int result = teacherInfoMapper.insert(teacherInfo);
            if(result<1){
                map.put("status",0);
            }else{
                map.put("status",1);
            }
        }
        return map;
    }
}
