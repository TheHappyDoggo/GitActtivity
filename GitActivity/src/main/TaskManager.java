package main;

import java.util.ArrayList;
import java.util.Comparator;
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

    // Sort tasks by deadline (earliest first)
    public void sortTasksByDeadline() {
        tasks.sort(Comparator.comparing(Task::getDeadline));
        System.out.println("Tasks sorted by deadline!");
    }

    // Sort tasks by priority: High → Medium → Low
    public void sortTasksByPriority() {
        tasks.sort((t1, t2) -> {
            int p1 = getPriorityValue(t1.getPriority());
            int p2 = getPriorityValue(t2.getPriority());
            return Integer.compare(p1, p2);
        });
        System.out.println("Tasks sorted by priority!");
    }

    // Helper method to assign numerical values to priorities
    private int getPriorityValue(String priority) {
        switch (priority.toLowerCase()) {
            case "high":
                return 1;
            case "medium":
                return 2;
            case "low":
                return 3;
            default:
                return 4; // Unknown priorities go last
        }
    }
}
