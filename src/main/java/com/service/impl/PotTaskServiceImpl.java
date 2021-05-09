package com.service.impl;

import com.mapper.PotTaskMapper;
import com.pojo.PotTask;
import com.pojo.PotTaskExample;
import com.service.PotTaskService;
import com.utils.resultcode.ResultCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author
 * @date 2021/5/9 15:46
 * @description
 */
@Slf4j
@Transactional(rollbackFor = Exception.class)
@Service
public class PotTaskServiceImpl implements PotTaskService {
    @Autowired
    private PotTaskMapper potTaskMapper;

    @Override
    public ResultCode submitTask(PotTask potTask) {
        potTask.toString();
        potTask.setIsDeleted((byte) 0);
        potTask.setSubmitDate(new Date());
        potTask.setState("已提交");
        potTask.setTaskFile("task");
        potTaskMapper.insertSelective(potTask);
        return ResultCode.success();
    }

    @Override
    public ResultCode issueMaterial(PotTask potTask) {
        potTask.toString();
        potTask.setIsDeleted((byte) 0);
        potTask.setSubmitDate(new Date());
        potTask.setState("已提交");
        potTask.setTaskFile("material");
        potTaskMapper.insertSelective(potTask);
        return ResultCode.success();
    }

    @Override
    public ResultCode selectTask() {
        PotTaskExample potTaskExample = new PotTaskExample();
        potTaskExample.createCriteria().andIsDeletedEqualTo((byte)0).andTaskFileEqualTo("task");
        List<PotTask> potTaskList = potTaskMapper.selectByExample(potTaskExample);
        return ResultCode.success(potTaskList,potTaskList.size());
    }

    @Override
    public ResultCode selectMaterial() {
        PotTaskExample potTaskExample = new PotTaskExample();
        potTaskExample.createCriteria().andIsDeletedEqualTo((byte)0).andTaskFileEqualTo("material");
        List<PotTask> potTaskList = potTaskMapper.selectByExample(potTaskExample);
        return ResultCode.success(potTaskList,potTaskList.size());
    }
}
