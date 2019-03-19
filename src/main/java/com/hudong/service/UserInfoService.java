package com.hudong.service;

import com.hudong.mapper.StudentInfoMapper;
import com.hudong.mapper.TeacherInfoMapper;
import com.hudong.model.StudentInfo;
import com.hudong.model.TeacherInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserInfoService {

    @Autowired
    private StudentInfoMapper studentInfoMapper;

    @Autowired
    private TeacherInfoMapper teacherInfoMapper;

    public Map<String,Object> addInfo(String username,String sex,String role,String classname,String department){
        Map<String,Object> map = new HashMap<>();
        if(role.equals("学生")){
            StudentInfo studentInfo = new StudentInfo();
            studentInfo.setName(username);
            studentInfo.setSex(sex);
            studentInfo.setRole(role);
            studentInfo.setclassName(classname);
            studentInfo.setDepartment(department);
            studentInfo.setUsername("qqq");
            studentInfo.setPwd("www");
            int insert = studentInfoMapper.insert(studentInfo);
            if(insert < 1){
                map.put("status", 0);
            }else{
                map.put("status",1);
            }
        }else{
            TeacherInfo studentInfo = new TeacherInfo();
            studentInfo.setName(username);
            studentInfo.setSex(sex);
            studentInfo.setRole(role);
            studentInfo.setclassName(classname);
            studentInfo.setDepartment(department);
            studentInfo.setUsername("qqq");
            studentInfo.setPwd("www");
            studentInfo.setTitle("");
            int insert = teacherInfoMapper.insert(studentInfo);
            if(insert < 1){
                map.put("status", 0);
            }else{
                map.put("status",1);
            }
        }
        return map;
    }

    public List<TeacherInfo> getList(){
        return teacherInfoMapper.getList();
    }

    public void delete(Integer id){
        teacherInfoMapper.deleteByPrimaryKey(id);
    }
}
