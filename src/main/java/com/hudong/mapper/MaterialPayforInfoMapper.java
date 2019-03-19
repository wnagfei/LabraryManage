package com.hudong.mapper;

import com.hudong.model.MaterialPayforInfo;
import com.hudong.model.MaterialPayforInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialPayforInfoMapper {
    int countByExample(MaterialPayforInfoExample example);

    int deleteByExample(MaterialPayforInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MaterialPayforInfo record);

    int insertSelective(MaterialPayforInfo record);

    List<MaterialPayforInfo> selectByExample(MaterialPayforInfoExample example);

    MaterialPayforInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MaterialPayforInfo record, @Param("example") MaterialPayforInfoExample example);

    int updateByExample(@Param("record") MaterialPayforInfo record, @Param("example") MaterialPayforInfoExample example);

    int updateByPrimaryKeySelective(MaterialPayforInfo record);

    int updateByPrimaryKey(MaterialPayforInfo record);
}