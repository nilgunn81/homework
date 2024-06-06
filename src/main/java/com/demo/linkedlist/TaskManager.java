package com.demo.linkedlist;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.LinkedList;
import java.util.List;

@Data
@AllArgsConstructor
public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new LinkedList<>();
    }

    public void addTask(String name, int priority) {
        Task newTask = new Task(name, priority);
        tasks.add(newTask);
    }

    public void removeTask(String name) {
        tasks.removeIf(task -> task.getName().equals(name));
    }

    public void listTasks() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        taskManager.addTask("Finish homework", 1);
        taskManager.addTask("Clean room", 3);
        taskManager.addTask("Do shopping", 4);
        taskManager.addTask("Go to gym", 2);
        taskManager.addTask("Do shopping", 4);

        System.out.println("All tasks:");
        taskManager.listTasks();

        taskManager.removeTask("Clean room");

        System.out.println("\nTasks after removal:");
        taskManager.listTasks();
    }
}
