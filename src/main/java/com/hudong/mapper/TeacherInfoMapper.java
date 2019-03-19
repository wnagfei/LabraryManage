package com.hudong.mapper;

import com.hudong.model.TeacherInfo;
import com.hudong.model.TeacherInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherInfoMapper {

    TeacherInfo loginSubmit(@Param("username") String username, @Param("password") String password);

    int countByExample(TeacherInfoExample example);

    int deleteByExample(TeacherInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TeacherInfo record);

    int insertSelective(TeacherInfo record);

    List<TeacherInfo> selectByExample(TeacherInfoExample example);

    TeacherInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TeacherInfo record, @Param("example") TeacherInfoExample example);

    int updateByExample(@Param("record") TeacherInfo record, @Param("example") TeacherInfoExample example);

    int updateByPrimaryKeySelective(TeacherInfo record);

    int updateByPrimaryKey(TeacherInfo record);

    int update(@Param("userName") String userName, @Param("className") String className,
               @Param("role") String role, @Param("sex") String sex,
               @Param("department") String department, @Param("title") String title);

    int password(@Param("username")String username,@Param("password")String password);

    List<TeacherInfo> getList();
}