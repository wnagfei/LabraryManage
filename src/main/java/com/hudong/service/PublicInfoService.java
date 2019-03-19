package com.hudong.service;

import com.hudong.mapper.PublicInfoMapper;
import com.hudong.model.PublicInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicInfoService {

    @Autowired
    private PublicInfoMapper publicInfoMapper;

    public List<PublicInfo> getPublicInfoList(){
        return publicInfoMapper.getPublicInfoList();
    }

    public void delete(Integer id){
        publicInfoMapper.deleteByPrimaryKey(id);
    }

    public PublicInfo getPublicInfoById(Integer id){
        return publicInfoMapper.selectByPrimaryKey(id);
    }
}
