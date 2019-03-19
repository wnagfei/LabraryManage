package com.hudong.mapper;

import com.hudong.model.MaterialInfo;
import com.hudong.model.MaterialInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialInfoMapper {
    int countByExample(MaterialInfoExample example);

    int deleteByExample(MaterialInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MaterialInfo record);

    int insertSelective(MaterialInfo record);

    List<MaterialInfo> selectByExample(MaterialInfoExample example);

    MaterialInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MaterialInfo record, @Param("example") MaterialInfoExample example);

    int updateByExample(@Param("record") MaterialInfo record, @Param("example") MaterialInfoExample example);

    int updateByPrimaryKeySelective(MaterialInfo record);

    int updateByPrimaryKey(MaterialInfo record);

    List<MaterialInfo> getList();
}