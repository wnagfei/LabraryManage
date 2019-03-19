package com.hudong.service;

import com.hudong.mapper.MaterialRepairInfoMapper;
import com.hudong.model.MaterialRepair;
import com.hudong.model.MaterialRepairInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RepairService {

    @Autowired
    private MaterialRepairInfoMapper materialRepairInfoMapper;

    public Map<String,Object> repair(String qInfo, String qName, String qTime){
        Map<String,Object> map = new HashMap<>();
        MaterialRepairInfo materialRepair = new MaterialRepairInfo();
        materialRepair.setMaterialNo(qInfo);
        materialRepair.setMaterialName(qInfo);
        materialRepair.setRepairReason(qName);
        materialRepair.setRepairReturnDate(qTime);
        int insert = materialRepairInfoMapper.insert(materialRepair);
        if(insert < 1){
            map.put("status", 0);
        }else{
            map.put("status",1);
        }
        return map;
    }

}
