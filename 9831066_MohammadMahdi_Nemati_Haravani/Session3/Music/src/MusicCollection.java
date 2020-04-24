import java.util.ArrayList;
/**
 * A class to hold details of audio files.
 *
 * @author David J. Barnes and Michael K�lling
 * @version 2011.07.31
 */
public class MusicCollection {

    // An ArrayList for storing the file names of music files.
    private ArrayList<Music> files;
    // An ArrayList for favorite files
    private ArrayList<Music> listFavorite;
    // A player for the music files.
    private MusicPlayer player;
    // An name for collection;
    private final String nameOfCollection;

    /**
     * Create a MusicCollection
     * @param nameOfCollection set name of collection
     */
    public MusicCollection(String nameOfCollection)
    {
        this.nameOfCollection = nameOfCollection;
        files = new ArrayList<>();
        player = new MusicPlayer();
        listFavorite = new ArrayList<>();
    }

    /**
     * Add a file to the collection.
     * @param fileMusic The file to be added to files.
     */
    public void addFileMusic(Music fileMusic)
    {
        files.add(fileMusic);
    }

    /**
     * Add a file to the collection.
     * @param favoriteFileMusic The favorite file to be added to files.
     */
    public void addFileMusicToFavoriteFiles(Music favoriteFileMusic)
    {
        listFavorite.add(favoriteFileMusic);
    }

    /**
     * Add a file to the collection.
     * @param targetFileMusic The favorite file to be added to files.
     */
    public void removeFavoriteFiles(Music targetFileMusic)
    {
        listFavorite.remove(targetFileMusic);
    }

    /**
     * Show a list of all the favorite files in the collection.
     */
    public void listAllFavoriteFiles()
    {
        for (Music navigator : listFavorite) {
            navigator.print();
        }
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
        if (validIndex(index))
            files.get(index).print();
    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        for (Music navigator : files) {
            navigator.print();
        }
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFileMusic(int index)
    {
        if (validIndex(index))
            files.remove(index);
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        if (validIndex(index))
            player.startPlaying(files.get(index).getNameOfMusic());
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
        return index >= 0 && index < files.size();
    }

    /**
     *
     * @param targetName will be searched in the list of strings
     *                in the name & address & singer
     */
    public void searchMusic(String targetName) {
        for (Music navigator : files)
            if (navigator.getAddress().equals(targetName) || navigator.getNameOfMusic().equals(targetName) || navigator.getSingerOfMusic().equals(targetName))
                navigator.print();
    }
}