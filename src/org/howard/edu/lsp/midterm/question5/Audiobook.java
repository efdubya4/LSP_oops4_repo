package src.org.howard.edu.lsp.midterm.question5;
/**
 * Audiobook is a Class for streaming Audiobooks. Audiobook objects are created with a title.
 * Audiobooks can play, pause and stop
 * Audiobooks can be played at various playback speeds
 */
public class Audiobook implements StreamingMMA {
    private String title;

    // Constructor
    public Audiobook(String title) {
        this.title = title;
    }

    // Implement common behaviors
    @Override
    public void play() {
        System.out.println("Playing audiobook: " + title);
    }

    @Override
    public void pause() {
        System.out.println("Paused audiobook: " + title);
    }

    @Override
    public void stop() {
        System.out.println("Stopped audiobook: " + title);
    }

    // Unique behavior for Audiobook
    public void setPlaybackSpeed(double speed) {
        System.out.println("Setting playback speed of audiobook: " + title + " to " + speed + "x");
    }
}