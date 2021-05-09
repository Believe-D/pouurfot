package com.pojo;

import java.io.Serializable;
import java.util.Date;

public class PotGrade implements Serializable {
    private Long gradeId;

    private String studentName;

    private Integer studentNum;

    private Integer usualGrade;

    private Integer termGrade;

    private Integer finalGrade;

    private Integer usualGradePercent;

    private Integer termGradePercent;

    private Date inputDate;

    private Integer isDeleted;

    private String state;

    private static final long serialVersionUID = 1L;

    public Long getGradeId() {
        return gradeId;
    }

    public void setGradeId(Long gradeId) {
        this.gradeId = gradeId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public Integer getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(Integer studentNum) {
        this.studentNum = studentNum;
    }

    public Integer getUsualGrade() {
        return usualGrade;
    }

    public void setUsualGrade(Integer usualGrade) {
        this.usualGrade = usualGrade;
    }

    public Integer getTermGrade() {
        return termGrade;
    }

    public void setTermGrade(Integer termGrade) {
        this.termGrade = termGrade;
    }

    public Integer getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(Integer finalGrade) {
        this.finalGrade = finalGrade;
    }

    public Integer getUsualGradePercent() {
        return usualGradePercent;
    }

    public void setUsualGradePercent(Integer usualGradePercent) {
        this.usualGradePercent = usualGradePercent;
    }

    public Integer getTermGradePercent() {
        return termGradePercent;
    }

    public void setTermGradePercent(Integer termGradePercent) {
        this.termGradePercent = termGradePercent;
    }

    public Date getInputDate() {
        return inputDate;
    }

    public void setInputDate(Date inputDate) {
        this.inputDate = inputDate;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}