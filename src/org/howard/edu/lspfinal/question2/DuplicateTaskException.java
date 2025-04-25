package src.org.howard.edu.lspfinal.question2;

/**
 * Exception thrown when attempting to add a task with a name that already exists in the TaskManager.
 */
public class DuplicateTaskException extends Exception {
    
    /**
     * Constructs a new DuplicateTaskException with the specified error message.
     * 
     * @param message The error message
     */
    public DuplicateTaskException(String message) {
        super(message);
    }
}