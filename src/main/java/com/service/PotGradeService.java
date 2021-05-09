package com.service;

import com.pojo.PotGrade;
import com.utils.resultcode.ResultCode;

/**
 * @author
 * @date 2021/5/8 20:29
 * @description
 */
public interface PotGradeService {
    ResultCode inputGrade(PotGrade potGrade);

    ResultCode selectGrade();

    ResultCode selectGradePercent();
}
