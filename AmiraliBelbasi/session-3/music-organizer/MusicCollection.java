import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kolling
 * @version 2011.07.31
 */
public class MusicCollection {
    // An ArrayList for storing the musics.
    private ArrayList<Music> files;
    // A player for the music.
    private MusicPlayer player;

    /**
     * Create a MusicCollection
     */
    public MusicCollection() {
        files = new ArrayList<Music>();
        player = new MusicPlayer();
    }

    /**
     * Add a file to the collection.
     * 
     * @param filename The file to be added.
     */
    public void addFile(Music filename) {
        files.add(filename);
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
        if (validIndex(index)) {
            System.out.println(files.get(index).getMusicAddress());
        } else
            System.out.println("invalid index");
    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles() {
        for (Music i : files) {
            System.out.println(i.getMusicAddress());
        }
    }

    /**
     * Remove a file from the collection.
     * 
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index) {
        if (validIndex(index)) {
            files.remove(index);
        } else
            System.out.println("invalid index");
    }

    /**
     * Start playing a file in the collection. Use stopPlaying() to stop it playing.
     * 
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index) {
        if (validIndex(index)) {
            player.startPlaying(files.get(index));
        } else
            System.out.println("invalid index");
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
        if (index >= 0 && index < files.size())
            return true;
        return false;
    }

    /**
     * @return the files
     */
    public ArrayList<Music> getFiles() {
        return files;
    }

    /**
     * searching a collection for songs with given string
     */
    void searchSong(String str) {
        int counter = 0;
        for (Music i : files) {
            if (i.getMusicAddress().contains(str) || i.getMusicSinger().contains(str)) {
                System.out.println(i.getMusicAddress() + " by " + i.getMusicSinger());
                counter++;
            }
        }
        if (counter == 0)
            System.out.println("no such song matched!");
    }
}