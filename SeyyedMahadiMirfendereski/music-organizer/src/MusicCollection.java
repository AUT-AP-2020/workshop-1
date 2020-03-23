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
    // A player for the music files.
    private MusicPlayer player;
    private ArrayList<Music> favorite;
    /**
     * Create a MusicCollection
     */
    public MusicCollection()
    {
        files=new ArrayList<Music>();
        player=new MusicPlayer();
        favorite=new ArrayList<Music>();
    }

    /**
     * Add a file to the collection.
     * @param music The file to be added.
     */

    public void addFileToFavorite(Music music){
        favorite.add(music);
    }
    public void removeFileToFavorite(Music music){
        favorite.remove(music);
    }
    // because we have private array list
    public Music getFavorite(int index){
        return favorite.get(index);
    }
    // because we have private array list
    public Music getMusic(int index){
        return files.get(index);
    }
    public void addFile(Music music)
    {
        files.add(music);
    }
    public void search(String s){
        for (Music m:files) {
            if(s.equals(m.getAddress()) || s.equals(m.getArtist()))
                System.out.println(m);
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
    public void printFavorite(){
        for (Music m:favorite)
                System.out.println(m);

    }
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(validIndex(index))
            System.out.println(files.get(index));
    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        for (Music s: files) {
            System.out.println(s);
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
        if(index<files.size() && index>-1){
            System.out.println("Valid");
            return true ;
        }
        System.out.println("Invalid");
        return false ;
    }
}