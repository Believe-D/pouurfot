package com.controller.task;

import com.pojo.PotTask;
import com.service.FileUploadService;
import com.service.PotTaskService;
import com.sun.media.jfxmedia.logging.Logger;
import com.utils.resultcode.ResultCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author
 * @date 2021/5/9 15:37
 * @description
 */
@Slf4j
@RestController
@RequestMapping("task")
public class TaskController {
    @Autowired
    private PotTaskService potTaskService;

    @Autowired
    private FileUploadService fileUploadService;

    /**
     * 上传文件
     * @param file
     * @return
     */
    @PostMapping("uploadTaskFile")
    public ResultCode uploadTaskFile(MultipartFile file){
        return fileUploadService.uploadOneFile(file);
    }

    /**
     * 提交作业
     * @param potTask
     * @return
     */
    @PostMapping("submitTask")
    public ResultCode submitTask(@RequestBody PotTask potTask){
        return potTaskService.submitTask(potTask);
    }

    /**
     * 发布资料
     * @param potTask
     * @return
     */
    @PostMapping("issueTask")
    public ResultCode issueTask(@RequestBody PotTask potTask){
        return potTaskService.issueMaterial(potTask);
    }

    /**
     * 查询所有已提交的作业
     * @return
     */
    @GetMapping("selectTask")
    public ResultCode selectTask(){
        return  potTaskService.selectTask();
    }
    /**
     * 查询所有已发布的资料
     * @return
     */
    @GetMapping("selectMaterial")
    public ResultCode selectMaterial(){
        return  potTaskService.selectMaterial();
    }

}
