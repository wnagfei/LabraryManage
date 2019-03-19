package com.hudong.mapper;

import com.hudong.model.LabrayInfo;
import com.hudong.model.LabrayInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LabrayInfoMapper {

    List<LabrayInfo> getList();

    int countByExample(LabrayInfoExample example);

    int deleteByExample(LabrayInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LabrayInfo record);

    int insertSelective(LabrayInfo record);

    List<LabrayInfo> selectByExample(LabrayInfoExample example);

    LabrayInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LabrayInfo record, @Param("example") LabrayInfoExample example);

    int updateByExample(@Param("record") LabrayInfo record, @Param("example") LabrayInfoExample example);

    int updateByPrimaryKeySelective(LabrayInfo record);

    int updateByPrimaryKey(LabrayInfo record);
}