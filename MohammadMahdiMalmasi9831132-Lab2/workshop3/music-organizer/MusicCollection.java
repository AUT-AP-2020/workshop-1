import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael K�lling
 * @version 2011.07.31
 */
public class MusicCollection
{
    // An ArrayList for storing the music files.
    private ArrayList<Music> files;

    // A player for the music files.
    private MusicPlayer player;

    // list of the client favourites
    private ArrayList<Music> favourites;
        

    /**
     * Create a MusicCollection
     */
    public MusicCollection()
    {
        favourites = new ArrayList<Music>();
        player = new MusicPlayer();
        files = new ArrayList<Music>();
    }


    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        files.size();
    }


    /**
     * Add a music file to the collection.
     * @param musicToAdd The music file to be added.
     */
    public void addFile(Music musicToAdd)
    {
        files.add(musicToAdd);
    }
    
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if (validIndex(index))
        {
            files.remove(index);
        }
    }


    /**
     * Add a music to favourites list
     * 
     * @param index The index of the music in files, to be added;
     */
    public void addFavourite(int index)
    {
        if (validIndex(index))
        {
            favourites.add(files.get(index));
        }
    }


    /**
     * Add a music to favourites list
     * 
     * @param index The index of the music in files, to be removed;
     */
    public void removeFavourite(int index)
    {
        if(validIndex(index,favourites))
        {
            favourites.remove(index);
        }
    }


    /**
     * Show list of favourites in standard output(terminal)
     */
    public void listFavourites()
    {
        System.out.println("favourite musics: ");

        int i = 0;
        for (Music music : favourites)
        {
            System.out.print("\t" + i + ". ");
            music.print();
        }
    }


    /**
     * Search for a music by name and its Artist
     * 
     * @param musicName : the name of the music
     * @param artistName : the name of music's artist
     */
    public void searchForMusic(String musicName, String artistName)
    {
        System.out.println("founded musics:");

        int i = 0; 
        String name, artist;
        for(Music music : files)
        {
            name = music.getName();
            artist = music.getSinger();

            if (name.contains(attribute) && artist.contains(attribute))
            {
                System.out.print("\t" + i + ". ");
                music.print();
                i++;
            }
        }
    }
    

    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if (validIndex(index))
        {
            files.get(index).print();
        }
    }
    

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        System.out.println("List of musics of this Collection:");

        int i = 0;
        for (Music music : files) 
        {
            System.out.print(i + ". ");
            music.print();
            i++;
        }
    }
    


    
    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        if (validIndex(index))
        {
            player.startPlaying(files.get(index).getName());
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
        if (index >= 0 && index < files.size())
        {
            return true;
        }


    //  else

        System.out.println("<@ ! list index out of range ! @>");
        return false;
    }
}