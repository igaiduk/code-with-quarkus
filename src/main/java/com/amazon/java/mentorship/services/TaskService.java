package com.amazon.java.mentorship.services;

import com.amazon.java.mentorship.entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class TaskService {

    private final static List<Task> TASKS = new ArrayList<>();

    public TaskService (){
        TASKS.add( new Task("Prepare Weekly nutrition plan", Priority.PRIORITY_1 ));
    }

    public void addTask(Task task)
    {
      TASKS.add(task);
    }

    public void deleteTask(Task task)
    {
        TASKS.remove(task);
    }

    public List<Task> getAllTasks()
    {
        return TASKS;
    }

    public List<Task> getAllTasksByLabel(Label label)
    {
        return TASKS.stream().filter(l -> l.getLabels().contains(label)).collect(Collectors.toList());
    }

    public List<Task> getAllTasksByPriority(Priority priority)
    {
        return TASKS.stream().filter(l -> l.getPriority().equals(priority)).collect(Collectors.toList());
    }

    public List<Task> getAllTasksByStatus(Status status)
    {
        return TASKS.stream().filter(l -> l.getStatus().equals(status)).collect(Collectors.toList());
    }

    public void addLabel (int id, Label label){
        TASKS.stream()
                .filter(l -> l.getId() == id)
                .map(t -> t.getLabels().add(label));
    }

    public void addCommentary (int id, Commentary commentary){
        TASKS.stream()
                .filter(l -> l.getId() == id)
                .map(t -> t.getCommentaries().add(commentary));
    }
}
