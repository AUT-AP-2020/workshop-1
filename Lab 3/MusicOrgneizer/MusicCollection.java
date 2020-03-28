package myPack;

import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael K�lling
 * @version 2011.07.31
 */
public class MusicCollection
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<Music> files;
    //An ArrayList for storing the like files
    private ArrayList<Music> likedFiles;
    //The the of the category
    private String collectionName;
    // A player for the music files.
    private MusicPlayer player;
        
    /**
     * Create a MusicCollection
     */
    public MusicCollection(String collectionName)
    {
        this.collectionName = collectionName;
        files = new ArrayList<Music>();
        likedFiles = new ArrayList<Music>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(Music musicFile)
    {
        files.add(musicFile);
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
            files.get(index).print();
    }
    
    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        for(Music i : files)
            i.print();
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
     * add a file to our liked list
     * @param index The index of the file to be added.
     */
    public void likeFile(int index){
        if(validIndex(index)){
            Music temp = files.get(index);
            likedFiles.add(temp);
        }
    }

    /**
     * remove a file from liked list
     * @param index The index of the file in liked list
     */
    public void dislikeFile(int index){
        if(index > -1 && index < likedFiles.size()){
            likedFiles.remove(index);
        }
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        if(validIndex(index)){
            player = new MusicPlayer();
            player.startPlaying(files.get(index).getAddress());
        }
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
        // The return value.
        // Set according to whether the index is valid or not.
       if(index < 0 || index >= files.size())
           return false;
       else
           return true;
    }

    /**
     * to show the liked files list
     */
    public void printLikedList(){
        for(Music i : likedFiles)
            i.print();
    }

    /**
     * to search for an input in whole files
     * @param input The string we look for
     */
    public void search(String input){
        for(Music i : files){
            if(i.getAddress().contains(input) || i.getSinger().contains(input))
                i.print();
        }
    }
}