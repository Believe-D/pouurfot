package com.mapper;

import com.pojo.PotTeacher;
import com.pojo.PotTeacherExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PotTeacherMapper {
    long countByExample(PotTeacherExample example);

    int deleteByExample(PotTeacherExample example);

    int deleteByPrimaryKey(Long teacherId);

    int insert(PotTeacher record);

    int insertSelective(PotTeacher record);

    List<PotTeacher> selectByExample(PotTeacherExample example);

    PotTeacher selectByPrimaryKey(Long teacherId);

    int updateByExampleSelective(@Param("record") PotTeacher record, @Param("example") PotTeacherExample example);

    int updateByExample(@Param("record") PotTeacher record, @Param("example") PotTeacherExample example);

    int updateByPrimaryKeySelective(PotTeacher record);

    int updateByPrimaryKey(PotTeacher record);
}