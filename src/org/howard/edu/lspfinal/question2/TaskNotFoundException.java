package src.org.howard.edu.lspfinal.question2;

/**
 * Exception thrown when attempting to access or modify a task that doesn't exist in the TaskManager.
 */
public class TaskNotFoundException extends Exception {
    
    /**
     * Constructs a new TaskNotFoundException with the specified error message.
     * 
     * @param message The error message
     */
    public TaskNotFoundException(String message) {
        super(message);
    }
}