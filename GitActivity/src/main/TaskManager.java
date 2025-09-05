package main;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private List<Task> tasks = new ArrayList<>();

    // Add a task
    public void addTask(Task task) {
        tasks.add(task);
    }

    // View all tasks
    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        System.out.println("\n===== To-Do List =====");
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    // Mark a task as completed
    public boolean markTaskAsCompleted(int taskId) {
        for (Task task : tasks) {
            if (task.getId() == taskId) {
                task.markAsCompleted();
                return true;
            }
        }
        return false;
    }
}
