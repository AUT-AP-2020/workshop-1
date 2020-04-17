package music;
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
    private ArrayList<SongInfo> files;
    // A player for the music files.
    private MusicPlayer player;
    // An ArrayList for favorite songs
    private ArrayList<SongInfo> favorite;

    /**
     * Create a MusicCollection
     */
    public MusicCollection( )
    {
        files = new ArrayList<SongInfo>();
        player = new MusicPlayer();
        favorite = new ArrayList<SongInfo>();
    }

    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(SongInfo filename)
    {
        files.add(filename);
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
        System.out.println("Name : " + files.get(index).getName() + " Singer : " + files.get(index).getSingerName()
        + " PublishYear : " + files.get(index).getPublishYear());
    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        if(files.size()!=0) {
            System.out.println("Here is all files :");
            for (SongInfo i : files) {
                System.out.print("Name : " + i.getName() + " Singer : "
                        + i.getSingerName() + " PublishYear : " + i.getPublishYear());
                System.out.println();
            }
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
        // The return value.
        // Set according to whether the index is valid or not.
        if(index > files.size() - 1){
            System.out.println("InValid Index");
            return false;
        }
        return true;
    }

    /**
     * it will add this song to favorite
     * @param song to add to favorite
     */
    public void addFavoriteSongs(String song){
        for (int i = 0; i < files.size() ; i++) {
            if(files.get(i).getName().equals(song)){
                favorite.add(files.get(i));
                return;
            }
        }
        System.out.println("No song with this name");
    }

    /**
     * remove from favorite song
     * @param song
     */
    public void removeFavoriteSongs(String song){
        Iterator<SongInfo> it = favorite.iterator();
        while (it.hasNext()){
            SongInfo songInfo = it.next();
            if(songInfo.getName().equals(song)){
                it.remove();
                return;
            }
        }
        System.out.println("No song with this name in favorite songs");
    }
    public void printFavoriteSongs() {
        if (favorite.size() != 0) {
            System.out.println("Favorite Songs :");
            for (SongInfo i : favorite) {
                System.out.print("Name : " + i.getName() + " Singer" +
                        " : "
                        + i.getSingerName() + " PublishYear : " + i.getPublishYear());
                System.out.println();
            }
        }
    }
}