package src.org.howard.edu.lsp.midterm.question5;
/**
 * Streaming MMA is an interface for streaming Media types. Supported types are 
 * Movies
 * Music
 * Audiobooks
 */
public interface StreamingMMA {
        // Common behaviors for all media types
        void play();
        void pause();
        void stop();
    }