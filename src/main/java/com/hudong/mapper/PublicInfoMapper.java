package com.hudong.mapper;

import com.hudong.model.PublicInfo;
import com.hudong.model.PublicInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PublicInfoMapper {

    List<PublicInfo> getPublicInfoList();

    int countByExample(PublicInfoExample example);

    int deleteByExample(PublicInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PublicInfo record);

    int insertSelective(PublicInfo record);

    List<PublicInfo> selectByExample(PublicInfoExample example);

    PublicInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PublicInfo record, @Param("example") PublicInfoExample example);

    int updateByExample(@Param("record") PublicInfo record, @Param("example") PublicInfoExample example);

    int updateByPrimaryKeySelective(PublicInfo record);

    int updateByPrimaryKey(PublicInfo record);
}