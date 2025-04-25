package src.org.howard.edu.lspfinal.question2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Manages a collection of tasks with operations to add, retrieve, update, and view tasks.
 * Ensures task names are unique and handles status updates appropriately.
 */
public class TaskManager {
    private Map<String, Task> tasks;
    private static final String[] VALID_STATUSES = {"TODO", "IN_PROGRESS", "DONE"};
    
    /**
     * Constructs a new TaskManager with an empty task collection.
     */
    public TaskManager() {
        tasks = new HashMap<>();
    }
    
    /**
     * Adds a new task to the system.
     * 
     * @param name     The unique name of the task
     * @param priority The priority level of the task (lower number = higher priority)
     * @param status   The initial status of the task
     * @throws DuplicateTaskException If a task with the same name already exists
     */
    public void addTask(String name, int priority, String status) throws DuplicateTaskException {
        if (tasks.containsKey(name)) {
            throw new DuplicateTaskException("Task '" + name + "' already exists.");
        }
        
        Task newTask = new Task(name, priority, status);
        tasks.put(name, newTask);
    }
    
    /**
     * Retrieves a task by its name.
     * 
     * @param name The name of the task to retrieve
     * @return The requested task
     * @throws TaskNotFoundException If no task with the given name exists
     */
    public Task getTaskByName(String name) throws TaskNotFoundException {
        Task task = tasks.get(name);
        if (task == null) {
            throw new TaskNotFoundException("Task '" + name + "' not found.");
        }
        return task;
    }
    
    /**
     * Updates the status of an existing task.
     * 
     * @param name      The name of the task to update
     * @param newStatus The new status to set
     * @throws TaskNotFoundException If no task with the given name exists
     */
    public void updateStatus(String name, String newStatus) throws TaskNotFoundException {
        Task task = getTaskByName(name);
        task.setStatus(newStatus);
    }
    
    /**
     * Prints all tasks grouped by their status.
     */
    public void printTasksGroupedByStatus() {
        System.out.println("Tasks grouped by status:");
        
        Map<String, List<Task>> tasksByStatus = new HashMap<>();
        
        // Initialize the status lists
        for (String status : VALID_STATUSES) {
            tasksByStatus.put(status, new ArrayList<>());
        }
        
        // Group tasks by status
        for (Task task : tasks.values()) {
            String status = task.getStatus();
            List<Task> statusTasks = tasksByStatus.get(status);
            if (statusTasks != null) {
                statusTasks.add(task);
            }
        }
        
        // Print tasks by status
        for (String status : VALID_STATUSES) {
            List<Task> statusTasks = tasksByStatus.get(status);
            if (statusTasks != null && !statusTasks.isEmpty()) {
                System.out.println(status + ":");
                for (Task task : statusTasks) {
                    System.out.println("  " + task);
                }
            }
        }
    }
}