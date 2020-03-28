import java.util.ArrayList;

/**
 * A class to manege series of music files.
 *
 * @author Amirreza Hashemi
 * @version 1.0
 */
public class MusicCollection
{
    // An ArrayList for storing the music files.
    private ArrayList<Music> files;
    // An ArrayList for storing the favourite music files.
     private ArrayList<Music> favouriteFiles;
    // A player for the music files.
    private MusicPlayer player;
    // A name for music collection
    private String name;

    /**
     * Create a MusicCollection with given name
     *
     * @param name the name
     */
    public MusicCollection(String name)
    {
        files = new ArrayList<Music>();
        favouriteFiles = new ArrayList<Music>();
        player = new MusicPlayer();
        this.name = name;
    }

    /**
     * Add a file to the collection.
     *
     * @param file The file to be added.
     */
    public void addFile(Music file)
    {
        if (files.contains(file))
            System.out.println("Already exists");
        files.add(file);
    }

    /**
     * Return the number of files in the collection.
     *
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }

    /**
     * Add a music file to favourite's list.
     *
     * @param musicToAdd the music to add
     */
    public void addFavourite(Music musicToAdd) {
        if (files.contains(musicToAdd)) {
            if (favouriteFiles.contains(musicToAdd))
                System.out.println("Already in Favourites");
            else
                favouriteFiles.add(musicToAdd);
        } else
            System.out.println("Dos'nt exist");
    }

    /**
     * Remove a music file from favourite's list.
     *
     * @param musicToRemove the music to remove
     */
    public void removeFavourite(Music musicToRemove)
    {
        if (!favouriteFiles.contains(musicToRemove))
            System.out.println("Dos'nt exist");
        else
            favouriteFiles.remove(musicToRemove);
    }

    /**
     * Print favourite's music.
     */
    public void printFavourite()
    {
        System.out.println("Favourite musics :");
        for (Music music: favouriteFiles)
        {
            music.print();
        }
    }

    /**
     * List a file from the collection.
     *
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if (validIndex(index))
        files.get(index).print();
        else
            System.out.println("Invalid index");
    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        System.out.println("Musics :");

        for (Music file : files) {
            file.print();
        }

    }

    /**
     * Remove a file from the collection.
     *
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if (validIndex(index))
        files.remove(index);
        else
            System.out.println("Dos'nt exist");

    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     *
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        if (validIndex(index))
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
     * Search for music file that have a same address or singer's name as input
     *
     * @param input the input
     */
    public void search (String input)
    {
        for (Music music: files
             ) {
            if (music.getAddress().equals(input) || music.getSingerName().equals(input))
                music.print();
        }
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
        return (index>=0 && index<files.size()) ;
    }
}