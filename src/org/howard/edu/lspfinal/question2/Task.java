package src.org.howard.edu.lspfinal.question2;

/**
 * Represents a task in the TaskManager system.
 * Each task has a unique name, priority level, and status.
 */
public class Task {
    private String name;
    private int priority;
    private String status;
    
    /**
     * Constructs a new Task with the specified name, priority, and status.
     * 
     * @param name     The unique name of the task
     * @param priority The priority level of the task (lower number = higher priority)
     * @param status   The current status of the task ("TODO", "IN_PROGRESS", or "DONE")
     */
    public Task(String name, int priority, String status) {
        this.name = name;
        this.priority = priority;
        this.status = status;
    }
    
    /**
     * Returns the name of the task.
     * 
     * @return The task name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Returns the priority level of the task.
     * 
     * @return The task priority
     */
    public int getPriority() {
        return priority;
    }
    
    /**
     * Returns the current status of the task.
     * 
     * @return The task status
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * Sets the status of the task.
     * 
     * @param status The new status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * Returns a string representation of the task.
     * 
     * @return A string in the format "Task{name='taskName', priority=priorityValue, status='taskStatus'}"
     */
    @Override
    public String toString() {
        return "Task{name='" + name + "', priority=" + priority + ", status='" + status + "'}";
    }
}