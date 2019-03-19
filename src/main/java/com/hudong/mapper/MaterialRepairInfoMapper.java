package com.hudong.mapper;

import com.hudong.model.MaterialRepairInfo;
import com.hudong.model.MaterialRepairInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialRepairInfoMapper {
    int countByExample(MaterialRepairInfoExample example);

    int deleteByExample(MaterialRepairInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MaterialRepairInfo record);

    int insertSelective(MaterialRepairInfo record);

    List<MaterialRepairInfo> selectByExample(MaterialRepairInfoExample example);

    MaterialRepairInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MaterialRepairInfo record, @Param("example") MaterialRepairInfoExample example);

    int updateByExample(@Param("record") MaterialRepairInfo record, @Param("example") MaterialRepairInfoExample example);

    int updateByPrimaryKeySelective(MaterialRepairInfo record);

    int updateByPrimaryKey(MaterialRepairInfo record);
}