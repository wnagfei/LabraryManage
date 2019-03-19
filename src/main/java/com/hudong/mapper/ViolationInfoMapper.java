package com.hudong.mapper;

import com.hudong.model.ViolationInfo;
import com.hudong.model.ViolationInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViolationInfoMapper {
    int countByExample(ViolationInfoExample example);

    int deleteByExample(ViolationInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ViolationInfo record);

    int insertSelective(ViolationInfo record);

    List<ViolationInfo> selectByExample(ViolationInfoExample example);

    ViolationInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ViolationInfo record, @Param("example") ViolationInfoExample example);

    int updateByExample(@Param("record") ViolationInfo record, @Param("example") ViolationInfoExample example);

    int updateByPrimaryKeySelective(ViolationInfo record);

    int updateByPrimaryKey(ViolationInfo record);
}