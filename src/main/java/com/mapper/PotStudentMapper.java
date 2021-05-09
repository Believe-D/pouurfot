package com.mapper;

import com.pojo.PotStudent;
import com.pojo.PotStudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PotStudentMapper {
    long countByExample(PotStudentExample example);

    int deleteByExample(PotStudentExample example);

    int deleteByPrimaryKey(Long studentId);

    int insert(PotStudent record);

    int insertSelective(PotStudent record);

    List<PotStudent> selectByExample(PotStudentExample example);

    PotStudent selectByPrimaryKey(Long studentId);

    int updateByExampleSelective(@Param("record") PotStudent record, @Param("example") PotStudentExample example);

    int updateByExample(@Param("record") PotStudent record, @Param("example") PotStudentExample example);

    int updateByPrimaryKeySelective(PotStudent record);

    int updateByPrimaryKey(PotStudent record);
}