import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 *
 * @author David J. Barnes and Michael Kِlling
 * @version 2011.07.31
 */
public class MusicCollection
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<Music> musics;
    // A player for the music files.
    private MusicPlayer player;

    private ArrayList<Music> favorites;

    /**
     * Create a MusicCollection
     */
    public MusicCollection()
    {
        musics = new ArrayList<Music>();
        favorites = new ArrayList<Music>();
        player = new MusicPlayer();
    }

    /**
     * Add a file to the collection.
     */
    public void addFile(Music music)
    {
        musics.add(music);
    }

    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return musics.size();
    }

    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(validIndex(index))
            System.out.println(musics.get(index));
    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        for(Music m : musics)
            System.out.println(m);
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        musics.remove(index);
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        if(validIndex(index))
            player.startPlaying(musics.get(index));
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }

    public void addToFavorites(int index){
        if(validIndex(index))
            favorites.add(musics.get(index));
    }

    public void removeFromFavorites(int index){
        if(validIndex(index)){
            favorites.remove(musics.get(index));
        }
    }

    public void listFavorites(){
        for(Music m : favorites)
            System.out.println(m);
    }

    public void search(String s){
        for(Music m : musics)
            if(m.getFilename() == s || m.getSinger() == s)
                System.out.println(m);
    }

    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index)
    {
        return index >= 0 && index < musics.size();
        // The return value.
        // Set according to whether the index is valid or not.
    }
}
