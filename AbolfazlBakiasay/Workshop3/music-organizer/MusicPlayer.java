

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
        setPlaying(false);
    }
    

    /**
     * Start playing the given audio file.
     * The method returns once the playing has been started.
     * @param track The track file to be played.
     */
    public void startPlaying(Music track)
    {
        System.out.println(track.getAddress() + " is playing...");
		setPlaying(true);
    }
    
    /**
     * Stops the player.
     */
    public void stop()
    {
        System.out.println("player is stopped!");
		setPlaying(false);
    }


    /**
     * 
     * @return true if the player is playing, otherwise false.
     */
	public boolean isPlaying() {
		return isPlaying;
	}


	private void setPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}
    
    

}