package com.service.impl;

import com.mapper.PotGradeMapper;
import com.pojo.PotGrade;
import com.pojo.PotGradeExample;
import com.pojo.PotTeacherExample;
import com.service.PotGradeService;
import com.utils.resultcode.ResultCode;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Date;
import java.util.List;

/**
 * @author
 * @date 2021/5/8 20:29
 * @description
 */
@Slf4j
@Transactional(rollbackFor = Exception.class)
@Service
public class PotGradeServiceImpl implements PotGradeService {
    @Autowired
    private PotGradeMapper potGradeMapper;

    @Override
    public ResultCode inputGrade(PotGrade potGrade) {
        if(potGrade.getUsualGradePercent() > 0 && potGrade.getTermGradePercent() > 0){
            /*更新成绩占比*/
            PotGradeExample potGradeExample = new PotGradeExample();
            potGradeExample.createCriteria().andIsDeletedEqualTo(3);
            potGradeMapper.updateByExampleSelective(potGrade,potGradeExample);
        }
        potGrade.setInputDate(new Date());
        potGrade.setIsDeleted(0);
        potGradeMapper.insertSelective(potGrade);
        return ResultCode.success();
    }

    @Override
    public ResultCode selectGrade() {
        PotGradeExample potGradeExample = new PotGradeExample();
        potGradeExample.createCriteria().andIsDeletedEqualTo(0);
        List<PotGrade> potGrades = potGradeMapper.selectByExample(potGradeExample);
        return ResultCode.success(potGrades,potGrades.size());
    }

    @Override
    public ResultCode selectGradePercent() {
        PotGradeExample potGradeExample = new PotGradeExample();
        potGradeExample.createCriteria().andIsDeletedEqualTo(3);
        List<PotGrade> potGrades = potGradeMapper.selectByExample(potGradeExample);
        return ResultCode.success(potGrades,potGrades.size());
    }
}
