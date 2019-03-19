package com.hudong.service;

import com.hudong.mapper.PublicInfoMapper;
import com.hudong.mapper.TeacherInfoMapper;
import com.hudong.model.PublicInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class TeacherService {

    @Autowired
    private PublicInfoMapper publicInfoMapper;

    @Autowired
    private TeacherInfoMapper teacherInfoMapper;

    public Map<String, Object> republic_taskSubmit(String qName,String qInfo,String startTime,String endTime){
        Map<String, Object> map = new HashMap<>();
        PublicInfo info = new PublicInfo();
        info.setPublicName(qName);
        info.setPublicContent(qInfo);
        info.setPublicStartTime(new Date());
        info.setPublicEndTime(new Date());
        int insert = publicInfoMapper.insert(info);
        if(insert < 1){
            map.put("status", 0);
        }else{
            map.put("status",1);
        }
        return map;
    }

    public Map<String,Object> update(String userName, String className, String role, String sex, String department, String title){
        Map<String,Object> map = new HashMap<>();
        int result = teacherInfoMapper.update(userName,className,role,sex,department,title);
        if(result<1){
            map.put("status",0);
        }else{
            map.put("status",1);
        }
        return map;
    }

    public Map<String,Object> password(String username,String password1,String password2,String password3){
        Map<String,Object> map = new HashMap<>();
        int password = teacherInfoMapper.password(username, password2);
        if(password < 1){
            map.put("status",0);
        }else{
            map.put("status",1);
        }
        return map;
    }
}
