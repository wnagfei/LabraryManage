package com.hudong.mapper;

import com.hudong.model.StudentInfo;
import com.hudong.model.StudentInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentInfoMapper {

    StudentInfo loginSubmit(@Param("username") String username,@Param("password") String password);

    int countByExample(StudentInfoExample example);

    int deleteByExample(StudentInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StudentInfo record);

    int insertSelective(StudentInfo record);

    List<StudentInfo> selectByExample(StudentInfoExample example);

    StudentInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StudentInfo record, @Param("example") StudentInfoExample example);

    int updateByExample(@Param("record") StudentInfo record, @Param("example") StudentInfoExample example);

    int updateByPrimaryKeySelective(StudentInfo record);

    int updateByPrimaryKey(StudentInfo record);

    int password(@Param("username")String username,@Param("password")String password);

    int update(@Param("username")String username,@Param("sex")String sex,@Param("role")String role,
                                                @Param("classname")String classname,@Param("department")String department);
}