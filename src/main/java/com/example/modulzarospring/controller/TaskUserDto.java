package com.example.modulzarospring.controller;

import com.example.modulzarospring.model.Task;

public class TaskUserDto {

    private String nameId;
    private String description;
    private String deadline;
    private String userName;

    public TaskUserDto() {}

    public TaskUserDto(Task task) {
        this.nameId = task.getNameId();
        this.description = task.getDescription();
        this.deadline = task.getDeadline().toString();
        this.userName = task.getUser().getName();
    }

    public String getNameId() {
        return nameId;
    }

    public void setNameId(String nameId) {
        this.nameId = nameId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

