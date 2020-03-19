import java.util.ArrayList;
import java.util.Iterator;

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
    // A player for the music files.
    private MusicPlayer player;
    // An ArrayList for the favorite musics
    private ArrayList<Music> favorites;
    /**
     * Create a MusicCollection
     */
    public MusicCollection()
    {
        files = new ArrayList<Music>();
        player = new MusicPlayer();
        favorites = new ArrayList<Music>();
    }

    /**
     * Add a file to the collection.
     * @param music The file to be added.
     */
    public void addFile(Music music)
    {
        files.add(music);
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
        System.out.println("The address of the music: " + files.get(index).getAddress());
        System.out.println("The artist: " + files.get(index).getArtist());
        System.out.println("The production year: " + files.get(index).getYear());
        System.out.println("==================================================");
    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        Iterator<Music> it = files.iterator();
        while (it.hasNext()){
            Music music = it.next();
            System.out.println("The address of the music: " + music.getAddress());
            System.out.println("The artist: " + music.getArtist());
            System.out.println("The production year: " + music.getYear());
            System.out.println("=============================================");
        }
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        files.remove(index);
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        player.startPlaying(files.get(index).getAddress());
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
        if ( index < files.size() && index > -1)
            return true;
        return false;
    }

    /**
     * This method searches between the music collection
     * based on the address and artist
     *
     * @param searchPhrase The string to be searched
     */
    public void Search(String searchPhrase) {
        int counter = 0;
        System.out.println("Result: ");
        for (Music music : files) {
            if (music.getAddress() == searchPhrase || music.getArtist() == searchPhrase) {
                System.out.println("Music has found!");
                this.listFile(counter);
            }
            counter++;
        }
        if ( counter == 0)
            System.out.println("Not found");
    }

    /**
     * This method adds music to the favorite musics list
     *
     * @param music The music to add the list
     */
    public void addFavoriteMusic(Music music){
        favorites.add(music);
    }

    /**
     * This method remove the music from the favorite list
     * @param index The music to be removed
     */
    public void removeFromFavorite(int index) {
        favorites.remove(index);
    }

    /**
     * This method lists all favorite music
     */
    public void listFavorites() {
        System.out.println("List of favorite musics: \n");
        Iterator<Music> it = favorites.iterator();
        while (it.hasNext()){
            Music music = it.next();
            System.out.println("The address of the music: " + music.getAddress());
            System.out.println("The artist: " + music.getArtist());
            System.out.println("The production year: " + music.getYear());
            System.out.println("=============================================");
        }
    }
}
