package com;

import com.mapper.PotTeacherMapper;
import com.pojo.PotTeacher;
import com.pojo.PotTeacherExample;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.parameters.P;

import java.util.Date;

/**
 * @author
 * @date 2021/5/8 14:54
 * @description
 */
@SpringBootTest
public class SpringTest {
    @Autowired
    private PotTeacherMapper potTeacherMapper;

    @Test
    public void testMybatis(){
        PotTeacher potTeacher = new PotTeacher();
        potTeacher.setCreateTime(new Date());
        potTeacher.setTeacherName("宋冬野");
        potTeacher.setTeacherNum(20210508L);
        potTeacher.setIsDeleted(0);

        potTeacherMapper.insertSelective(potTeacher);

    }

}
