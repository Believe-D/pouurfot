package com.service;

import com.pojo.PotTask;
import com.utils.resultcode.ResultCode;

/**
 * @author
 * @date 2021/5/9 15:44
 * @description
 */
public interface PotTaskService {
    ResultCode submitTask(PotTask potTask);

    ResultCode issueMaterial(PotTask potTask);

    ResultCode selectTask();

    ResultCode selectMaterial();
}
