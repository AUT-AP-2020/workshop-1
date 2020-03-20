import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 *
 * @author David J. Barnes and Michael K�lling
 * @version 2011.07.31
 */
public class MusicCollection
{
    // An ArrayList for storing the songs of a collection.
    private ArrayList<Song> songs;
    // A player for the music files.
    private MusicPlayer player;
    // name of this collection
    private String name;


    /**
     * Create a MusicCollection
     */
    public MusicCollection()

    {
        songs = new ArrayList<Song>();
        player = new MusicPlayer();
        name = "collection";
    }


    /**
     * constructor for the MusicCollection with multiple songs addition.
     * if a song is already in collection , it would print a message.
     * @param name name of collection
     * @param songs multiple songs to be added.
     */
    public MusicCollection(String name,Song... songs)
    {
        this.songs = new ArrayList<Song>();
        for(Song tempSong : songs) {
            if ( !this.songs.contains(tempSong) )
                this.songs.add(tempSong);
            else
                System.out.println("this file is already in this collection.");
        }
        player = new MusicPlayer();
        this.name = name;
    }


    /**
     * Add a file to the collection and print once it happen . also if the song has been already in
     * collection it would print a message.
     * @param song The song to be added.
     */
    public void addSong(Song song)
    {
        if( !songs.contains(song)) {
            songs.add(song);
            System.out.println("song added successfully.");
        }
        else
            System.out.println("this song is already in the collection.");
    }



    /**
     * List a song from the collection.
     * @param index The index of the song to be listed.
     */
    public void listSong(int index)
    {
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy.MM.dd");
        System.out.println("file: " + songs.get(index).getFile() + " | " +
                           "singer: " + songs.get(index).getSinger() + " | " +
                           "release date: " + formatDate.format( songs.get(index).getReleaseDate() ) );
    }

    /**
     * Show a list of all the songs in the collection.
     */
    public void listAllSongs()
    {
        for(int i = 0; i < songs.size(); i++) {
            System.out.print((i+1) + "- ");
            listSong(i);
        }
    }

    /**
     * Remove a song from the collection.
     * @param index The index of the song to be removed and print a message once it done.
     */
    public void removeSong(int index)
    {
        if( validIndex(index) ) {
            System.out.println(songs.get(index).getFile() + " deleted");
            songs.remove(index);
        }
    }


    /**
     * search for a song by its singer or file name( song name).
     * print all songs matched with the given name with their number in main list of songs.
     * @param name a part or full name of singer or song to be searched.
     */
    public void searchSong(String name)
    {
        for(int i=0; i<songs.size(); i++)
            if(songs.get(i).getFile().contains(name) || songs.get(i).getSinger().contains(name))
            {
                System.out.print((i+1) + "- ");
                listSong(i);

            }
    }

    /**
     * Start playing a file in the collection. also stop playing last song and prints message.
     * @param index The index of the song to be played.
     */
    public void startPlaying(int index)
    {
        if( validIndex(index) ) {

               stopPlaying();
                player.startPlaying( songs.get(index).getFile() );

        }
    }

    /**
     * Stop the player and print a message.
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
        if(index >= 0 && index < songs.size())
            return true;
        else
        {
            System.out.println("not valid number as index");
            return false;
        }
    }

    ////////////////////////////////////////////////////////////
    /// setters and getters
    ////////////////////////////////////////////////////////////

    /**
     * simple getter for name of collection.
     * @return String: name of collection.
     */
    public String getName() {
        return name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    /**
     * Return the number of songs in the collection.
     * @return int: The number of songs in the collection.
     */
    public int getNumberOfSongs()
    {
        return songs.size();
    }

}

