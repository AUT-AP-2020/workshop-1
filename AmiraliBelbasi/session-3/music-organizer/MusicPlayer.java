/**
 * Provide basic playing of MP3 files via the javazoom library. See
 * http://www.javazoom.net/
 * 
 * @author David J. Barnes and Michael Kolling.
 * @version 2011.07.31
 */
public class MusicPlayer {
    // The current player. It might be null.
    private boolean isPlaying;

    /**
     * Constructor for objects of class MusicFilePlayer
     */
    public MusicPlayer() {
        isPlaying = false;
    }

    /**
     * Start playing the given audio file. The method returns once the playing has
     * been started.
     * 
     * @param filename The file to be played.
     */
    public void startPlaying(Music music) {
        System.out.println(music.getMusicAddress() + " is playing...");
        isPlaying = true;
    }

    public void stop() {
        if (isPlaying) {
            System.out.println("player is stopped!");
            isPlaying = false;
        } else {
            System.out.println("no song is playing");
        }
    }

}