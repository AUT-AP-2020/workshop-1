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
    // A player for the music files.
    private MusicPlayer player;
    private String collectionName;

    /**
     * Create a MusicCollection
     */
    public MusicCollection(String name) {
        collectionName = name;
        files = new ArrayList<Music>();
        player = new MusicPlayer();
    }

    /**
     * Add a file to the collection.
     * 
     * @param music The file to be added.
     */
    public void addFile(Music music) {
        files.add(music);
    }

    /**
     * Return the number of files in the collection.
     * 
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles() {
        return files.size();
    }

    /**
     * List a file from the collection.
     * 
     * @param index The index of the file to be listed.
     */
    public void listFile(int index) {
        if (validIndex(index))
            files.get(index).print();
    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles() {
        for (Music k : files)
            k.print();
    }

    /**
     * Remove a file from the collection.
     * 
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index) {
        if (validIndex(index))
            files.remove(index);
    }

    /**
     * Start playing a file in the collection. Use stopPlaying() to stop it playing.
     * 
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index) {
        if(validIndex(index))
        player.startPlaying(files.get(index).getName());
    }

    /**
     * Stop the player.
     */
    public void stopPlaying() {
        player.stop();
    }

    /**
     * Determine whether the given index is valid for the collection. Print an error
     * message if it is not.
     * 
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index) {
        // The return value.
        // Set according to whether the index is valid or not.
        if (index >= 0 || index < files.size())
            return true;
        else
            return false;
    }

    public void likedMusic(int index){
        if(validIndex(index))
        files.get(index).setLikedMusic(0);
    }

    public void unlikeMusic(int index){
        if(validIndex(index)){
            files.get(index).setLikedMusic(-1);
        }
    }

    public void printLikedMusics(){
        for(Music k : files){
            if(k.getLikedMusic() == 0)
            k.print();
        }
    }

    public void searchMusic(String name) {
        for (Music tmp : files)
            if (tmp.getAddress().contains(name) || tmp.getName().contains(name) || tmp.getSingerName().contains(name))
                tmp.print();
    }

}