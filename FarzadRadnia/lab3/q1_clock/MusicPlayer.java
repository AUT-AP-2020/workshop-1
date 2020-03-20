/**
 * Provide basic playing of MP3 files via the javazoom library.
 * See http://www.javazoom.net/
 *
 * @author David J. Barnes and Michael K�lling _ rewrite by farzad Radnia
 * @version 2020.11.2
 */
public class MusicPlayer
{
    //tell if this player is playing a song or not
    private boolean isPlaying;
    //the song which is playing in this player. if there is no song, it would be null.
    private String fileName;

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
     * @param fileName The file(song's name) to be played.
     */
    public void startPlaying(String fileName)
    {
        this.fileName = fileName;
        System.out.println(fileName + " is playing...");
        isPlaying = true;
    }

    /**
     * stop playing the song and print a message for it except when there is no song on play.
     */
    public void stop()
    {
        if(fileName != null)
            System.out.println(fileName + " is stopped!");
        fileName = null;
        isPlaying = false;
    }
}