import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicCollection
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<Music> files;
    // An ArrayList for favorite music
    private ArrayList<Music> favorite;
    // A player for the music files.
    private MusicPlayer player;
        
    /**
     * Create a MusicCollection
     */
    public MusicCollection()
    {
        files = new ArrayList<Music>();
        favorite = new ArrayList<Music>();
        player = new MusicPlayer();
    }
    
    /**
     * Add a file to the collection.
     * @param music The file to be added.
     */
    public void addFile(Music music)
    {
        int j = 0;
        for (int i = 0; i <files.size();i++)
        {
            if (files.get(i).getAddress().equals(music.getAddress()))
                j = j + 1;
        }
        if ( j == 0)
            files.add(music);
    }
    /**
     * Add a file to the favoritecollection.
     * @param music The file to be added.
     */
    public void addFavorite(Music music)
    {
        int j = 0;
        for (int i = 0; i <favorite.size();i++)
        {
            if (favorite.get(i).getAddress().equals(music.getAddress()))
                j = j + 1;
        }
        if ( j == 0)
            favorite.add(music);
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
        if (index > 0 && index < files.size())
            files.get(index).print();
    }
    /**
     * List a file from the favorite collection.
     * @param index The index of the file to be listed.
     */
    public void listFavorite(int index)
    {
        if (index > 0 && index < favorite.size())
            favorite.get(index).print();
    }


    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        for (int index = 0;index<files.size();index++) {
            System.out.println(index);
            files.get(index).print();
        }
    }
    /**
     * Show a list of all the favorite in the collection.
     */
    public void listAllFavorite()
    {
        for (int index = 0;index<favorite.size();index++) {
            System.out.println(index);
            favorite.get(index).print();
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if (index < files.size() && index > 0)
        files.remove(index);
    }
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removefavorite(int index)
    {
        if (index < favorite.size() && index > 0)
            favorite.remove(index);
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        player.stop();
        player.startPlaying(files.get(index));
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
       return index>0 && index<files.size();
    }
    private void search(String s)
    {
        for (int i = 0 ; i < files.size();i++) {
            if (files.get(i).getAddress().contains(s))
            {
                files.get(i).print();
            }
            if (files.get(i).getSinger().contains(s))
            {
                files.get(i).print();
            }
        }
    }
}