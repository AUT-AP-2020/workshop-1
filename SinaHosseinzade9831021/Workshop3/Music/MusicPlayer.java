

/**
 * Provide basic playing of MP3 files via the javazoom library.
 *
 *
 * @author Sina
 * @version 1.1
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
     * @param name The file to be played.
     */
    public void startPlaying(String name)
    {
        System.out.println(name + " is playing...");
        isPlaying = true;
    }

    public void stop()
    {
        System.out.println("the music is stopped!");
        isPlaying = false;
    }



}