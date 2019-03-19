package com.hudong.service;

import com.hudong.mapper.LabrayInfoMapper;
import com.hudong.model.LabrayInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LabrayService {

    @Autowired
    private LabrayInfoMapper labrayInfoMapper;

    public List<LabrayInfo> getLabrayList(){
        return labrayInfoMapper.getList();
    }

    public Map<String,Object> addLabray(String qInfo,String qName,String qContent,String qStatus){
        Map<String,Object> map = new HashMap<>();
        LabrayInfo labrayInfo = new LabrayInfo();
        labrayInfo.setLabrayAdress(qName);
        labrayInfo.setLabrayName(qInfo);
        labrayInfo.setLabrayStatus(qStatus);
        labrayInfo.setLabrayRemark(qContent);
        int insert = labrayInfoMapper.insert(labrayInfo);
        if(insert < 1) {
            map.put("status",0);
        }else{
            map.put("status",1);
        }
        return map;
    }
}
