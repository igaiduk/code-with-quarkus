package com.amazon.java.mentorship.entities;

import java.util.ArrayList;
import java.util.List;

public class Task {
    private static int count = 0;
    private int id;
    private String description;
    private Priority priority;
    private List<Label> labels;

    private List<Commentary> commentaries;
    private Status status;

    public Task(String description, Priority priority) {
        this.id = ++count;
        this.description = description;
        this.priority = priority;
        this.labels = new ArrayList<>();
        this.commentaries = new ArrayList<>();
        this.status = Status.TO_DO;
    }

    public Task(String description,Priority priority, List<Label> labels) {
        this.id = ++count;
        this.description = description;
        this.priority = priority;
        this.labels = labels;
        this.commentaries = new ArrayList<>();
        this.status = Status.TO_DO;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public List<Label> getLabels() {
        return labels;
    }

    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    public List<Commentary> getCommentaries() {
        return commentaries;
    }

    public void setCommentaries(List<Commentary> commentaries) {
        this.commentaries = commentaries;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                ", labels=" + labels +
                ", commentaries=" + commentaries +
                ", status=" + status +
                '}';
    }
}

