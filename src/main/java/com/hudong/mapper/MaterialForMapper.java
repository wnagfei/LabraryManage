package com.hudong.mapper;

import com.hudong.model.MaterialFor;
import com.hudong.model.MaterialForExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialForMapper {
    int countByExample(MaterialForExample example);

    int deleteByExample(MaterialForExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MaterialFor record);

    int insertSelective(MaterialFor record);

    List<MaterialFor> selectByExample(MaterialForExample example);

    MaterialFor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MaterialFor record, @Param("example") MaterialForExample example);

    int updateByExample(@Param("record") MaterialFor record, @Param("example") MaterialForExample example);

    int updateByPrimaryKeySelective(MaterialFor record);

    int updateByPrimaryKey(MaterialFor record);
}