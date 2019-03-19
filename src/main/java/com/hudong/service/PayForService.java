package com.hudong.service;

import com.hudong.mapper.MaterialPayforInfoMapper;
import com.hudong.model.MaterialPayforInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PayForService {

    @Autowired
    private MaterialPayforInfoMapper materialPayforInfoMapper;

    public Map<String,Object> addPayFor(String qName,String qInfo, String qMoney, String qPeople) {
        Map<String,Object> map = new HashMap<>();
        MaterialPayforInfo info = new MaterialPayforInfo();
        info.setMaterialName(qName);
        info.setPayForMoney(qMoney);
        info.setPayForReason(qInfo);
        info.setPayForOwner(qPeople);
        info.setMaterialNo(qName);
        int insert = materialPayforInfoMapper.insert(info);
        if(insert < 1){
            map.put("status", 0);
        }{
            map.put("status", 1);
        }
        return map;
    }
}
