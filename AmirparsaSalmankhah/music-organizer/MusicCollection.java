package com.amirparsa.salmankhah;
import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kolling
 * @version 2011.07.31
 */
public class MusicCollection
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<Music> files;
    // A player for the music files.
    private MusicPlayer player;
        
    /**
     * Create a MusicCollection
     */
    public MusicCollection()
    {
        files = new ArrayList<Music>();
        player = new MusicPlayer();
    }
    
    /**
     * Add a file to the collection.
     * @param file The file to be added.
     */
    public void addFile(Music file)
    {
        files.add(file);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(validIndex(index))
           System.out.println("Name: " + files.get(index).getName() + "Singer: " + files.get(index).getSinger() + "Production Year: " + files.get(index).getProductYear());
    }
    
    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        int index=0;
        for(Music music : files){
            System.out.printf("%d) ", index);
            System.out.println("Name: " + music.getName() + "Singer: " + music.getSinger() + "Production Year: " + music.getProductYear());
            index++;
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index))
            files.remove(index);
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        if(validIndex(index))
            player.startPlaying(files.get(index).getName());
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }


    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index)
    {
        if(index>=0 && index<files.size())
            return true;
        System.out.println("ERROR: List index out of range");
        return false;
    }
}