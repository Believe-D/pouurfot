package com.pojo;

import java.io.Serializable;
import java.util.Date;

public class PotTask implements Serializable {
    private Long taskId;

    private String name;

    private String number;

    private String classroom;

    private String taskType;

    private String taskFile;

    private String fileUrl;

    private String description;

    private Date submitDate;

    private Byte isDeleted;

    private String state;

    private static final long serialVersionUID = 1L;

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom == null ? null : classroom.trim();
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType == null ? null : taskType.trim();
    }

    public String getTaskFile() {
        return taskFile;
    }

    public void setTaskFile(String taskFile) {
        this.taskFile = taskFile == null ? null : taskFile.trim();
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    @Override
    public String toString() {
        return "PotTask{" +
                "taskId=" + taskId +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", classroom='" + classroom + '\'' +
                ", taskType='" + taskType + '\'' +
                ", taskFile='" + taskFile + '\'' +
                ", fileUrl='" + fileUrl + '\'' +
                ", description='" + description + '\'' +
                ", submitDate=" + submitDate +
                ", isDeleted=" + isDeleted +
                ", state='" + state + '\'' +
                '}';
    }
}