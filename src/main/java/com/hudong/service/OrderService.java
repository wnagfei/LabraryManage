package com.hudong.service;

import com.hudong.mapper.OrderInfoMapper;
import com.hudong.model.OrderInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderService {

    @Autowired
    private OrderInfoMapper orderInfoMapper;

    public List<OrderInfo> getOrderInfoList(){
        return orderInfoMapper.getList();
    }

    public void delete(Integer id){
        orderInfoMapper.deleteByPrimaryKey(id);
    }

    public Map<String,Object> inserOrder(String qName,String qInfo,String startTime,String endTime){
        Map<String,Object> map = new HashMap<>();
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setMaterialNo(qName);
        orderInfo.setOrderEnddate(new Date());
        orderInfo.setOrderStartdate(new Date());
        orderInfo.setOrderPurpose(qInfo);
        int insert = orderInfoMapper.insert(orderInfo);
        if(insert<1){
            map.put("status", 0);
        }else{
            map.put("status",1);
        }
        return map;
    }
}
