package src.org.howard.edu.lsp.midterm.question5;
/**
 * Music is a Class for streaming music. Music objects are created with a title.
 * Music can play, pause and stop
 * Music can be added to a playlist
 */
public class Music implements StreamingMMA {
    private String title;

    // Constructor
    public Music(String title) {
        this.title = title;
    }

    // Implement common behaviors
    @Override
    public void play() {
        System.out.println("Playing music: " + title);
    }

    @Override
    public void pause() {
        System.out.println("Paused music: " + title);
    }

    @Override
    public void stop() {
        System.out.println("Stopped music: " + title);
    }

    // Unique behavior for Music
    public void addToPlaylist(String playlistName) {
        System.out.println("Added " + title + " to " + playlistName + " playlist");
    }
}