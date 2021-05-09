package com.controller.grade;

import com.pojo.PotGrade;
import com.service.PotGradeService;
import com.utils.resultcode.ResultCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author
 * @date 2021/5/8 20:09
 * @description
 */
@Slf4j
@RestController
@RequestMapping("grade")
public class GradeController {

    @Autowired
    private PotGradeService potGradeService;

    @PostMapping("inputGrade")
    public ResultCode inputGrade(@RequestBody PotGrade potGrade){
        return  potGradeService.inputGrade(potGrade);
    }
    @GetMapping("selectGrade")
    public ResultCode selectGrade(){
        return  potGradeService.selectGrade();
    }
    @GetMapping("selectGradePercent")
    public ResultCode selectGradePercent(){
        return  potGradeService.selectGradePercent();
    }
}
