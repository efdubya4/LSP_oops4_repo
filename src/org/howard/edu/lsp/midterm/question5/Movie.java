package src.org.howard.edu.lsp.midterm.question5;
/**
 * Movie is a Class for streaming Movies. Movie objects are created with a title.
 * Movies can play, pause and stop
 * Movies can be rewound by a number of seconds
 */
public class Movie implements StreamingMMA {
    private String title;

    // Constructor
    public Movie(String title) {
        this.title = title;
    }

    // Implement common behaviors
    @Override
    public void play() {
        System.out.println("Playing movie: " + title);
    }

    @Override
    public void pause() {
        System.out.println("Paused movie: " + title);
    }

    @Override
    public void stop() {
        System.out.println("Stopped movie: " + title);
    }

    // Unique behavior for Movie
    public void rewind(int seconds) {
        System.out.println("Rewinding movie: " + title + " by " + seconds + " seconds");
    }
}