

/**
 * Provide basic playing of MP3 files via the javazoom library.
 * See http://www.javazoom.net/
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2011.07.31
 */
public class MusicPlayer
{
    // The current player. It might be null.
    private boolean isPlaying;
    /**
     * Constructor for objects of class MusicFilePlayer
     */
    public MusicPlayer()
    {
        isPlaying = false;
    }
    

    /**
     * Start playing the given audio file.
     * The method returns once the playing has been started.
     * @param music The file to be played.
     */
    public void startPlaying(Music music)
    {
        System.out.println(music.getAddress() + " is playing...");
		isPlaying = true;
    }

    /**
     * Stop playing the file is playing
     */
    public void stop()
    {
        System.out.println("player is stopped!");
		isPlaying = false;
    }
}