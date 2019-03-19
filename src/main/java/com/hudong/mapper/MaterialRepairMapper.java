package com.hudong.mapper;

import com.hudong.model.MaterialRepair;
import com.hudong.model.MaterialRepairExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialRepairMapper {
    int countByExample(MaterialRepairExample example);

    int deleteByExample(MaterialRepairExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MaterialRepair record);

    int insertSelective(MaterialRepair record);

    List<MaterialRepair> selectByExample(MaterialRepairExample example);

    MaterialRepair selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MaterialRepair record, @Param("example") MaterialRepairExample example);

    int updateByExample(@Param("record") MaterialRepair record, @Param("example") MaterialRepairExample example);

    int updateByPrimaryKeySelective(MaterialRepair record);

    int updateByPrimaryKey(MaterialRepair record);
}