package com.mapper;

import com.pojo.PotTask;
import com.pojo.PotTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PotTaskMapper {
    long countByExample(PotTaskExample example);

    int deleteByExample(PotTaskExample example);

    int deleteByPrimaryKey(Long taskId);

    int insert(PotTask record);

    int insertSelective(PotTask record);

    List<PotTask> selectByExample(PotTaskExample example);

    PotTask selectByPrimaryKey(Long taskId);

    int updateByExampleSelective(@Param("record") PotTask record, @Param("example") PotTaskExample example);

    int updateByExample(@Param("record") PotTask record, @Param("example") PotTaskExample example);

    int updateByPrimaryKeySelective(PotTask record);

    int updateByPrimaryKey(PotTask record);
}