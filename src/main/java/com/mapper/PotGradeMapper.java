package com.mapper;

import com.pojo.PotGrade;
import com.pojo.PotGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PotGradeMapper {
    long countByExample(PotGradeExample example);

    int deleteByExample(PotGradeExample example);

    int deleteByPrimaryKey(Long gradeId);

    int insert(PotGrade record);

    int insertSelective(PotGrade record);

    List<PotGrade> selectByExample(PotGradeExample example);

    PotGrade selectByPrimaryKey(Long gradeId);

    int updateByExampleSelective(@Param("record") PotGrade record, @Param("example") PotGradeExample example);

    int updateByExample(@Param("record") PotGrade record, @Param("example") PotGradeExample example);

    int updateByPrimaryKeySelective(PotGrade record);

    int updateByPrimaryKey(PotGrade record);
}