package main;

public class Task { 
    private static int idCounter = 1;
    private int id;
    private String description;
    private String deadline;
    private boolean isCompleted;

  public Task(String description, LocalDate deadline, String priority) {
        this.id = idCounter++;
        this.description = description;
        this.deadline = deadline;
        this.priority = priority;
        this.isCompleted = false;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
  
    public LocalDate getDeadline() {
        return deadline;
    }
    public boolean isCompleted() {
        return isCompleted;
    }
    public String getPriority() {
        return priority; // Getter for priority
    }

    public void markAsCompleted() {
        this.isCompleted = true;
        System.out.println("Task ID " + id + " marked as completed.");
    }

    @Override
    public String toString() {
        return "Task ID: " + id + 
                + ", Description: " + description
                + ", Deadline: " + deadline 
                + ", Completed: " + (isCompleted ? "Yes" : "No")
                + ", Priority: " + priority;
    }
}

