package com.hudong.service;

import com.hudong.mapper.MaterialInfoMapper;
import com.hudong.model.MaterialInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MaterialService {

    @Autowired
    private MaterialInfoMapper materialInfoMapper;

    public Map<String,Object> addMaterial(String mateNo,String mateName,String mateCategory,
                                          String mateOwn,String mateStatus,String matePeople,String mateAddress){
        Map<String,Object> map = new HashMap<>();
        MaterialInfo materialInfo = new MaterialInfo();
        materialInfo.setMaterialNo(mateNo);
        materialInfo.setMaterialName(mateName);
        materialInfo.setMaterialAdress(mateAddress);
        materialInfo.setStatus(mateStatus);
        materialInfo.setMaterialCategory(mateCategory);
        materialInfo.setMaterialOwner(mateOwn);
        materialInfo.setMaterialOrder(matePeople);
        int insert = materialInfoMapper.insert(materialInfo);
        if(insert < 1){
            map.put("status",0);
        }else{
            map.put("status",1);
        }
        return map;
    }

    public Map<String,Object> updateMaterial(String mateNo,String mateName,String mateCategory,
                                          String mateOwn,String mateStatus,String matePeople,String mateAddress){
        Map<String,Object> map = new HashMap<>();
        MaterialInfo materialInfo = new MaterialInfo();
        materialInfo.setMaterialNo(mateNo);
        materialInfo.setMaterialName(mateName);
        materialInfo.setMaterialAdress(mateAddress);
        materialInfo.setStatus(mateStatus);
        materialInfo.setMaterialCategory(mateCategory);
        materialInfo.setMaterialOwner(mateOwn);
        materialInfo.setMaterialOrder(matePeople);
        int i = materialInfoMapper.updateByPrimaryKey(materialInfo);
        if(i < 1){
            map.put("status",0);
        }else{
            map.put("status",1);
        }
        return map;
    }

    public List<MaterialInfo> getList(){
        return materialInfoMapper.getList();
    }

    public void delete(Integer no){
        materialInfoMapper.deleteByPrimaryKey(no);
    }
}
