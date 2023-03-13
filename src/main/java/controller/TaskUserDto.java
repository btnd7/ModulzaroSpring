package controller;

import model.Task;

public class TaskUserDto {

    private String nameId;
    private String description;
    private String deadline;
    private String userName;

    public TaskUserDto(Task task, String userName) {
        this.nameId = task.getNameId();
        this.description = task.getDescription();
        this.deadline = task.getDeadline().toString();
        this.userName = userName;
    }
}

