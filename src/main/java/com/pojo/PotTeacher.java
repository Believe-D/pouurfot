package com.pojo;

import java.io.Serializable;
import java.util.Date;

public class PotTeacher implements Serializable {
    private Long teacherId;

    private Long teacherNum;

    private String teacherName;

    private String password;

    private Date createTime;

    private Integer isDeleted;

    private static final long serialVersionUID = 1L;

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public Long getTeacherNum() {
        return teacherNum;
    }

    public void setTeacherNum(Long teacherNum) {
        this.teacherNum = teacherNum;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }
}