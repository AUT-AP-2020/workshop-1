package com.company;

/**
 * Provide basic playing of MP3 files via the javazoom library.
 * See http://www.javazoom.net/
 *
 * @author David J. Barnes and Michael K�lling.
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
     * @param filename The file to be played.
     */
    public void startPlaying(String filename)
    {
        System.out.println(filename + " is playing...");
        isPlaying = true;
    }

    /**
     * Stop playing the given audio file.
     * @param filename The file to be stopped.
     */
    public void stop(String filename)
    {
        System.out.println(filename + " is stopped!");
        isPlaying = false;
    }

    /**
     * If isPlaying is true
     * @return isPlaying to find out playing situation of the file
     */
    public boolean getIsplaying() {
        return isPlaying;
    }

}